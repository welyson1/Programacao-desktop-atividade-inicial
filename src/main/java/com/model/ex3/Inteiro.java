package com.model.ex3;

public class Inteiro {
    private int valor;
    
    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public void carregaValor(int v){ 
        //Carrega o valor passa por parametro na variavel da classe
        setValor(v);
    }

    public int devolveValor(){
        //Retorna o valor da variavel valor    
        return getValor();    
    }

    public int devolveValorAbsoluto(){
        //Retorna o valor absoluto do valor
        setValor(Math.abs(getValor()));
        return getValor();
    }

    public void imprime(){
        //Imprime o conteudo da variavel valor
        System.out.println(getValor());
    }    

}
