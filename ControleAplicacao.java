package com.example.projeto_senai;

import java.util.HashMap;

public class ControleAplicacao {
    private static HashMap<String, Handler> controleHash = new HashMap<String, Handler>();
    static{
        String numKey = "numeroChave";

        AddHandler addHandler = new AddHandler();
        controleHash.put("+", addHandler);

        SubtrairHandler subtrairHandler = new SubtrairHandler();
        controleHash.put("-", subtrairHandler);

        MultiplicarHandler multiplicarHandler = new MultiplicarHandler();
        controleHash.put("x", multiplicarHandler);

        DividirHandler dividirHandler = new DividirHandler();
        controleHash.put("/", dividirHandler);

        IgualHandler igualHandler = new IgualHandler();
        controleHash.put("=", igualHandler);

        ValorNumeroHandler valorNumeroHandler = new ValorNumeroHandler();
        controleHash.put(numKey, valorNumeroHandler);
    }

    public static void handleRequest(String command, Object ... parameters) {
        Handler operacao = controleHash.get(command);
        operacao.setOperacao(parameters);
    }
}
