package com.uisrael.espincristian_examen1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class Resumen extends AppCompatActivity {



    Bundle datoRecibido;

    TextView recibir2,re3,re4,re5,re6;

    CheckBox cb1;

    RadioButton r1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resumen);





        re3=findViewById(R.id.et3);
        recibir2=findViewById(R.id.et2);
        re4=findViewById(R.id.et4);
        re5=findViewById(R.id.etNombre2);
        re6=findViewById(R.id.etNombre11);

        datoRecibido=getIntent().getExtras();


        String recibirDato = datoRecibido.getString("dato");
        String recibirDato2 = datoRecibido.getString("dato2");
        String recibirDato3 = datoRecibido.getString("dato3");
        String recibirDato4 = datoRecibido.getString("dato4");
        String recibirDato5 = datoRecibido.getString("dato5");


        recibir2.setText(recibirDato);

        re3.setText(recibirDato2);
        re4.setText(recibirDato3);
        re5.setText(recibirDato4);
        re6.setText(recibirDato5);

    }
}
