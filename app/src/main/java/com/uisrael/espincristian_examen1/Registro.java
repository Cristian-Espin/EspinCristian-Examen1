package com.uisrael.espincristian_examen1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Registro extends AppCompatActivity {

    EditText etDato1,dato2,dato3,dato4,dato5,dato6;
    TextView recibir2;
    Bundle datoRecibido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        etDato1= findViewById(R.id.etNombre1);
        dato2= findViewById(R.id.etNombre2);
        dato3= findViewById(R.id.etNombre3);
        dato4= findViewById(R.id.etNombre33);
        dato5= findViewById(R.id.etNombre55);

//dato para enviar
        dato6= findViewById(R.id.etNombre11);


        //Recibir


        recibir2=findViewById(R.id.etNombre11);
        datoRecibido=getIntent().getExtras();
        String recibirDato = datoRecibido.getString("dato");
        recibir2.setText(recibirDato);






    }

    public void Calcular(View v){

        int valor1, valor2,valor34;
        double res1,res2;
        valor1=Integer.parseInt(dato2.getText().toString());
        valor2=Integer.parseInt(dato3.getText().toString());
        //valor34=Integer.parseInt(dato5.getText().toString());

        res1 = ((((valor1) - (valor2))/3))*0.05;
        res2= ((valor1-valor2)+res1*3);

        dato4.setText(Double.toString(res1));
       dato5.setText(Double.toString(res2));
    }


    public void enviarDatos(View v){

        // EdidText

        Intent inttento = new Intent(this, Encuesta.class);
        inttento.putExtra("dato",etDato1.getText().toString());
        inttento.putExtra("dato2",dato5.getText().toString());
        inttento.putExtra("dato9",dato6.getText().toString());



        Toast.makeText(getApplicationContext(),"Guardado con exito", Toast.LENGTH_SHORT).show();
        startActivity(inttento);
    }

}