package com.example.juancho.practica4;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class AcercadeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_acercade);

        //Tipo de letra Titulo
        TextView Texto_Guainia=(TextView) findViewById(R.id.acer_0);
        Typeface tipo_letra= Typeface.createFromAsset(getAssets(),"C.A. Gatintas.ttf");
        Texto_Guainia.setTypeface(tipo_letra);

        TextView Texto_Guainia_1=(TextView) findViewById(R.id.acer_1);
        TextView Texto_Guainia_2=(TextView) findViewById(R.id.acer_2);
        TextView Texto_Guainia_3=(TextView) findViewById(R.id.acer_3);

        Typeface tipo_letra_N= Typeface.createFromAsset(getAssets(),"gloriahallelujah.ttf");

        Texto_Guainia_1.setTypeface(tipo_letra_N);
        Texto_Guainia_2.setTypeface(tipo_letra_N);
        Texto_Guainia_3.setTypeface(tipo_letra_N);

        ImageButton Bt_Back=(ImageButton)findViewById(R.id.Bt_Back);
        Bt_Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_back = new Intent(AcercadeActivity.this, MainActivity.class);
                startActivity(intent_back);

            }
        });

    }

}
