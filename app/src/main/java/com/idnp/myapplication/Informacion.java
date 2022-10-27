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

        ArrayList<Alumno> listaAlumnos = new ArrayList<>();
        Bundle extras = getIntent().getExtras();
        Alumno  alumno = extras.getParcelable("person");
        listaAlumnos.add(alumno);

        TextView eDatos = findViewById(R.id.dDatos);
        Button bAtra = findViewById(R.id.bAtras);

        for (int i=0;i<listaAlumnos.size();i++) {
            eDatos.setText(String.format("%s\n",
                    listaAlumnos.get(i).toString()
                    )
            );
        }
/*eDatos.setText(String.format("%s\n%s\n%s\n%s\n%s\n%s",
                    alumno.getApellidoP(),
                    alumno.getApellidoM(),
                    alumno.getNombre(),
                    alumno.getNacimiento(),
                    alumno.getColegio(),
                    alumno.getCarrera()
                    )
            );*/


        /*
        //llamarlos de xml
        TextView eApellidoP = findViewById(R.id.eApellidoP);
        TextView eApellidoM = findViewById(R.id.eApellidoM);
        TextView eNombres = findViewById(R.id.eNombres);
        TextView eNacimiento = findViewById(R.id.eFechadeNacimiento);
        TextView eColegio = findViewById(R.id.eColegio);
        TextView eCarrera = findViewById(R.id.eCarrera);

        //agarrar cada dato con intent
        Bundle extras = getIntent().getExtras();
        String apeP = extras.getString("apellidoP");
        String apeM = extras.getString("apellidoM");
        String nam = extras.getString("nombre");
        String nac = extras.getString("nacimiento");
        String col = extras.getString("colegio");
        String carr = extras.getString("carrera");

        //para imprimir
        eDatos.setText(String.format("%s\n%s\n%s\n%s\n%s\n%s", apeP, apeM, nam, nac, col, carr));

        //para imprimir los dato
        eApellidoP.setText(apeP);
        eApellidoM.setText(apeM);
        eNombres.setText(nam);
        eNacimiento.setText(nac);
        eColegio.setText(col);
        eCarrera.setText(carr);
        */

        bAtra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MenuActivity.class);
                startActivity(intent);
            }
        });
    }
}