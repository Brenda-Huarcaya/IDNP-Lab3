package com.idnp.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class Informacion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informacion);
/*
        ArrayList<Alumno> listaUsuario = new ArrayList<>();
        Alumno  alumno = (Alumno) getIntent().getSerializableExtra("Postulante");
        listaUsuario.add(alumno);
*/
        TextView eApellidoP = findViewById(R.id.eApellidoP);
        TextView eApellidoM = findViewById(R.id.eApellidoM);
        TextView eNombres = findViewById(R.id.eNombres);
        TextView eNacimiento = findViewById(R.id.eFechadeNacimiento);
        TextView eColegio = findViewById(R.id.eColegio);
        TextView eCarrera = findViewById(R.id.eCarrera);
        Button bAtras = findViewById(R.id.bEnviar);
/*
        eApellidoP.setText(alumno.getApellidoP().toString());
        eApellidoM.setText(alumno.getApellidoM());
        eNombres.setText(alumno.getNombre());
        eNacimiento.setText(alumno.getNacimiento());
        eColegio.setText(alumno.getColegio());
        eCarrera.setText(alumno.getCarrera());
*/
        Bundle extras = getIntent().getExtras();
        String apeP = extras.getString("apellidoP");
        String apeM = extras.getString("apellidoM");
        String nam = extras.getString("nombre");
        String nac = extras.getString("nacimiento");
        String col = extras.getString("colegio");
        String carr = extras.getString("carrera");

        eApellidoP.setText(apeP);
        eApellidoM.setText(apeM);
        eNombres.setText(nam);
        eNacimiento.setText(nac);
        eColegio.setText(col);
        eCarrera.setText(carr);

        bAtras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MenuActivity.class);
                startActivity(intent);
            }
        });
    }
}