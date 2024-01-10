package com.example.cinemagic2;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class Cat4 extends Fragment {

    private Button sehezada;
    private Button dilwale;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_cat4, container, false);

        sehezada=view.findViewById(R.id.bookButtonsehezada);
        sehezada.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String movieName="Sehezada";
                String language="Hindi";
                String dim="2D";
                Intent intent=new Intent(getContext(),DateAddress.class);
                intent.putExtra("Movie Name",movieName);
                intent.putExtra("Language",language);
                intent.putExtra("Dimension",dim);
                startActivity(intent);
            }

        });
        dilwale=view.findViewById(R.id.bookDilwale);
        dilwale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String movieName="Dilwale";
                String language="Hindi";
                String dim="2D";
                Intent intent=new Intent(getContext(),DateAddress.class);
                intent.putExtra("Movie Name",movieName);
                intent.putExtra("Language",language);
                intent.putExtra("Dimension",dim);
                startActivity(intent);


            }

        });
        return view;


    }
}