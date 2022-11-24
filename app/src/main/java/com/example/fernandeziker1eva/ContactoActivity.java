package com.example.fernandeziker1eva;

import static com.example.fernandeziker1eva.R.*;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class ContactoActivity extends AppCompatActivity {

    @Override
    protected void onRestart() {
        super.onRestart();
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_contacto);

        EditText correo = (EditText) findViewById(R.id.txtEmail);
        EditText titulo = (EditText) findViewById(id.txtTitulo);
        EditText asunto = (EditText) findViewById(id.txtasunto);
        TextView puntuacion = (TextView) findViewById(id.textBarra);
        EditText contenido = (EditText) findViewById(id.txtcontenido);

        Button enviar = (Button) findViewById(R.id.botonEnviar);

        TextView mostrarPorcentaje = (TextView) findViewById(id.textBarra);


        SeekBar seekBar = (SeekBar) findViewById(id.seekBar);
        seekBar.setProgress(0);
        seekBar.setMax(10);
        seekBar.setOnSeekBarChangeListener(
                new SeekBar.OnSeekBarChangeListener() {
                    //hace un llamado a la perilla cuando se arrastra
                    @Override
                    public void onProgressChanged(SeekBar seekBar,
                                                  int progress, boolean fromUser) {
                        mostrarPorcentaje.setText(String.valueOf(progress));
                    }
                    //hace un llamado  cuando se toca la perilla
                    public void onStartTrackingTouch(SeekBar seekBar) {
                    }
                    //hace un llamado  cuando se detiene la perilla
                    public void onStopTrackingTouch(SeekBar seekBar) {
                    }
                });

        enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String correoUsu = (String) correo.getText().toString();
                String tit = (String) titulo.getText().toString();
                String asun = (String) asunto.getText().toString();
                String pun = (String) puntuacion.getText().toString();
                String cont = (String) contenido.getText().toString();
                String content = "Puntuacion : " + pun + "." + "\n" + cont;

                if (correoUsu.equals("") || tit.equals("") || asun.equals("") || cont.equals("")){
                    Toast.makeText(ContactoActivity.this, "HAY CAMPOS INCOMPLETOS", Toast.LENGTH_LONG).show();
                }else {
                    enviarEmail(correoUsu, tit, asun, content);
                }






            }
        });
    }


    private void enviarEmail(String correo, String titulo, String asunto, String contenido){

        Intent emailIntent = new Intent(android.content.Intent.ACTION_SEND);

        emailIntent.setType("text/html");

        emailIntent.putExtra(Intent.EXTRA_EMAIL, new String[]{correo});

        emailIntent.putExtra(android.content.Intent.EXTRA_TITLE, titulo);

        emailIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, asunto);

        emailIntent.putExtra(android.content.Intent.EXTRA_TEXT, contenido);

        try {

            startActivity(Intent.createChooser(emailIntent, "Enviar Correo..."));
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(ContactoActivity.this, "No hay ningun correo con esa dirección.", Toast.LENGTH_SHORT).show();
        }
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
            case R.id.Menu2:
                Intent intent2 = new Intent(getApplicationContext(), CalculadoraActivity.class);
                startActivity(intent2);
                return true;
            case R.id.Menu3:
                Intent intent3 = new Intent(getApplicationContext(), ContactoActivity.class);
                startActivity(intent3);
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