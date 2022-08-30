package com.model.ex3;

public class Inteiro {
    public int valor;
    
    public int getValor() {
        return this.valor;
    }

    public void setValor(int v) {
        this.valor = v;
    }

    /**
     * Carrega o valor passado para a variavel valor
     * @param v valor para armazenar
     */
    public void carregaValor(int v){ 
        //Carrega o valor passa por parametro na variavel da classe
        setValor(v);
    }

    /**
     * Devolve o valor armazenado
     * @return valor armazenado
     */
    public int devolveValor(){
        //Retorna o valor da variavel valor    
        return getValor();    
    }

    /**
     * Mostra o valor absoluto do valor armazenado
     * @return valor absoluto
     */
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
