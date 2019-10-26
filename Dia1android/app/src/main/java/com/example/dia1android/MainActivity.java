package com.example.dia1android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public EditText et1;
    public EditText et2;
    public TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1 = (EditText)findViewById(R.id.valor1);
        et2 = (EditText)findViewById(R.id.valor2);
        tv1 = (TextView)findViewById(R.id.resultado);



    }

    public void suma (View view){

        String valor1_string = et1.getText().toString();
        String  valor2_string = et2.getText().toString();

        int valor1_int = Integer.parseInt(valor1_string);
        int valor2_int = Integer.parseInt(valor2_string);

        int suma = valor1_int + valor2_int;

        tv1.setText("El resultado es " + suma);




    }
}
