package com.example.fernandeziker1eva;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // animacion
         txt = findViewById(R.id.textoNombre);
        animacion(txt);
        // ImageButton cambio a la pantalla de la calculadora
        ImageButton cambioCalculadora = (ImageButton) findViewById(R.id.botonCalculadora);
        cambioCalculadora.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intntCalculadora = new Intent(MainActivity.this, CalculadoraActivity.class);
                startActivity(intntCalculadora);
            }
        });

        // boton cambio a la pantalla de contacto
        Button cambioContacto = (Button) findViewById(R.id.botonContacto);
        cambioContacto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intntContacto = new Intent(MainActivity.this, ContactoActivity.class);
                startActivity(intntContacto);
            }
        });

    }

    public void animacion (View view){
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.animacion);
        txt.startAnimation(animation);
    }
}