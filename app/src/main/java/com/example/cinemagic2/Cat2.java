package com.example.cinemagic2;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class Cat2 extends Fragment {
    private Button phirHeraPheri;
    private Button fukrey;
    private Button hungama2;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view= inflater.inflate(R.layout.fragment_cat2, container, false);
        phirHeraPheri=view.findViewById(R.id.bookButtonPhirHeraPheri);
        phirHeraPheri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String movieName="Phir Hera Pheri";
                String language="Hindi";
                String dim="2D";
                Intent intent=new Intent(getContext(),DateAddress.class);
                intent.putExtra("Movie Name",movieName);
                intent.putExtra("Language",language);
                intent.putExtra("Dimension",dim);
                startActivity(intent);


            }

        });
        fukrey=view.findViewById(R.id.bookButtonFukrey);
        fukrey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String movieName="Fukrey";
                String language="Hindi";
                String dim="2D";
                Intent intent=new Intent(getContext(),DateAddress.class);
                intent.putExtra("Movie Name",movieName);
                intent.putExtra("Language",language);
                intent.putExtra("Dimension",dim);
                startActivity(intent);


            }

        });
        hungama2=view.findViewById(R.id.bookNowButton3);
        hungama2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String movieName="Hungama2";
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