package com.example.cinemagic2;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.cinemagic2.databinding.ActivityMain2Binding;

public class Cat1 extends Fragment {

private Button theNun;
private Button darkHarvest;
private Button phirHeraPheri;
private Button fukrey;
private Button hungama2;
private Button jawan;
private Button pathan;
private Button missionImpossible;
private Button bloodyDaddy;
private Button sehezada;
private Button dilwale;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view= inflater.inflate(R.layout.fragment_cat1, container, false);
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