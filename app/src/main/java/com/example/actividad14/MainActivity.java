package com.example.actividad14;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText TxtDistancia;
    Button BtnCalcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TxtDistancia = findViewById(R.id.TxtDistancia);
        BtnCalcular = findViewById(R.id.BtnCalcular);
        BtnCalcular.setOnClickListener(this);


    }
    public void a() {
        Intent a = new Intent(this, dibujitoActvityOWO.class);
        startActivity(a);
    }

    @Override
    public void onClick(View view) {

        float valor;
        if (view.getId() == R.id.BtnCalcular){
            a();
            valor = Float.parseFloat(TxtDistancia.getText().toString());
            claseAlmacenaValor.valor = valor;
        }

    }
}