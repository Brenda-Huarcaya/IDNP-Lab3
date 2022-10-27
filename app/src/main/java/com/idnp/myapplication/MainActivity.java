package com.idnp.myapplication;

import androidx.activity.result.ActivityResultLauncher;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button loginButton = findViewById(R.id.btnLogin);
        EditText eUsuario = findViewById(R.id.eUsuario);
        EditText eContrasena = findViewById(R.id.eContraseña);
        TextView tMensaje = findViewById(R.id.eMensaje);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String usuario = eUsuario.getText().toString();
                String contrasena = eContrasena.getText().toString();

                if (usuario.equals("usuario") && contrasena.equals("12345")){
                    Intent intent = new Intent(getApplicationContext(), MenuActivity.class);
                    startActivity(intent);
                }
                else{
                    tMensaje.setText("Usuario Invalido");
                }

            }
        });

    }
}