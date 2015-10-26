package com.example.juancho.practica4;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class Bares_ctivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bares);


        //Tipo de letra Titulo
        TextView Texto_Guainia=(TextView) findViewById(R.id.Text_BAR);
        Typeface tipo_letra= Typeface.createFromAsset(getAssets(),"C.A. Gatintas.ttf");
        Texto_Guainia.setTypeface(tipo_letra);

        TextView Texto_Guainia_1=(TextView) findViewById(R.id.Text_BAR_1);
        TextView Texto_Guainia_2=(TextView) findViewById(R.id.Text_BAR_2);
        TextView Texto_Guainia_3=(TextView) findViewById(R.id.Text_BAR_3);

        Typeface tipo_letra_N= Typeface.createFromAsset(getAssets(),"gloriahallelujah.ttf");

        Texto_Guainia_1.setTypeface(tipo_letra_N);
        Texto_Guainia_2.setTypeface(tipo_letra_N);
        Texto_Guainia_3.setTypeface(tipo_letra_N);



        ImageButton Bt_Back=(ImageButton)findViewById(R.id.Bt_Back);
        Bt_Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_back = new Intent(Bares_ctivity.this, MainActivity.class);
                startActivity(intent_back);

            }
        });
    }
}
