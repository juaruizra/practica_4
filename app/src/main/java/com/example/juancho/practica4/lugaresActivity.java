package com.example.juancho.practica4;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class lugaresActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lugares);


        //Tipo de letra Titulo
        TextView Texto_Guainia=(TextView) findViewById(R.id.lugar1);
        Typeface tipo_letra= Typeface.createFromAsset(getAssets(),"C.A. Gatintas.ttf");
        Texto_Guainia.setTypeface(tipo_letra);

        TextView Texto_Guainia_1=(TextView) findViewById(R.id.lugar6);
        TextView Texto_Guainia_2=(TextView) findViewById(R.id.lugar2);
        TextView Texto_Guainia_3=(TextView) findViewById(R.id.lugar3);
        TextView Texto_Guainia_4=(TextView) findViewById(R.id.lugar4);
        TextView Texto_Guainia_5=(TextView) findViewById(R.id.lugar5);

        Typeface tipo_letra_N= Typeface.createFromAsset(getAssets(),"gloriahallelujah.ttf");

        Texto_Guainia_1.setTypeface(tipo_letra_N);
        Texto_Guainia_2.setTypeface(tipo_letra_N);
        Texto_Guainia_3.setTypeface(tipo_letra_N);
        Texto_Guainia_4.setTypeface(tipo_letra_N);
        Texto_Guainia_5.setTypeface(tipo_letra_N);





        ImageButton Bt_Back=(ImageButton)findViewById(R.id.Bt_Back);
        Bt_Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_back = new Intent(lugaresActivity.this, MainActivity.class);
                startActivity(intent_back);

            }
        });
    }
}
