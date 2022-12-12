package com.example.fernandeziker1eva;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import java.security.Principal;

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

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.xmlmenu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        String mensaje = "";
        switch (item.getItemId()){
            case R.id.Menu1:
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
                return true;
            case R.id.SubmenuCalculadora:
                Intent intent2 = new Intent(getApplicationContext(), CalculadoraActivity.class);
                startActivity(intent2);
                return true;
            case R.id.SubmenuEnlace:
                Intent intent4 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://web2.0calc.es/"));
                startActivity(intent4);
                return true;
            case R.id.Submenucontacto:
                Intent intent3 = new Intent(getApplicationContext(), ContactoActivity.class);
                startActivity(intent3);
                return true;
            case R.id.SubmenuMail:
                Intent intent5 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://mail.google.com/mail/u/0/#inbox"));
                startActivity(intent5);
                return true;
            default:return super.onOptionsItemSelected(item);
        }
    }
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo){
        super.onCreateContextMenu(menu,v,menuInfo);
        MenuInflater inflate = getMenuInflater();
        inflate.inflate(R.menu.xmlmenu,menu);

    }
}