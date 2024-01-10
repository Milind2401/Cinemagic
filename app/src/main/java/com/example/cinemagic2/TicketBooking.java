package com.example.cinemagic2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.SparseBooleanArray;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class TicketBooking extends AppCompatActivity {
    private SparseBooleanArray imageButtonStates = new SparseBooleanArray();
    private ArrayList<Integer> selectedSeats = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ticket_booking);

        Intent intent = getIntent();
        String Name = intent.getStringExtra("Movie Name");


        TextView displayMovieName = findViewById(R.id.textView9);
        displayMovieName.setText("Movie Name: " + Name);

        ImageButton plat1 = findViewById(R.id.plat1);
        ImageButton plat2 = findViewById(R.id.plat2);
        ImageButton plat3 = findViewById(R.id.plat3);
        ImageButton plat4 = findViewById(R.id.plat4);
        ImageButton plat5 = findViewById(R.id.plat5);
        ImageButton plat6 = findViewById(R.id.plat6);
        ImageButton plat7 = findViewById(R.id.plat7);
        ImageButton plat8 = findViewById(R.id.plat8);
        ImageButton plat9 = findViewById(R.id.plat9);
        ImageButton plat10 = findViewById(R.id.plat10);
        ImageButton plat11 = findViewById(R.id.plat11);
        ImageButton plat12 = findViewById(R.id.plat12);
        ImageButton plat13 = findViewById(R.id.plat13);
        ImageButton plat14= findViewById(R.id.plat14);
        ImageButton plat15= findViewById(R.id.plat15);
        ImageButton plat16= findViewById(R.id.plat16);
        ImageButton plat17= findViewById(R.id.plat17);
        ImageButton plat18= findViewById(R.id.plat18);
        ImageButton plat19= findViewById(R.id.plat19);
        ImageButton plat20= findViewById(R.id.plat20);
        ImageButton plat21= findViewById(R.id.plat21);
        ImageButton plat22= findViewById(R.id.plat22);

        ImageButton gold1=findViewById(R.id.gold1);
        ImageButton gold2=findViewById(R.id.gold2);
        ImageButton gold3=findViewById(R.id.gold3);
        ImageButton gold4=findViewById(R.id.gold4);
        ImageButton gold5=findViewById(R.id.gold5);
        ImageButton gold6=findViewById(R.id.gold6);
        ImageButton gold7=findViewById(R.id.gold7);
        ImageButton gold8=findViewById(R.id.gold8);
        ImageButton gold9=findViewById(R.id.gold9);
        ImageButton gold10=findViewById(R.id.gold10);
        ImageButton gold11=findViewById(R.id.gold11);
        ImageButton gold12=findViewById(R.id.gold12);
        ImageButton gold13=findViewById(R.id.gold13);
        ImageButton gold14=findViewById(R.id.gold14);
        ImageButton gold15=findViewById(R.id.gold15);
        ImageButton gold16=findViewById(R.id.gold16);
        ImageButton gold17=findViewById(R.id.gold17);
        ImageButton gold18=findViewById(R.id.gold18);
        ImageButton gold19=findViewById(R.id.gold19);
        ImageButton gold20=findViewById(R.id.gold20);
        ImageButton gold21=findViewById(R.id.gold21);
        ImageButton gold22=findViewById(R.id.gold22);
        ImageButton gold23=findViewById(R.id.gold23);
        ImageButton gold24=findViewById(R.id.gold24);
        ImageButton gold25=findViewById(R.id.gold25);
        ImageButton gold26=findViewById(R.id.gold26);
        ImageButton gold27=findViewById(R.id.gold27);
        ImageButton gold28=findViewById(R.id.gold28);
        ImageButton gold29=findViewById(R.id.gold29);
        ImageButton gold30=findViewById(R.id.gold30);

        ImageButton slvr1=findViewById(R.id.slvr1);
        ImageButton slvr2=findViewById(R.id.slvr2);
        ImageButton slvr3=findViewById(R.id.slvr3);
        ImageButton slvr4=findViewById(R.id.slvr4);
        ImageButton slvr5=findViewById(R.id.slvr5);
        ImageButton slvr6=findViewById(R.id.slvr6);
        ImageButton slvr7=findViewById(R.id.slvr7);
        ImageButton slvr8=findViewById(R.id.slvr8);
        ImageButton slvr9=findViewById(R.id.slvr9);
        ImageButton slvr10=findViewById(R.id.slvr10);
        ImageButton slvr11=findViewById(R.id.slvr11);
        ImageButton slvr12=findViewById(R.id.slvr12);
        ImageButton slvr13=findViewById(R.id.slvr13);
        ImageButton slvr14=findViewById(R.id.slvr14);
        ImageButton slvr15=findViewById(R.id.slvr15);
        ImageButton slvr16=findViewById(R.id.slvr16);
        ImageButton slvr17=findViewById(R.id.slvr17);
        ImageButton slvr18=findViewById(R.id.slvr18);
        ImageButton slvr19=findViewById(R.id.slvr19);
        ImageButton slvr20=findViewById(R.id.slvr20);
        ImageButton slvr21=findViewById(R.id.slvr21);
        ImageButton slvr22=findViewById(R.id.slvr22);
        ImageButton slvr23=findViewById(R.id.slvr23);
        ImageButton slvr25=findViewById(R.id.slvr25);


        imageButtonStates.put(plat1.getId(), false);
        imageButtonStates.put(plat2.getId(), false);
        imageButtonStates.put(plat3.getId(), false);
        imageButtonStates.put(plat4.getId(), false);
        imageButtonStates.put(plat5.getId(), false);
        imageButtonStates.put(plat6.getId(), false);
        imageButtonStates.put(plat7.getId(), false);
        imageButtonStates.put(plat8.getId(), false);
        imageButtonStates.put(plat9.getId(), false);
        imageButtonStates.put(plat10.getId(), false);
        imageButtonStates.put(plat11.getId(), false);
        imageButtonStates.put(plat12.getId(), false);
        imageButtonStates.put(plat13.getId(), false);
        imageButtonStates.put(plat14.getId(), false);
        imageButtonStates.put(plat15.getId(), false);
        imageButtonStates.put(plat16.getId(), false);
        imageButtonStates.put(plat17.getId(), false);
        imageButtonStates.put(plat18.getId(), false);
        imageButtonStates.put(plat19.getId(), false);
        imageButtonStates.put(plat20.getId(), false);
        imageButtonStates.put(plat21.getId(), false);
        imageButtonStates.put(plat22.getId(), false);

        imageButtonStates.put(gold1.getId(),false);
        imageButtonStates.put(gold2.getId(),false);
        imageButtonStates.put(gold3.getId(),false);
        imageButtonStates.put(gold4.getId(),false);
        imageButtonStates.put(gold5.getId(),false);
        imageButtonStates.put(gold6.getId(),false);
        imageButtonStates.put(gold7.getId(),false);
        imageButtonStates.put(gold8.getId(),false);
        imageButtonStates.put(gold9.getId(),false);
        imageButtonStates.put(gold10.getId(),false);
        imageButtonStates.put(gold11.getId(),false);
        imageButtonStates.put(gold12.getId(),false);
        imageButtonStates.put(gold13.getId(),false);
        imageButtonStates.put(gold14.getId(),false);
        imageButtonStates.put(gold15.getId(),false);
        imageButtonStates.put(gold16.getId(),false);
        imageButtonStates.put(gold17.getId(),false);
        imageButtonStates.put(gold18.getId(),false);
        imageButtonStates.put(gold19.getId(),false);
        imageButtonStates.put(gold20.getId(),false);
        imageButtonStates.put(gold21.getId(),false);
        imageButtonStates.put(gold22.getId(),false);
        imageButtonStates.put(gold23.getId(),false);
        imageButtonStates.put(gold24.getId(),false);
        imageButtonStates.put(gold25.getId(),false);
        imageButtonStates.put(gold26.getId(),false);
        imageButtonStates.put(gold27.getId(),false);
        imageButtonStates.put(gold28.getId(),false);
        imageButtonStates.put(gold29.getId(),false);
        imageButtonStates.put(gold30.getId(),false);


        imageButtonStates.put(slvr1.getId(),false);
        imageButtonStates.put(slvr2.getId(),false);
        imageButtonStates.put(slvr3.getId(),false);
        imageButtonStates.put(slvr4.getId(),false);
        imageButtonStates.put(slvr5.getId(),false);
        imageButtonStates.put(slvr6.getId(),false);
        imageButtonStates.put(slvr7.getId(),false);
        imageButtonStates.put(slvr8.getId(),false);
        imageButtonStates.put(slvr9.getId(),false);
        imageButtonStates.put(slvr10.getId(),false);
        imageButtonStates.put(slvr11.getId(),false);
        imageButtonStates.put(slvr12.getId(),false);
        imageButtonStates.put(slvr13.getId(),false);
        imageButtonStates.put(slvr14.getId(),false);
        imageButtonStates.put(slvr15.getId(),false);
        imageButtonStates.put(slvr16.getId(),false);
        imageButtonStates.put(slvr17.getId(),false);
        imageButtonStates.put(slvr18.getId(),false);
        imageButtonStates.put(slvr19.getId(),false);
        imageButtonStates.put(slvr20.getId(),false);
        imageButtonStates.put(slvr21.getId(),false);
        imageButtonStates.put(slvr22.getId(),false);
        imageButtonStates.put(slvr23.getId(),false);
        imageButtonStates.put(slvr25.getId(),false);


        View.OnClickListener commonOnClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int imageButtonId = v.getId();
                boolean currentState = imageButtonStates.get(imageButtonId, false);
                imageButtonStates.put(imageButtonId, !currentState);

                if (!currentState) {
                    // ImageButton is being selected
                    selectedSeats.add(imageButtonId);
                    v.setBackgroundColor(getResources().getColor(R.color.blue));
                } else {
                    // ImageButton is being deselected
                    selectedSeats.remove((Integer) imageButtonId);
                    v.setBackgroundColor(getResources().getColor(R.color.blue_grey));
                }
            }
        };
        plat1.setOnClickListener(commonOnClickListener);
        plat2.setOnClickListener(commonOnClickListener);
        plat3.setOnClickListener(commonOnClickListener);
        plat4.setOnClickListener(commonOnClickListener);
        plat5.setOnClickListener(commonOnClickListener);
        plat6.setOnClickListener(commonOnClickListener);
        plat7.setOnClickListener(commonOnClickListener);
        plat8.setOnClickListener(commonOnClickListener);
        plat9.setOnClickListener(commonOnClickListener);
        plat10.setOnClickListener(commonOnClickListener);
        plat11.setOnClickListener(commonOnClickListener);
        plat12.setOnClickListener(commonOnClickListener);
        plat13.setOnClickListener(commonOnClickListener);
        plat14.setOnClickListener(commonOnClickListener);
        plat15.setOnClickListener(commonOnClickListener);
        plat16.setOnClickListener(commonOnClickListener);
        plat17.setOnClickListener(commonOnClickListener);
        plat18.setOnClickListener(commonOnClickListener);
        plat19.setOnClickListener(commonOnClickListener);
        plat20.setOnClickListener(commonOnClickListener);
        plat21.setOnClickListener(commonOnClickListener);
        plat22.setOnClickListener(commonOnClickListener);

        gold1.setOnClickListener(commonOnClickListener);
        gold2.setOnClickListener(commonOnClickListener);
        gold3.setOnClickListener(commonOnClickListener);
        gold4.setOnClickListener(commonOnClickListener);
        gold5.setOnClickListener(commonOnClickListener);
        gold6.setOnClickListener(commonOnClickListener);
        gold7.setOnClickListener(commonOnClickListener);
        gold8.setOnClickListener(commonOnClickListener);
        gold9.setOnClickListener(commonOnClickListener);
        gold10.setOnClickListener(commonOnClickListener);
        gold11.setOnClickListener(commonOnClickListener);
        gold12.setOnClickListener(commonOnClickListener);
        gold13.setOnClickListener(commonOnClickListener);
        gold14.setOnClickListener(commonOnClickListener);
        gold15.setOnClickListener(commonOnClickListener);
        gold16.setOnClickListener(commonOnClickListener);
        gold17.setOnClickListener(commonOnClickListener);
        gold18.setOnClickListener(commonOnClickListener);
        gold19.setOnClickListener(commonOnClickListener);
        gold20.setOnClickListener(commonOnClickListener);
        gold21.setOnClickListener(commonOnClickListener);
        gold22.setOnClickListener(commonOnClickListener);
        gold23.setOnClickListener(commonOnClickListener);
        gold24.setOnClickListener(commonOnClickListener);
        gold25.setOnClickListener(commonOnClickListener);
        gold26.setOnClickListener(commonOnClickListener);
        gold27.setOnClickListener(commonOnClickListener);
        gold28.setOnClickListener(commonOnClickListener);
        gold29.setOnClickListener(commonOnClickListener);
        gold30.setOnClickListener(commonOnClickListener);

        slvr1.setOnClickListener(commonOnClickListener);
        slvr2.setOnClickListener(commonOnClickListener);
        slvr3.setOnClickListener(commonOnClickListener);
        slvr4.setOnClickListener(commonOnClickListener);
        slvr5.setOnClickListener(commonOnClickListener);
        slvr6.setOnClickListener(commonOnClickListener);
        slvr7.setOnClickListener(commonOnClickListener);
        slvr8.setOnClickListener(commonOnClickListener);
        slvr9.setOnClickListener(commonOnClickListener);
        slvr10.setOnClickListener(commonOnClickListener);
        slvr11.setOnClickListener(commonOnClickListener);
        slvr12.setOnClickListener(commonOnClickListener);
        slvr13.setOnClickListener(commonOnClickListener);
        slvr14.setOnClickListener(commonOnClickListener);
        slvr15.setOnClickListener(commonOnClickListener);
        slvr16.setOnClickListener(commonOnClickListener);
        slvr17.setOnClickListener(commonOnClickListener);
        slvr18.setOnClickListener(commonOnClickListener);
        slvr19.setOnClickListener(commonOnClickListener);
        slvr20.setOnClickListener(commonOnClickListener);
        slvr21.setOnClickListener(commonOnClickListener);
        slvr22.setOnClickListener(commonOnClickListener);
        slvr23.setOnClickListener(commonOnClickListener);
        slvr25.setOnClickListener(commonOnClickListener);




        Button get_started=findViewById(R.id.paynow);
        get_started.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(selectedSeats.isEmpty()){
                    Toast.makeText(TicketBooking.this, "Select seat", Toast.LENGTH_SHORT).show();
                    return;
                }
                else{
                    Intent intent = getIntent();
                    String Name = intent.getStringExtra("Movie Name");
                    String Date = intent.getStringExtra("Date");
                    String Address = intent.getStringExtra("Address");
                    String language=intent.getStringExtra("Language");
                    String dim=intent.getStringExtra("Dimension");
                    Intent intent1=new Intent(TicketBooking.this,Payment.class);
                    intent1.putExtra("Date",Date);
                    intent1.putExtra("Movie Name",Name);
                    intent1.putExtra("Address",Address);
                    intent1.putExtra("Language",language);
                    intent1.putExtra("Dimension",dim);
                    intent1.putIntegerArrayListExtra("selectedSeats", selectedSeats);
                    startActivity(intent1);
                }

            }
        });

    }




}
