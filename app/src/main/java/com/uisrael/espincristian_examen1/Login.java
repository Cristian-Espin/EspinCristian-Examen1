package com.uisrael.espincristian_examen1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    EditText etDato1, etCla;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etDato1= findViewById(R.id.etNombre);
        etCla = findViewById(R.id.etClave);
    }

    public void enviarDato(View v){



        String v_usr = etDato1.getText().toString();
        String v_pass = etCla.getText().toString();

        if(v_usr.equals("estudiante2020") && v_pass.equals("uisrael2020")) {

            Intent inttento = new Intent(this, Registro.class);
            inttento.putExtra("dato",etDato1.getText().toString());
            Toast.makeText(getApplicationContext(),"Tu ingreso es correcto", Toast.LENGTH_SHORT).show();
            startActivity(inttento);
        }
        else{

            Toast.makeText(getApplicationContext(),"El usuario o la clave son erroneas",Toast.LENGTH_SHORT).show();
        }


    }
}
