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
                String apellidoP = eApellidoP.getText().toString();
                String apellidoM = eApellidoM.getText().toString();
                String nombres = eNombres.getText().toString();
                String nacimiento = eNacimiento.getText().toString();
                String colegio = eColegio.getText().toString();
                String carrera = eCarrera.getText().toString();

                Intent detalle = new Intent(Postular.this, Informacion.class);
                detalle.putExtra("apellidoP", apellidoP);
                detalle.putExtra("apellidoM", apellidoM);
                detalle.putExtra("nombre", nombres);
                detalle.putExtra("nacimiento", nacimiento);
                detalle.putExtra("colegio", colegio);
                detalle.putExtra("carrera", carrera);

/*
                txtMessage.setText("Enviado");
                postulante.setApellidoM(String.valueOf(eApellidoM));
                postulante.setApellidoP(String.valueOf(eApellidoP));
                postulante.setNombre(String.valueOf(eNombres));
                postulante.setNacimiento(String.valueOf(eNacimiento));
                postulante.setCarrera(String.valueOf(eCarrera));
                postulante.setColegio(String.valueOf(eColegio));
*/
               //Intent intent = new Intent(.this, Informacion.class);
                //intent.putExtra("Postulante", postulante);
                startActivity(detalle);

            }
        });

    }
}