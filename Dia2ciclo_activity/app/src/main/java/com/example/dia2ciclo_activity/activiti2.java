package com.example.dia2ciclo_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class activiti2 extends AppCompatActivity {


    String valorextraido;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activiti2);
        TextView nombre = (TextView)findViewById(R.id.txt_texto);
        valorextraido = getIntent().getExtras().getString("Valor");
        nombre.setText(valorextraido);
    }

}
