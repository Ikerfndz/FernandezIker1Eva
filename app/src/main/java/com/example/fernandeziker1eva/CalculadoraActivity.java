package com.example.fernandeziker1eva;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class CalculadoraActivity extends AppCompatActivity {

    boolean operacion = true;
    boolean operacion2 = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);


        Button cero = (Button) findViewById(R.id.boton0);
        Button uno = (Button) findViewById(R.id.boton1);
        Button dos = (Button) findViewById(R.id.boton2);
        Button tres = (Button) findViewById(R.id.boton3);
        Button cuatro = (Button) findViewById(R.id.boton4);
        Button cinco = (Button) findViewById(R.id.boton5);
        Button seis = (Button) findViewById(R.id.boton6);
        Button siete = (Button) findViewById(R.id.boton7);
        Button ocho = (Button) findViewById(R.id.boton8);
        Button nueve = (Button) findViewById(R.id.boton9);

        Button punto = (Button) findViewById(R.id.button15);
        Button igual = (Button) findViewById(R.id.button16);


        TextView txt = (TextView) findViewById(R.id.textView8);

        Button inv = (Button) findViewById(R.id.botonINV);
        Button mas = (Button) findViewById(R.id.botonSuma);
        Button menos = (Button) findViewById(R.id.botonResta);
        Button multiplicacion = (Button) findViewById(R.id.botonMultiplicacion);
        Button division = (Button) findViewById(R.id.botonDivision);
        Button borrar = (Button) findViewById(R.id.botonBorrar);
        Button alCuadrdao = (Button) findViewById(R.id.botonElevadoCuadrado);

        uno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String numero = (String) txt.getText().toString();
                txt.setText(numero += 1);


            }
        });

        dos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String numero = (String) txt.getText().toString();
                txt.setText(numero += 2);
            }
        });
        tres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String numero = (String) txt.getText().toString();
                txt.setText(numero += 3);
            }
        });
        cuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String numero = (String) txt.getText().toString();
                txt.setText(numero += 4);
            }
        });
        cinco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String numero = (String) txt.getText().toString();
                txt.setText(numero += 5);
            }
        });
        seis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String numero = (String) txt.getText().toString();
                txt.setText(numero += 6);
            }
        });
        siete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String numero = (String) txt.getText().toString();
                txt.setText(numero += 7);
            }
        });
        ocho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String numero = (String) txt.getText().toString();
                txt.setText(numero += 8);
            }
        });
        nueve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String numero = (String) txt.getText().toString();
                txt.setText(numero += 9);
            }
        });
        cero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String numero = (String) txt.getText().toString();
                txt.setText(numero += 0);
            }
        });

        inv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String numero = (String) txt.getText().toString();
                String invertido = "";
                for (int x = numero.length() - 1; x >= 0; x--) {
                    invertido = invertido + numero.charAt(x);
                }
                txt.setText(invertido);
            }
        });

        borrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String vacio = "";
                txt.setText(vacio);
                operacion = true;
                operacion2 = false;
            }

        });

        mas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (operacion2 == false) {


                    String numero = (String) txt.getText().toString();
                    String numero11 = numero + "+";
                    String vacio = "";
                    txt.setText(vacio);
                    String finalNumero1 = numero11;
                    char[] ultimos = finalNumero1.toCharArray();
                    char ultimo = ultimos[ultimos.length - 1];
                    if (ultimo == '+' || ultimo == '-' || ultimo == '*' || ultimo == '/') {
                        operacion2 = true;

                    } else {
                        operacion2 = false;
                    }


                    igual.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            operacion2 = false;
                            String numero2 = (String) txt.getText().toString();

                            if (numero2.equals("")) {
                                txt.setText(numero);
                            } else {
                                String resultado = "";
                                resultado = sumar(numero, numero2);
                                String finalResultado = resultado;
                                txt.setText(finalResultado);
                            }
                        }
                    });
                    operacion = false;

                }

            }


        });

        igual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String numero = (String) txt.getText().toString();
                txt.setText(numero);
            }
        });

        multiplicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (operacion2 == false) {


                    String numero = (String) txt.getText().toString();
                    String numero11 = numero + "+";
                    String vacio = "";
                    txt.setText(vacio);
                    String finalNumero1 = numero11;
                    char[] ultimos = finalNumero1.toCharArray();
                    char ultimo = ultimos[ultimos.length - 1];
                    if (ultimo == '+' || ultimo == '-' || ultimo == '*' || ultimo == '/') {
                        operacion2 = true;

                    } else {
                        operacion2 = false;
                    }


                    igual.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            operacion2 = false;
                            String numero2 = (String) txt.getText().toString();

                            if (numero2.equals("")) {
                                txt.setText(numero);
                            } else {
                                String resultado = "";
                                resultado = multiplicar(numero, numero2);
                                String finalResultado = resultado;
                                txt.setText(finalResultado);
                            }
                        }
                    });
                    operacion = true;
                }

            }


        });

        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (operacion2 == false) {


                    String numero = (String) txt.getText().toString();
                    String numero11 = numero + "+";
                    String vacio = "";
                    txt.setText(vacio);
                    String finalNumero1 = numero11;
                    char[] ultimos = finalNumero1.toCharArray();
                    char ultimo = ultimos[ultimos.length - 1];
                    if (ultimo == '+' || ultimo == '-' || ultimo == '*' || ultimo == '/') {
                        operacion2 = true;

                    } else {
                        operacion2 = false;
                    }


                    igual.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            operacion2 = false;
                            String numero2 = (String) txt.getText().toString();


                            if (numero2.equals("")) {
                                txt.setText(numero);
                            } else {
                                if (numero2 == "0") {
                                    Toast.makeText(CalculadoraActivity.this, "NO ES POSIBLE DIVIDIR ENTRE 0", Toast.LENGTH_LONG).show();
                                } else {
                                    String resultado = "";
                                    resultado = dividir(numero, numero2);
                                    String finalResultado = resultado;
                                    txt.setText(finalResultado);
                                }
                            }


                        }
                    });

                    operacion = true;
                }

            }

        });


        menos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (operacion2 == false) {


                    String numero = (String) txt.getText().toString();
                    String numero11 = numero + "+";
                    String vacio = "";
                    txt.setText(vacio);
                    String finalNumero1 = numero11;
                    char[] ultimos = finalNumero1.toCharArray();
                    char ultimo = ultimos[ultimos.length - 1];
                    if (ultimo == '+' || ultimo == '-' || ultimo == '*' || ultimo == '/') {
                        operacion2 = true;

                    } else {
                        operacion2 = false;
                    }


                    igual.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            operacion2 = false;
                            String numero2 = (String) txt.getText().toString();

                            if (numero2.equals("")) {
                                txt.setText(numero);
                            } else {
                                String resultado = "";
                                resultado = restar(numero, numero2);
                                String finalResultado = resultado;
                                txt.setText(finalResultado);
                            }
                        }
                    });
                    operacion = true;

                }

            }


        });

        punto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (operacion == true) {
                    if (txt.getText().equals("")) {
                        txt.setText("0.");
                    } else {
                        String numero = (String) txt.getText().toString();
                        txt.setText(numero += ".");
                    }
                }
                operacion = false;
            }


        });

        alCuadrdao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (operacion2 == false) {

                    String numero = (String) txt.getText().toString();
                    String resultadoFinal = "";
                    resultadoFinal = cuadrado(numero);
                    txt.setText(resultadoFinal);
                    operacion = true;

                }
            }
        });


    }


    public static String sumar(String n1, String n2) {
        double suma = 0;

        double numEntero1 = Double.parseDouble(n1);
        double numEntero2 = Double.parseDouble(n2);
        suma = numEntero1 + numEntero2;

        String numero = String.valueOf(suma);

        return numero;
    }

    public static String restar(String n1, String n2) {
        double suma = 0;

        double numEntero1 = Double.parseDouble(n1);
        double numEntero2 = Double.parseDouble(n2);
        suma = numEntero1 - numEntero2;

        String numero = String.valueOf(suma);

        return numero;
    }

    public static String multiplicar(String n1, String n2) {
        double suma = 0;

        double numEntero1 = Double.parseDouble(n1);
        double numEntero2 = Double.parseDouble(n2);
        suma = numEntero1 * numEntero2;

        String numero = String.valueOf(suma);

        return numero;
    }

    public static String dividir(String n1, String n2) {
        double suma = 0;

        double numEntero1 = Double.parseDouble(n1);
        double numEntero2 = Double.parseDouble(n2);
        suma = numEntero1 / numEntero2;

        String numero = String.valueOf(suma);

        return numero;
    }

    public static String cuadrado(String n1) {
        double resultado = 0;

        double numEntero1 = Double.parseDouble(n1);

        resultado = numEntero1 * numEntero1;

        String numero = String.valueOf(resultado);

        return numero;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.xmlmenu, menu);
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

    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater inflate = getMenuInflater();
        inflate.inflate(R.menu.xmlmenu, menu);

    }





}