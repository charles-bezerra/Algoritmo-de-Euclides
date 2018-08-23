package com.example.demonstracao;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Tela extends AppCompatActivity
{
    private int resto = 1;
    private int resultado = 0;
    private EditText txt_dividendo;
    private EditText txt_divisor;
    private Button botao;
    private String valor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_main);
        botao = findViewById(R.id.btn_calcular); //Recuperando os elementos de um layout

        botao.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                txt_dividendo = findViewById(R.id.InputDividendo);
                txt_divisor = findViewById(R.id.InputDivisor);
                if(txt_dividendo.getText().toString() != "" && txt_divisor.getText().toString() != "") {
                    int a = Integer.parseInt(txt_dividendo.getText().toString());
                    int b = Integer.parseInt(txt_divisor.getText().toString());

                    Tela t = new Tela();
                    int resul = t.Calculo(a, b);

                    valor = Integer.toString(resul);
                }
                else{
                    valor = "OI";
                }
                TextView txt_result = findViewById(R.id.Result);
                txt_result.setText(valor);
            }
        });


    }
    public int Calculo(int a,int b){
        int aux1;
        int aux2;
        if(a == 0 || b == 0) {
            resultado = 0;
        }else if(a>b){
            while (resto != 0){
                aux1 = a;
                aux2 = b;
                b = a % b;
                a = aux2;
                resto = aux1%aux2;
                resultado = aux2;
            }
        }else if(b>a){
            while (resto != 0){
                aux1 = b;
                aux2 = a;
                a = b % a;
                b = aux2;
                resto = aux1%aux2;
                resultado = aux2;
            }
        }else{
            resultado = a;
        }
        return resultado;
    }

}
