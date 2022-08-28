package com.model.ex4;

import com.model.ex3.Inteiro;

public class ExecutorInteiro {
    public static void main(String[] args) {
        Inteiro inteiro = new Inteiro();
        InteiroImplemento inteiroImplemento = new InteiroImplemento();
        
        //Ex3        
        inteiro.carregaValor(14);
        inteiro.devolveValor();
        inteiro.carregaValor(-473158);
        inteiro.devolveValor();
        inteiro.devolveValorAbsoluto();
        inteiro.imprime();

        //Ex4
        inteiro.carregaValor(15);
        inteiroImplemento.subtrai(20);
        inteiro.devolveValor();        
    }
}
