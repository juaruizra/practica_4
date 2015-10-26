package com.example.juancho.practica4;

import android.graphics.Typeface;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;


public class HotelActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel);


        //Tipo de letra Titulo
        TextView Texto_Guainia=(TextView) findViewById(R.id.Text_Hotel);
        Typeface tipo_letra= Typeface.createFromAsset(getAssets(),"C.A. Gatintas.ttf");
        Texto_Guainia.setTypeface(tipo_letra);

        TextView Texto_Guainia_1=(TextView) findViewById(R.id.Text_Hotel_1);
        TextView Texto_Guainia_2=(TextView) findViewById(R.id.Text_Hotel_2);
        TextView Texto_Guainia_3=(TextView) findViewById(R.id.Text_Hotel_3);

        Typeface tipo_letra_N= Typeface.createFromAsset(getAssets(),"gloriahallelujah.ttf");

        Texto_Guainia_1.setTypeface(tipo_letra_N);
        Texto_Guainia_2.setTypeface(tipo_letra_N);
        Texto_Guainia_3.setTypeface(tipo_letra_N);

        /*//Tipo de letra HOTEL 1
        TextView Texto_intro_1=(TextView)findViewById(R.id.Text_Hotel_1);
        TextView Texto_hora_1=(TextView)findViewById(R.id.Text_Hotel_hora);
        TextView Texto_Dir_1=(TextView)findViewById(R.id.Text_Hotel_dire);
        TextView Texto_Email_1=(TextView)findViewById(R.id.Text_Hotel_email);
        TextView Texto_Hotel_1_dire=(TextView)findViewById(R.id.Text_Hotel_1_dire);
        TextView Texto_Hotel_1_email=(TextView)findViewById(R.id.Text_Hotel_1_email);


        Typeface tipo2=Typeface.createFromAsset(getAssets(),"VadimsWriting.ttf");
        Texto_intro_1.setTypeface(tipo2);
        Texto_hora_1.setTypeface(tipo2);
        Texto_Dir_1.setTypeface(tipo2);
        Texto_Email_1.setTypeface(tipo2);
        Texto_Hotel_1_dire.setTypeface(tipo2);
         Texto_Hotel_1_email.setTypeface(tipo2);
*/

        //animacion
       /* ImageView Animacion= (ImageView)findViewById(R.id.iv_animacion);
        ImageView Animacion_2= (ImageView)findViewById(R.id.iv_animacion2);
        ImageView Animacion_3= (ImageView)findViewById(R.id.iv_animacion3);

        Animacion.setBackgroundResource(R.drawable.animacion_hotel);//lista de animaciones
        final AnimationDrawable SavingAnimation=(AnimationDrawable)Animacion.getBackground();
        SavingAnimation.start();//SavingAnimation.stop();

        Animacion_2.setBackgroundResource(R.drawable.animacion_hotel_2);//lista de animaciones
        final AnimationDrawable SavingAnimation_2=(AnimationDrawable)Animacion.getBackground();
        SavingAnimation_2.start();//SavingAnimation.stop();

        Animacion_3.setBackgroundResource(R.drawable.animacion_hotel_3);//lista de animaciones
        final AnimationDrawable SavingAnimation_3=(AnimationDrawable)Animacion.getBackground();
        SavingAnimation_3.start();//SavingAnimation.stop();*/



        // boton back
        ImageButton Bt_Back=(ImageButton)findViewById(R.id.Bt_Back);
        Bt_Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_back= new Intent(HotelActivity.this, MainActivity.class);
                startActivity(intent_back);
               /* SavingAnimation.stop();
                SavingAnimation_2.stop();
                SavingAnimation_3.stop();*/
            }
        });

        /*Button Bt_Back= (Button)findViewById(R.id.BtnBack);

        Bt_Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_back= new Intent(HotelActivity.this, MainActivity.class);
               startActivity(intent_back);
            }



        });*/
    }

}
