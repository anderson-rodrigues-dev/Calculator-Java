package com.example.projeto_senai;

import android.widget.TextView;

public class SubtrairHandler implements Handler{
    private double valor1;
    private double valor2;
    private double resultado;
    private String resultadoString;

    @Override
    public void setOperacao(Object... parametros) {
        CalculatorActivity calculatorActivity = (CalculatorActivity) parametros[0];

        TextView txtEntrada = (TextView) parametros[1];
        TextView txtSolucao = (TextView) parametros[2];

        valor1 = Double.parseDouble(txtEntrada.getText().toString());
        valor2 = Double.parseDouble(txtSolucao.getText().toString());

        resultado = valor2 - valor1;
        resultadoString = Double.toString(resultado);

        txtSolucao.setText(resultadoString);
        txtEntrada.setText("");
    }
}
