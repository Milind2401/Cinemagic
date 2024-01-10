package com.example.cinemagic2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.Spinner;

import java.util.ArrayList;

public class DateAddress extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_address);


        ArrayList<String> addressList = new ArrayList<>();
        addressList.add("INOX: Jaswant Multiplex, Nagpur");
        addressList.add("Cinepolis: VR Mall, Nagpur");
        addressList.add("MovieMax: Eternity, Nagpur");
        addressList.add("AM Cinema: Manish Nagar, Nagpur");

        Spinner spinner = findViewById(R.id.address);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.custom_spinner_item, addressList);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        Button select_seat=findViewById(R.id.submit);
        select_seat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = getIntent();
                String movieName = intent.getStringExtra("Movie Name");
                String language=intent.getStringExtra("Language");
                String dim=intent.getStringExtra("Dimension");
                Intent intent1 = new Intent(DateAddress.this,TicketBooking.class);
                DatePicker date=findViewById(R.id.date);
                Spinner add=findViewById(R.id.address);
                String year=String.valueOf(date.getYear());
                String month=String.valueOf(date.getMonth()+1);
                String day=String.valueOf(date.getDayOfMonth());
                String datestring="Date is"+day+"/"+month+"/"+year;
                String addData=add.getSelectedItem().toString();
                intent1.putExtra("Movie Name", movieName);
                intent1.putExtra("Date", datestring);
                intent1.putExtra("Address", addData);
                intent1.putExtra("Language",language);
                intent1.putExtra("Dimension",dim);
                startActivity(intent1);
            }
        });

    }

}