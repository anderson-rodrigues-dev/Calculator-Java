package com.example.projeto_senai;

import com.example.projeto_senai.*;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class CalculatorActivity extends Activity {
    private Button btnZero;
    private Button btnUm;
    private Button btnDois;
    private Button btnTres;
    private Button btnQuatro;
    private Button btnCinco;
    private Button btnSeis;
    private Button btnSete;
    private Button btnOito;
    private Button btnNove;
    private Button btnAdd;
    private Button btnSubtrair;
    private Button btnMultiplicar;
    private Button btnDividir;
    private Button btnDecimal;
    private Button btnIgual;

    private Button btnLimpar;
    private Button btnC;

    private TextView txtEntrada;
    private TextView txtSolucao;
    private CalculatorActivity activity;
    protected String comando;
    protected String operador;
    protected String numeroChave;
    protected String btnNumber;
    protected int counter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculator);
        activity = this;
        txtEntrada = (TextView) findViewById(R.id.txtEntrada);
        txtSolucao = (TextView) findViewById(R.id.txtSolucao);

        comando = "=";
        operador = "";
        numeroChave = "numeroChave";

        btnZero = (Button) findViewById(R.id.btnZero);
        btnZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnNumber = btnZero.getText().toString();
                ControleAplicacao.handleRequest(numeroChave, btnNumber, txtEntrada);
            }
        });

        btnUm = (Button) findViewById(R.id.btnUm);
        btnUm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnNumber = btnUm.getText().toString();
                ControleAplicacao.handleRequest(numeroChave, btnNumber, txtEntrada);
            }
        });

        btnDois = (Button) findViewById(R.id.btnDois);
        btnDois.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnNumber = btnDois.getText().toString();
                ControleAplicacao.handleRequest(numeroChave, btnNumber, txtEntrada);
            }
        });

        btnTres = (Button) findViewById(R.id.btnTreis);
        btnTres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnNumber = btnTres.getText().toString();
                ControleAplicacao.handleRequest(numeroChave, btnNumber, txtEntrada);
            }
        });

        btnQuatro = (Button) findViewById(R.id.btnQuatro);
        btnQuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnNumber = btnQuatro.getText().toString();
                ControleAplicacao.handleRequest(numeroChave, btnNumber, txtEntrada);
            }
        });

        btnCinco = (Button) findViewById(R.id.btnCinco);
        btnCinco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnNumber = btnCinco.getText().toString();
                ControleAplicacao.handleRequest(numeroChave, btnNumber, txtEntrada);
            }
        });

        btnSeis = (Button) findViewById(R.id.btnSeis);
        btnSeis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnNumber = btnSeis.getText().toString();
                ControleAplicacao.handleRequest(numeroChave, btnNumber, txtEntrada);
            }
        });

        btnSete = (Button) findViewById(R.id.btnSete);
        btnSete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnNumber = btnSete.getText().toString();
                ControleAplicacao.handleRequest(numeroChave, btnNumber, txtEntrada);
            }
        });

        btnOito = (Button) findViewById(R.id.btnOito);
        btnOito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnNumber = btnOito.getText().toString();
                ControleAplicacao.handleRequest(numeroChave, btnNumber, txtEntrada);
            }
        });

        btnNove = (Button) findViewById(R.id.btnNove);
        btnNove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnNumber = btnNove.getText().toString();
                ControleAplicacao.handleRequest(numeroChave, btnNumber, txtEntrada);
            }
        });

        btnDecimal = (Button) findViewById(R.id.btnDecimal);
        btnDecimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String textoEntrada = txtEntrada.getText().toString();
                counter = textoEntrada.indexOf(",");

                if(counter == -1){
                    btnNumber = btnDecimal.getText().toString();
                    ControleAplicacao.handleRequest(numeroChave, btnNumber, txtEntrada);
                }
            }
        });

        btnSubtrair = (Button) findViewById(R.id.btnSubtrair);
        btnSubtrair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operador = btnSubtrair.getText().toString();
                ControleAplicacao.handleRequest(comando, activity, txtEntrada, txtSolucao);
                comando = operador;
            }
        });

        btnMultiplicar = (Button) findViewById(R.id.btnMultiplicar);
        btnMultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operador = btnMultiplicar.getText().toString();
                ControleAplicacao.handleRequest(comando, activity, txtEntrada, txtSolucao);
                comando = operador;
            }
        });

        btnDividir = (Button) findViewById(R.id.btnDividir);
        btnDividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operador = btnDividir.getText().toString();
                ControleAplicacao.handleRequest(comando, activity, txtEntrada, txtSolucao);
                comando = operador;
            }
        });

        btnAdd = (Button) findViewById(R.id.btnAdd);
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operador = btnAdd.getText().toString();
                ControleAplicacao.handleRequest(comando, activity, txtEntrada, txtSolucao);
                comando = operador;
            }
        });

        btnIgual = (Button) findViewById(R.id.btnIgual);
        btnIgual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operador = btnIgual.getText().toString();
                ControleAplicacao.handleRequest(comando, activity, txtEntrada, txtSolucao);
                comando = operador;
            }
        });

        btnLimpar = (Button) findViewById(R.id.btnLimpar);
        btnLimpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtEntrada.setText("");
                txtSolucao.setText("");
                comando = "=";
                operador = "=";
            }
        });

        btnC = (Button) findViewById(R.id.btnC);
        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    String texto = txtEntrada.getText().toString();
                    int tamanho = texto.length() - 1;
                    String textoNovo = texto.substring(0,tamanho);
                    txtEntrada.setText(textoNovo);
                }
                catch (Exception e){
                    e.printStackTrace();
                }
            }
        });

    }
}
