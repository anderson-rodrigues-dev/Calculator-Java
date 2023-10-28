package com.example.projeto_senai;

import android.widget.TextView;

public class ValorNumeroHandler implements Handler{

    @Override
    public void setOperacao(Object... parametros) {
        String numString = (String) parametros[0];
        TextView txtEntrada = (TextView) parametros[1];

        String num = txtEntrada.getText().toString();

        num = num.concat(numString);
        txtEntrada.setText(num);
    }
}
