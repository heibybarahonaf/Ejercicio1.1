package com.example.ejercicio11;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class Resultado extends AppCompatActivity {

    TextView resultado;
    ImageButton btnAtras, btnCerrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        resultado = (TextView)findViewById(R.id.txtResultado);

        resultado.setText(getIntent().getStringExtra("operacion"));

        btnAtras = (ImageButton)findViewById(R.id.btnAtras);
        btnCerrar = (ImageButton)findViewById(R.id.btnCerrar);

        btnAtras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });

        btnCerrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finishAffinity();
            }
        });

    }
}