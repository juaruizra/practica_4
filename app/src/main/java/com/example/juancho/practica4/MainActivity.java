package com.example.juancho.practica4;

import android.app.ActionBar;
import android.content.Intent;
import android.graphics.Typeface;
import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.TextureView;
import android.view.View;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

 //animacion
   ImageView Animacion= (ImageView)findViewById(R.id.iv_animacion);
       Animacion.setBackgroundResource(R.drawable.animacion);//lista de animaciones
   final AnimationDrawable SavingAnimation=(AnimationDrawable)Animacion.getBackground();
   SavingAnimation.start();//SavingAnimation.stop();
 //Tipo de letra Guainia
       TextView Texto_Guainia=(TextView) findViewById(R.id.text_Guainia);
        Typeface tipo_letra= Typeface.createFromAsset(getAssets(),"C.A. Gatintas.ttf");
        Texto_Guainia.setTypeface(tipo_letra);
 //Tipo de letra Intro
        TextView Texto_intro=(TextView)findViewById(R.id.text_intro_1);
        Typeface tipo2=Typeface.createFromAsset(getAssets(),"gloriahallelujah.ttf");
        Texto_intro.setTypeface(tipo2);
// referenciacion
        ImageButton Bt_Hotel=(ImageButton)findViewById(R.id.Bt_hotel);
        ImageButton Bt_Demo=(ImageButton)findViewById(R.id.Bt_demo);
        ImageButton Bt_Bares=(ImageButton)findViewById(R.id.Bt_beer);
        ImageButton Bt_acerca=(ImageButton)findViewById(R.id.Bt_inf);
        ImageButton Bt_Lugares=(ImageButton)findViewById(R.id.Bt_sunny);

       Bt_Hotel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               //crea el intent
                Intent intent_Hotel=new Intent(MainActivity.this, HotelActivity.class);
              //  SavingAnimation.stop();//se detiene la animacion para ahorrar recursos
                startActivity(intent_Hotel);
            }
        });
        Bt_Demo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_demo=new Intent(MainActivity.this, demografiaActivity.class);
                //  SavingAnimation.stop();//se detiene la animacion para ahorrar recursos
                startActivity(intent_demo);

            }
        });
        Bt_Bares.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_Bares=new Intent(MainActivity.this, Bares_ctivity.class);
                //    SavingAnimation.stop();//se detiene la animacion para ahorrar recursos
                startActivity(intent_Bares);
            }
        });
        Bt_acerca.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             Intent intent_acerca=new Intent(MainActivity.this, AcercadeActivity.class);
             //  SavingAnimation.stop();//se detiene la animacion para ahorrar recursos
             startActivity(intent_acerca);
             }
          }
        );
        Bt_Lugares.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_lugares=new Intent(MainActivity.this,lugaresActivity.class);
                // SavingAnimation.stop();//se detiene la animacion para ahorrar recursos
                startActivity(intent_lugares);
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
