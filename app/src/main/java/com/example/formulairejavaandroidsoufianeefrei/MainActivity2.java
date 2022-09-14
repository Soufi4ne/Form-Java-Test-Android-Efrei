package com.example.formulairejavaandroidsoufianeefrei;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Récapitulatif de votre envoi");

        Intent intent = getIntent();
        String prenom = intent.getStringExtra("PRENOM");
        String nom = intent.getStringExtra("NOM");
        String email = intent.getStringExtra("EMAIL");
        String message = intent.getStringExtra("MESSAGE");


        TextView myResultTv = findViewById(R.id.resultTv);
        myResultTv.setText("Prenom: \n" +prenom +"\n\nNom de Famille :\n"+nom+"\n\nAdresse Email :\n"+email+"\n\nMessage :\n"+message);
    }
}