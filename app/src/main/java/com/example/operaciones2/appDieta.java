package com.example.operaciones2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Locale;

public class appDieta extends AppCompatActivity {

    TextView bienvenidaUser, msjCondicion, txtDieta;
    String mensajeDieta = " ";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_dieta);

        bienvenidaUser = (TextView) findViewById(R.id.bienvenida1);
        msjCondicion = (TextView) findViewById(R.id.condicion);
        txtDieta = (TextView) findViewById(R.id.textDieta);
        String user = getIntent().getStringExtra("user");
        String condicion = getIntent().getStringExtra("condicion");
        Double IMC = getIntent().getExtras().getDouble("icmCommand");
        bienvenidaUser.setText("Hola mi estimado  " + user.toUpperCase(Locale.ROOT));
        msjCondicion.setText(condicion);

        if(IMC<16)
            mensajeDieta="El consumo de carbohidratos y proteínas es importante para recuperar las energías, son un buen complemento para tener energia todo el dia.";
        else if (IMC >= 16 & IMC<17)
            mensajeDieta="Las grasas son necesarias para comenzar a agarrar el volumen corporal acompañado de proteinas y carbohidratos.";
        else if (IMC >= 17 & IMC<18.5)
            mensajeDieta="Las bebidas saludables con leche y fruta, con algo de lianza molida, son altamente aconsejables. Por el contrario, no se recomienda el café, refrescos dietéticos u otras bebidas con pocas calorías o valor nutricional.";
        else if (IMC >= 18.5 & IMC<25)
            mensajeDieta="Te aconsejamos seguir la misma rutina alimenticia acompañada de ejercicios para  que puedas mantener tu indice de masa corporal";
        else if (IMC >= 25 & IMC<30)
            mensajeDieta="Reduce el consumo de grasas e intenta reemplazar esos alimentos por proteinas y carbohidratos, el consumo de agua es importante acompañada de ejercicio";

        else if (IMC >= 30 & IMC<35)
            mensajeDieta="Evitar a grasas y la comida chatarra, aun podemos reemplazar las grasas por proteinas, para poder regresar a un buen peso";

        else if (IMC >= 35 & IMC<40)
            mensajeDieta="Dejar la comida chatarra y grasas, es importante que se consuman proteinas de manera medida y recomendada por un doctor";

        else
            mensajeDieta="Consultar con un doctor, ya que es un punto que puede ser peligroso para la persona, evite grasas y comida chatarra. Es importante un consumo reducido de carbohidratos proteinas pero de manera medida, consumo de agua";

        txtDieta.setText(mensajeDieta);


    }
}