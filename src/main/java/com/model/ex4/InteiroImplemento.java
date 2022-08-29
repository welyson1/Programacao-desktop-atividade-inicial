package com.model.ex4;

import com.model.ex3.Inteiro;

public class InteiroImplemento {
    Inteiro inteiro = new Inteiro();
        
    public int soma(int v){        
        /*Soma v ao valor deste objeto (valor + v). Este objeto passa a representar o novo
    valor, que também deve ser devolvido pelo método.*/
        inteiro.setValor(inteiro.getValor() + v);
        return inteiro.getValor();
    }
    
    public int subtrai(int v){        
        /*Subtrai v do valor deste objeto (valor - v). Este objeto passa a representar o novo
    valor, que também deve ser devolvido pelo método.*/
        inteiro.setValor(inteiro.getValor() - v);
        return inteiro.getValor();
    }
    
    public int multiplicaPor(int v){        
        /*Multiplica o valor deste objeto por v (valor * v). Este objeto passa a representar o
    novo valor, que também deve ser devolvido pelo método.*/
        inteiro.setValor(inteiro.getValor() * v);
        return inteiro.getValor();
    }
    
    /**
     * Divide a entrada recebida pelo valor
     * @param divisor valo para dividir o valor
     * @return retorna o resultado
     */
    public int dividePor(int divisor){        
        /*Verifica se divisor é diferente de zero. Se não, imprime uma mensagem de erro e
    não faz nada (devolve o valor inalterado). Se for, divide o valor deste objeto por
    v (valor / divisor, divisão inteira). Este objeto passa a representar o novo valor,
    que também deve ser devolvido pelo método.*/
        int resultado = 0;
        if (divisor != 0) {
            resultado = (inteiro.getValor()/divisor);
            return resultado;
        }else{
            System.out.println("Impossivel dividir por zero");
            System.out.println("Valor inalterado: " + inteiro.getValor());
        }
        return inteiro.getValor();              
    }    

}
