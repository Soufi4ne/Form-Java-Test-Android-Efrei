package com.example.formulairejavaandroidsoufianeefrei;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText myPrenomEt = findViewById(R.id.prenomEt);
        EditText myNomEt = findViewById(R.id.nomEt);
        EditText myEmailEt = findViewById(R.id.emailEt);
        EditText myMessageEt = findViewById(R.id.messageEt);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Envoyer un message à Efrei");

        Button myEnvoyerBtn = findViewById(R.id.envoyerBtn);
        myEnvoyerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String prenom = myPrenomEt.getText().toString();
                String nom = myNomEt.getText().toString();
                String email = myEmailEt.getText().toString();
                String message = myMessageEt.getText().toString();


                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("PRENOM", prenom);
                intent.putExtra("NOM", nom);
                intent.putExtra("EMAIL", email);
                intent.putExtra("MESSAGE", message);

                startActivity(intent);
            }

        });

    }
    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        if (getCurrentFocus() != null) {
            InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
            imm.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 0);
        }
        return super.dispatchTouchEvent(ev);
    }
}