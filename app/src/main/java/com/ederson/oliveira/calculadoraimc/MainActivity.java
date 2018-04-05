package com.ederson.oliveira.calculadoraimc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void btnCalcularOnClick(View v){

        TextView lblResultado = (TextView)findViewById(R.id.lblResultado);
        EditText txtPeso = (EditText)findViewById(R.id.txtPeso);
        EditText txtAltura = (EditText)findViewById(R.id.txtAltura);

        int peso = Integer.parseInt(txtPeso.getText().toString());
        float altura = Float.parseFloat(txtAltura.getText().toString());

        float resultado = peso / (altura * altura);
        if(resultado < 19){
            lblResultado.setText("Voce esta muito magro precisa comer");
        }
        else if(resultado > 32){

            lblResultado.setText("voce esta obeso, precisa emagrecer");

        }
        else {
            lblResultado.setText("Voce esta em forma");
        }


    }

    public void chamarSegundaTela(View view){

                Intent it = new Intent(MainActivity.this, segundaTela.class);
                startActivity(it);


    }


}
