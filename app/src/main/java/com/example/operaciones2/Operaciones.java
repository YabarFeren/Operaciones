package com.example.operaciones2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Operaciones extends AppCompatActivity {
    //Declarar Variable
    Button btnUno,btnDos,btnTres,btnCuatro,btnCinco,btnSeis,btnSiete,btnOcho,btnNueve,btnCero,btnBorrar,btnRaiz,btnPotencia,btnPorcentaje,btnDiv,btnMul,btnResta,btnSuma,btnMasmenos,btnPunto,btnIgual;
    EditText txtnumero1;
    double num1,num2,res;
    String Operador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operaciones);
        txtnumero1=(EditText)findViewById(R.id.numero1);
        btnUno=(Button) findViewById(R.id.btnuno);
        btnDos=(Button) findViewById(R.id.btndos);
        btnTres=(Button) findViewById(R.id.btntres);
        btnCuatro=(Button) findViewById(R.id.btncuatro);
        btnCinco=(Button) findViewById(R.id.btncinco);
        btnSeis=(Button) findViewById(R.id.btnseis);
        btnSiete=(Button) findViewById(R.id.btnsiete);
        btnOcho=(Button) findViewById(R.id.btnocho);
        btnNueve=(Button) findViewById(R.id.btnnueve);
        btnCero=(Button) findViewById(R.id.btncero);
        btnBorrar=(Button) findViewById(R.id.btnborrar);
        btnRaiz=(Button) findViewById(R.id.btnraiz);
        btnPotencia=(Button) findViewById(R.id.btnpotencia);
        btnPorcentaje=(Button) findViewById(R.id.btnporcentaje);
        btnDiv=(Button) findViewById(R.id.btndiv);
        btnMul=(Button) findViewById(R.id.btnmul);
        btnResta=(Button) findViewById(R.id.btnresta);
        btnSuma=(Button) findViewById(R.id.btnsuma);
        btnMasmenos=(Button) findViewById(R.id.btnmasmenos);
        btnPunto=(Button) findViewById(R.id.btnpunto);
        btnIgual=(Button) findViewById(R.id.btnigual);

        btnCero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtnumero1=(EditText)findViewById(R.id.numero1);
                txtnumero1.setText(txtnumero1.getText()+"0");
            }
        });
        btnUno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtnumero1=(EditText)findViewById(R.id.numero1);
                txtnumero1.setText(txtnumero1.getText()+"1");
            }
        });
        btnDos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtnumero1=(EditText)findViewById(R.id.numero1);
                txtnumero1.setText(txtnumero1.getText()+"2");
            }
        });
        btnTres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtnumero1=(EditText)findViewById(R.id.numero1);
                txtnumero1.setText(txtnumero1.getText()+"3");
            }
        });
        btnCuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtnumero1=(EditText)findViewById(R.id.numero1);
                txtnumero1.setText(txtnumero1.getText()+"4");
            }
        });
        btnCinco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtnumero1=(EditText)findViewById(R.id.numero1);
                txtnumero1.setText(txtnumero1.getText()+"5");
            }
        });
        btnSeis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtnumero1=(EditText)findViewById(R.id.numero1);
                txtnumero1.setText(txtnumero1.getText()+"6");
            }
        });
        btnSiete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtnumero1=(EditText)findViewById(R.id.numero1);
                txtnumero1.setText(txtnumero1.getText()+"7");
            }
        });
        btnOcho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtnumero1=(EditText)findViewById(R.id.numero1);
                txtnumero1.setText(txtnumero1.getText()+"8");
            }
        });
        btnNueve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtnumero1=(EditText)findViewById(R.id.numero1);
                txtnumero1.setText(txtnumero1.getText()+"9");
            }
        });
        btnPunto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtnumero1=(EditText)findViewById(R.id.numero1);
                txtnumero1.setText(txtnumero1.getText()+".");
            }
        });

        btnSuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Operador="+";
                txtnumero1=(EditText)findViewById(R.id.numero1);
                num1 = Double.parseDouble(txtnumero1.getText().toString());
                txtnumero1.setText(" ");
            }
        });
        btnResta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Operador="-";
                txtnumero1=(EditText)findViewById(R.id.numero1);
                num1 = Double.parseDouble(txtnumero1.getText().toString());
                txtnumero1.setText(" ");
            }
        });
        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Operador="*";
                txtnumero1=(EditText)findViewById(R.id.numero1);
                num1 = Double.parseDouble(txtnumero1.getText().toString());
                txtnumero1.setText(" ");
            }
        });
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Operador="/";
                txtnumero1=(EditText)findViewById(R.id.numero1);
                num1 = Double.parseDouble(txtnumero1.getText().toString());
                txtnumero1.setText(" ");
            }
        });
        btnMasmenos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Operador="+/-";
                txtnumero1=(EditText)findViewById(R.id.numero1);
                num1 = Double.parseDouble(txtnumero1.getText().toString());
                num1=num1*(-1);
                txtnumero1.setText(" " + num1);
            }
        });
        btnPorcentaje.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Operador="%";
                txtnumero1=(EditText)findViewById(R.id.numero1);
                num1 = Double.parseDouble(txtnumero1.getText().toString());
                txtnumero1.setText(" ");
            }
        });
        btnBorrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtnumero1.setText("");
            }
        });

        btnRaiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Operador="()";
                txtnumero1=(EditText)findViewById(R.id.numero1);
                num1 = Double.parseDouble(txtnumero1.getText().toString());
                txtnumero1.setText(" ");
            }
        });

        btnPotencia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Operador="^";
                txtnumero1=(EditText)findViewById(R.id.numero1);
                num1 = Double.parseDouble(txtnumero1.getText().toString());
                txtnumero1.setText(" ");
            }
        });



        btnIgual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtnumero1=(EditText)findViewById(R.id.numero1);
                num2= Double.parseDouble(txtnumero1.getText().toString());
                if (Operador.equals("+")){
                    res=num1+num2;
                }else if (Operador.equals("-")){
                    res=num1-num2;
                }else if (Operador.equals("*")){
                    res=num1*num2;
                }else if (Operador.equals("/")){
                    res=num1/num2;
                } else if (Operador.equals("%")){
                    res=(num1/100)*num2;
                } else if (Operador.equals("()")){
                    res=Math.pow(num1,1/num2);
                } else if (Operador.equals("^")){
                    res=Math.pow(num1,num2);
                }
                txtnumero1.setText(" " + res);
            }
        });
    }
}