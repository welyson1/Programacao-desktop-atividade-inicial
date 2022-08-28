package com.model.ex2;

import java.util.Random;

public class Ola {
    /**
     * Apresenta alguma saudação aleatoria para o usuario
     * @return uma saudação aleatoria
     */
    public String cumprimenta() {
        Random random = new Random();
        int numero = random.nextInt(2);
        String saudacao = "";

        switch (numero) {
            case 0:
                saudacao = "Eae, Tudo beleza?";
                break;
            case 1:
                saudacao ="Oi, você está bem?";
                break;            
            case 2:
                saudacao ="Olá, como você está?";
                break;
        
            default:
                break;
        }  
        return saudacao;
    }
}
