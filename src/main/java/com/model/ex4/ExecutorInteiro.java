package com.model.ex4;

public class ExecutorInteiro {
    public static void main(String[] args) {
        InteiroImplemento inteiroImplemento = new InteiroImplemento();
        
        //Ex4
        inteiroImplemento.carregaValor(15);
        System.out.println(inteiroImplemento.getValor());     
        inteiroImplemento.subtrai(5);
        System.out.println(inteiroImplemento.getValor());         
    }
}
