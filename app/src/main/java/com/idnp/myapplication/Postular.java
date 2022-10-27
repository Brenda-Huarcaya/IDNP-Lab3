package com.idnp.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Postular extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_postular);

        EditText eApellidoP = findViewById(R.id.eApellidoP);
        EditText eApellidoM = findViewById(R.id.eApellidoM);
        EditText eNombres = findViewById(R.id.eNombres);
        EditText eNacimiento = findViewById(R.id.eFechadeNacimiento);
        EditText eColegio = findViewById(R.id.eColegio);
        EditText eCarrera = findViewById(R.id.eCarrera);
        Button bEnviar = findViewById(R.id.bEnviar);
        TextView txtMessage = findViewById(R.id.txtMessage);
        Alumno postulante = new Alumno();


        bEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtMessage.setText("Enviado");
                postulante.setApellidoM(String.valueOf(eApellidoM));
                postulante.setApellidoP(String.valueOf(eApellidoP));
                postulante.setNombre(String.valueOf(eNombres));
                postulante.setNacimiento(String.valueOf(eNacimiento));
                postulante.setCarrera(String.valueOf(eCarrera));
                postulante.setColegio(String.valueOf(eColegio));

            }
        });

    }
}