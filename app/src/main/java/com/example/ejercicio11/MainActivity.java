package com.example.ejercicio11;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText num1, num2;
    Button btnsumar, btnrestar, btndividir, btnmultiplicar;
    ImageButton btnCerrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = (EditText)findViewById(R.id.txtNum1);
        num2 = (EditText)findViewById(R.id.txtNum2);

        btnsumar = (Button)findViewById(R.id.btnSuma);
        btnrestar = (Button)findViewById(R.id.btnResta);
        btndividir = (Button)findViewById(R.id.btnDividir);
        btnmultiplicar = (Button)findViewById(R.id.btnMultiplicar);

        btnCerrar = (ImageButton)findViewById(R.id.btnCerrar);

        btnsumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (validar()==true){
                    int n1 = Integer.parseInt(String.valueOf(num1.getText()));
                    int n2 = Integer.parseInt(String.valueOf(num2.getText()));

                    Operaciones resul = new Operaciones(n1,n2);

                    Intent intent = new Intent(getApplicationContext(), Resultado.class);
                    intent.putExtra("operacion", String.valueOf(resul.Suma()));
                    startActivity(intent);
                }
            }
        });

        btnrestar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (validar()==true){
                    int n1 = Integer.parseInt(String.valueOf(num1.getText()));
                    int n2 = Integer.parseInt(String.valueOf(num2.getText()));

                    Operaciones resul = new Operaciones(n1,n2);

                    Intent intent = new Intent(getApplicationContext(), Resultado.class);
                    intent.putExtra("operacion", String.valueOf(resul.Resta()));
                    startActivity(intent);
                }
            }
        });

        btndividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (validar()==true && validarDiv()==true){
                    int n1 = Integer.parseInt(String.valueOf(num1.getText()));
                    int n2 = Integer.parseInt(String.valueOf(num2.getText()));

                    Operaciones resul = new Operaciones(n1,n2);

                    Intent intent = new Intent(getApplicationContext(), Resultado.class);
                    intent.putExtra("operacion", String.valueOf(resul.Division()));
                    startActivity(intent);
                }
            }
        });

        btnmultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (validar()==true){
                    int n1 = Integer.parseInt(String.valueOf(num1.getText()));
                    int n2 = Integer.parseInt(String.valueOf(num2.getText()));

                    Operaciones resul = new Operaciones(n1,n2);

                    Intent intent = new Intent(getApplicationContext(), Resultado.class);
                    intent.putExtra("operacion", String.valueOf(resul.Multiplicacion()));
                    startActivity(intent);
                }
            }
        });

        btnCerrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finishAffinity();
            }
        });
    }

    private boolean validarDiv() {
        int n2 = Integer.parseInt(String.valueOf(num2.getText()));
        if(n2==0){
            num2.setError("Divisor no debe ser 0");
            return false;
        }
        return true;
    }

    private boolean validar() {
        if(num1.getText().toString().isEmpty()){
            num1.setError("Campo vacío");
            return false;
        }if(num2.getText().toString().isEmpty()){
            num2.setError("Campo vacío");
            return false;
        }
        return true;
    }
}