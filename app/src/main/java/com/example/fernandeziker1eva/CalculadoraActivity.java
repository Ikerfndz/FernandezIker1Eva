package com.example.fernandeziker1eva;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

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


       uno.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               String numero = (String) txt.getText().toString();
               txt.setText(numero+=1);


           }
       });

        dos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String numero = (String) txt.getText().toString();
                txt.setText(numero+=2);
            }
        });
        tres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String numero = (String) txt.getText().toString();
                txt.setText(numero+=3);
            }
        });
        cuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String numero = (String) txt.getText().toString();
                txt.setText(numero+=4);
            }
        });
        cinco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String numero = (String) txt.getText().toString();
                txt.setText(numero+=5);
            }
        });
        seis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String numero = (String) txt.getText().toString();
                txt.setText(numero+=6);
            }
        });
        siete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String numero = (String) txt.getText().toString();
                txt.setText(numero+=7);
            }
        });
        ocho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String numero = (String) txt.getText().toString();
                txt.setText(numero+=8);
            }
        });
        nueve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String numero = (String) txt.getText().toString();
                txt.setText(numero+=9);
            }
        });
        cero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String numero = (String) txt.getText().toString();
                txt.setText(numero+=0);
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

                }

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
                                String resultado = "";
                                resultado = dividir(numero, numero2);
                                String finalResultado = resultado;
                                txt.setText(finalResultado);
                            }
                        }
                    });

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


    }


    public static String sumar(String n1, String n2){
        double suma = 0;

        double numEntero1 = Double.parseDouble(n1);
        double numEntero2 = Double.parseDouble(n2);
        suma = numEntero1 + numEntero2;

        String numero = String.valueOf(suma);

        return numero;
    }

    public static String restar(String n1, String n2){
        double suma = 0;

        double numEntero1 = Double.parseDouble(n1);
        double numEntero2 = Double.parseDouble(n2);
        suma = numEntero1 - numEntero2;

        String numero = String.valueOf(suma);

        return numero;
    }

    public static String multiplicar(String n1, String n2){
        double suma = 0;

        double numEntero1 = Double.parseDouble(n1);
        double numEntero2 = Double.parseDouble(n2);
        suma = numEntero1 * numEntero2;

        String numero = String.valueOf(suma);

        return numero;
    }

    public static String dividir(String n1, String n2){
        double suma = 0;

        double numEntero1 = Double.parseDouble(n1);
        double numEntero2 = Double.parseDouble(n2);
        suma = numEntero1 / numEntero2;

        String numero = String.valueOf(suma);

        return numero;
    }


}