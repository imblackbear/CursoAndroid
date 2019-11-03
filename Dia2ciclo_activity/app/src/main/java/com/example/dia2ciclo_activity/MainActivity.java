package com.example.dia2ciclo_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    final EditText editText = (EditText)findViewById(R.id.ed_plain);


    public void ingresar (View view){
        Intent ingresar = new Intent(this,activiti2.class);
        startActivity(ingresar);                                                         //lanza un segundo activity con el metodo creado ingresar
        final String texttrasladado = editText.getText().toString();
        getIntent().putExtra("Valor",texttrasladado);
        startActivity(ingresar);
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    protected void onStart(){
        super.onStart();
        Toast.makeText(this,"Metodo onStart", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStop(){
        super.onStop();
        Toast.makeText(this,"Metodo onStop",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Toast.makeText(this,"Metodo onDestroy",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onPause(){
        super.onPause();
        Toast.makeText(this,"Metodo onPause",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onResume(){
        super.onResume();
        Toast.makeText(this,"Metodo onResume",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Toast.makeText(this,"Metodo onRestart",Toast.LENGTH_LONG).show();
    }


}
