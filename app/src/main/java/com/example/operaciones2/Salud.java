package com.example.operaciones2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;

public class Salud extends AppCompatActivity {
    EditText etNombre,etAltura,etPeso;
    Button btnCalcular,btnLimpiar;
    RadioButton rFemenino,rMasculino;
    String mensaje = " ";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_salud);

        etNombre=(EditText) findViewById(R.id.txtNombre);
        etAltura=(EditText) findViewById(R.id.txtAltura);
        etPeso=(EditText) findViewById(R.id.txtPeso);
        btnCalcular=(Button) findViewById(R.id.btnCalcular);
        btnLimpiar=(Button) findViewById(R.id.btnLimpiar);
        rFemenino=(RadioButton) findViewById(R.id.btnFemenino);
        rMasculino=(RadioButton) findViewById(R.id.btnMasculino);



        btnLimpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Limpiar();
            }
        });

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CalcularIMC();
            }
        });

    }

    private void Limpiar() {
        etNombre.setText("");
        etAltura.setText("");
        etPeso.setText("");
    }

    private String MensajeIMC(double IMC){

        if(IMC<16)
            mensaje="Bajo peso muy grave ";
        else if (IMC >= 16 & IMC<17)
            mensaje="Bajo peso grave";
        else if (IMC >= 17 & IMC<18.5)
            mensaje="Bajo peso";
        else if (IMC >= 18.5 & IMC<25)
            mensaje="Peso Normal";
        else if (IMC >= 25 & IMC<30)
            mensaje="Sobrepeso";
        else if (IMC >= 30 & IMC<35)
            mensaje="Obesidad grado I";
        else if (IMC >= 35 & IMC<40)
            mensaje="Obesidad grado II";
        else
            mensaje="Obesidad grado III";
        return mensaje;
    }

    private void CalcularIMC(){
        String nombre=etNombre.getText().toString();
        Double altura=Double.valueOf(etAltura.getText().toString());
        Double peso=Double.valueOf(etPeso.getText().toString());
        double IMC=peso/Math.pow(altura,2);

        Toast.makeText(this, "Tu IMC es"+String.format("%.2f",IMC) + MensajeIMC(IMC),Toast.LENGTH_SHORT).show();
        if(rFemenino.isChecked()==true)
            Toast.makeText(this, "ERES MUJER", Toast.LENGTH_SHORT).show();
        else if(rMasculino.isChecked()==true)
            Toast.makeText(this, "ERES VARON", Toast.LENGTH_SHORT).show();
        else
            Toast.makeText(this, "No Eligio Genero", Toast.LENGTH_SHORT).show();

        Intent dieta = new Intent(Salud.this,appDieta.class);
        dieta.putExtra("user", nombre);
        dieta.putExtra("condicion", mensaje);
        dieta.putExtra("icmCommand", IMC);
        startActivity(dieta);

    }

    private void setupFloatingLabelError() {
        final TextInputLayout floatingUsernameLabel = (TextInputLayout) findViewById(R.id.username_text_input_layout);
        floatingUsernameLabel.getEditText().addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            // ...
            @Override
            public void onTextChanged(CharSequence text, int start, int count, int after) {
                if (text.length() > 0 && text.length() <= 4) {
                    floatingUsernameLabel.setError(getString(R.string.username_required));
                    floatingUsernameLabel.setErrorEnabled(true);
                } else {
                    floatingUsernameLabel.setErrorEnabled(false);
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }

        });
    }


}