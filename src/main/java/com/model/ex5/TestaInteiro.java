package com.model.ex5;

import com.model.ex3.Inteiro;
import com.model.ex4.InteiroImplemento;

public class TestaInteiro {
    
    public void testador() {
        Inteiro inteiro = new Inteiro();
        InteiroImplemento inteiroImplemento = new InteiroImplemento();
        
        //Entrada de valor
        inteiro.carregaValor(6);

        //Teste divisor != 0
        System.out.println("Valor: " + inteiro.getValor());
        inteiroImplemento.dividePor(5); 

        //Testew divisão por zero
        inteiroImplemento.dividePor(0);

        //Teste Subtrair valor
        inteiroImplemento.subtrai(5);

        //Teste de valor absoluto
        inteiro.carregaValor(-5);
        System.out.println("Valor absoluto é: " + inteiro.devolveValorAbsoluto());

       //Testa se a classe pode imprimir o valor da variavel na tela
       inteiro.imprime();

       //Testa a soma do valor com o valor passado por parametro
       inteiroImplemento.soma(5); 
    }
}
