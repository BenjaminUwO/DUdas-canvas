package com.example.actividad14;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class dibujitoActvityOWO extends AppCompatActivity {

    LienzoUWu lienzoAWA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_dibujito_actvity_owo);
        lienzoAWA = new LienzoUWu(this);

        setContentView(lienzoAWA);

    }
}