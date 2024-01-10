package com.example.cinemagic2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

import com.example.cinemagic2.databinding.ActivityPaymentBinding;
import com.example.cinemagic2.ui.dashboard.CartItem;
import com.example.cinemagic2.ui.dashboard.CartManager;
import com.example.cinemagic2.ui.dashboard.DashboardFragment;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.Firebase;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
public class Payment extends AppCompatActivity {
    TextView textView;
    FirebaseAuth auth;
    FirebaseUser firebaseUser;
    FirebaseDatabase db;
    ActivityPaymentBinding binding;
    String firstname,lastname,username,moviename,price,moiveticketscount,email;
    DatabaseReference reference;
    ImageView profileimg;
    private NotificationManager mManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityPaymentBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        auth= FirebaseAuth.getInstance();

        //OnProfilePictureClick
        profileimg=findViewById(R.id.imageView4);
        profileimg.setOnClickListener(new View.OnClickListener() {
                                          @Override
                                          public void onClick(View v) {
                                              Intent intent = new Intent(getApplicationContext(), Profile.class);
                                              startActivity(intent);
                                              finish();
                                          }
        });



        Intent intent=getIntent();
        String Name = intent.getStringExtra("Movie Name");
        String TempDate = intent.getStringExtra("Date");
        String Date=removeDatePrefix(TempDate);
        String Address = intent.getStringExtra("Address");
        String Language=intent.getStringExtra("Language");
        String Dim=intent.getStringExtra("Dimension");
        ArrayList<Integer> selectedSeats=intent.getIntegerArrayListExtra("selectedSeats");
        double priceWithoutTax=0.00;
        int seatCount=selectedSeats.size();

        if(selectedSeats!=null){
            StringBuilder selectedSeatsText=new StringBuilder();
            for(Integer id:selectedSeats){
//                String name = idToNameMap.get(id);
                Resources resources= getResources();
                String name = resources.getResourceEntryName(id);
                if (name != null) {
                    if(name.substring(0,4).equals("plat")){
                        priceWithoutTax+=279;
                    }
                    else if(name.substring(0,4).equals("gold")){
                        priceWithoutTax+=219;
                    }
                    else if(name.substring(0,4).equals("slvr")){
                        priceWithoutTax+=179;
                    }
                } else {
                    // Handle the case when the string is null
                }

                selectedSeatsText.append(name).append(",");
            }
            double tax=priceWithoutTax*0.12;
            String formattedTax = String.format("%.2f", tax);
            double total=tax+priceWithoutTax;
            // Remove the trailing comma and space
            String idsToPrint = selectedSeatsText.toString().replaceAll(", $", "  ");
            // Display the selected IDs in a TextView
            TextView seats = findViewById(R.id.seats);
            seats.setText(idsToPrint);
            TextView price=findViewById(R.id.price);
            price.setText("₹ "+ String.valueOf(priceWithoutTax));
            TextView moviename = findViewById(R.id.moviename);
            moviename.setText(Name);
            TextView date = findViewById(R.id.date1);
            date.setText(Date);
            TextView address= findViewById(R.id.address);
            address.setText(Address);
            TextView lang=findViewById(R.id.language);
            lang.setText(Language);
            TextView dim=findViewById(R.id.dim);
            dim.setText(Dim);
            TextView count=findViewById(R.id.ticketCount);
            count.setText(String.valueOf(seatCount));
            TextView taxText=findViewById(R.id.tax);
            taxText.setText("₹ "+String.valueOf(formattedTax));
            Button pay=findViewById(R.id.pay);
            pay.setText("Pay ₹"+total);

            pay.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Users user=new Users();
                    firebaseUser=auth.getCurrentUser();
                    email=firebaseUser.getEmail();
                    String sanitizedEmail = email.replace(".", "_dot_")
                            .replace("#", "_hash_")
                            .replace("$", "_dollar_")
                            .replace("[", "_leftBracket_")
                            .replace("]", "_rightBracket_")
                            .replace("@", "_at_");
                    Movie movie=new Movie(Name,Date,Address,Language,idsToPrint,Dim,seatCount,total);
                    db=FirebaseDatabase.getInstance();
                    reference=db.getReference("Users");
                    reference.child(sanitizedEmail).child(Name).setValue(movie).addOnCompleteListener(new OnCompleteListener<Void>() {
                        @Override
                        public void onComplete(@NonNull Task<Void> task) {
                            // Check if the phone number is not empty
                            EditText editTextPhone = findViewById(R.id.phonenum);
                            String phoneNumber = editTextPhone.getText().toString();
                            if (!phoneNumber.isEmpty()) {
                                Toast.makeText(Payment.this, "Successully Booked", Toast.LENGTH_SHORT).show();

                                CartManager cartManager;
                                cartManager = CartManager.getInstance();
                                CartItem newItem = new CartItem(Name, idsToPrint,Date,Address,total);
                                cartManager.addToCart(newItem);

                                //Sms
                                // Message to send
                                String message = "Hello, this is your message!";

                                // Send the message
                                SmsManager smsManager=SmsManager.getDefault();
                                smsManager.sendTextMessage(phoneNumber,null,"You have successfully booked your ticket from CineMagic! Check out the app for more offers.",null,null);
                                //Notification
                                String messege="Your"+Name+"movie tickets on the date"+Date+"is booked";
                                showNotification("Ticked Booked!!!!!","You have successfully booked your ticket from CineMagic! Check out the app for more offers.");


                                Intent intent=new Intent(getApplicationContext(),MainActivity2.class);
                                startActivity(intent);
                                finish();

                            } else {
                                // Handle the case when the phone number is empty
                                Toast.makeText(Payment.this, "Please enter a phone number", Toast.LENGTH_SHORT).show();
                            }

                        }



                    });

                }
            });




        }
    }
    private String removeDatePrefix(String originalDate) {
        // Check if the originalDate starts with "Date is"
        if (originalDate.startsWith("Date is")) {
            // Remove the "Date is" prefix using substring
            return originalDate.substring("Date is".length()).trim();
        } else {
            // If the prefix is not present, return the original string
            return originalDate;
        }
    }
    private static final int NOTIFICATION_ID = 1;
    private static final String CHANNEL_ID = "MyChannel";

    private void showNotification(String title, String message) {
        NotificationManager notificationManager =
                (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            NotificationChannel channel = new NotificationChannel(
                    CHANNEL_ID,
                    "My Channel",
                    NotificationManager.IMPORTANCE_DEFAULT
            );
            notificationManager.createNotificationChannel(channel);
        }

        Intent intent = new Intent(this, MainActivity2.class);
        // Add any extras or data to the intent if needed

        PendingIntent pendingIntent = PendingIntent.getActivity(
                this,
                0,
                intent,
                PendingIntent.FLAG_IMMUTABLE | PendingIntent.FLAG_UPDATE_CURRENT
        );

        NotificationCompat.Builder builder = new NotificationCompat.Builder(this, CHANNEL_ID)
                .setContentTitle(title)
                .setContentText(message)
                .setSmallIcon(R.drawable.ic_launcher_foreground)
                .setContentIntent(pendingIntent);

        notificationManager.notify(NOTIFICATION_ID, builder.build());
    }


}

