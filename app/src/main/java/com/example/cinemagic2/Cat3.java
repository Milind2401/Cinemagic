package com.example.cinemagic2;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class Cat3 extends Fragment {

    private Button jawan;
    private Button pathan;
    private Button missionImpossible;
    private Button bloodyDaddy;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view= inflater.inflate(R.layout.fragment_cat3, container, false);
        jawan=view.findViewById(R.id.bookButtonJawan);
        jawan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String movieName="Jawan";
                String language="Hindi";
                String dim="2D/3D";
                Intent intent=new Intent(getContext(),DateAddress.class);
                intent.putExtra("Movie Name",movieName);
                intent.putExtra("Language",language);
                intent.putExtra("Dimension",dim);
                startActivity(intent);


            }

        });
        pathan=view.findViewById(R.id.bookButtonpathan);
        pathan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String movieName="Pathan";
                String language="Hindi";
                String dim="2D/3D";
                Intent intent=new Intent(getContext(),DateAddress.class);
                intent.putExtra("Movie Name",movieName);
                intent.putExtra("Language",language);
                intent.putExtra("Dimension",dim);
                startActivity(intent);


            }

        });
        missionImpossible=view.findViewById(R.id.bookMissionImpossible);
        missionImpossible.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String movieName="Mission Impossible";
                String language="English";
                String dim="2D/3D";
                Intent intent=new Intent(getContext(),DateAddress.class);
                intent.putExtra("Movie Name",movieName);
                intent.putExtra("Language",language);
                intent.putExtra("Dimension",dim);
                startActivity(intent);


            }

        });
        bloodyDaddy=view.findViewById(R.id.bookButtonbloodyDaddy);
        bloodyDaddy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String movieName="Bloody Daddy";
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