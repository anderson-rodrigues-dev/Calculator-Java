package com.example.projeto_senai;

import android.widget.TextView;

public class IgualHandler implements Handler{
    @Override
    public void setOperacao(Object... parametros) {
        CalculatorActivity calculatorActivity = (CalculatorActivity) parametros[0];

        TextView txtEntrada = (TextView) parametros[1];
        TextView txtSolucao = (TextView) parametros[2];

        txtSolucao.setText(txtEntrada.getText().toString());
        txtEntrada.setText("");
    }
}
