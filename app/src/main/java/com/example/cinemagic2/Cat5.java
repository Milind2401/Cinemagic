package com.example.cinemagic2;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class Cat5 extends Fragment {
    private Button theNun;
    private Button darkHarvest;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.fragment_cat5, container, false);
        theNun=view.findViewById(R.id.bookButtontheNun);
        theNun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String movieName="The Nun";
                String language="English";
                String dim="2D/3D";
                Intent intent=new Intent(getContext(),DateAddress.class);
                intent.putExtra("Movie Name",movieName);
                intent.putExtra("Language",language);
                intent.putExtra("Dimension",dim);
                startActivity(intent);


            }

        });
        darkHarvest=view.findViewById(R.id.bookdarkHarvest);
        darkHarvest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String movieName="Dark Harvest";
                String language="English";
                String dim="2D/3D";
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