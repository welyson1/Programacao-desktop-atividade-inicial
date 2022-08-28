package com.model.ex4;

import com.model.ex3.Inteiro;

public class InteiroImplemento {
    Inteiro inteiro = new Inteiro();
    public int valor;
        
    public int soma(int v){        
        /*Soma v ao valor deste objeto (valor + v). Este objeto passa a representar o novo
    valor, que também deve ser devolvido pelo método.*/
    inteiro.setValor(inteiro.getValor() + v);
        return inteiro.getValor();
    }
    
    public int subtrai(int v){        
        /*Subtrai v do valor deste objeto (valor - v). Este objeto passa a representar o novo
    valor, que também deve ser devolvido pelo método.*/
        return valor = valor - v;
    }
    
    public int multiplicaPor(int v){        
        /*Multiplica o valor deste objeto por v (valor * v). Este objeto passa a representar o
    novo valor, que também deve ser devolvido pelo método.*/
        return valor = valor * v;
    }
    
    public int dividePor(int divisor){        
        /*Verifica se divisor é diferente de zero. Se não, imprime uma mensagem de erro e
    não faz nada (devolve o valor inalterado). Se for, divide o valor deste objeto por
    v (valor / divisor, divisão inteira). Este objeto passa a representar o novo valor,
    que também deve ser devolvido pelo método.*/
        if (divisor != 0) {
            int resultado = ((int)valor/divisor);  
            System.out.println(resultado);   
        }else{
            System.out.println("Impossivel dividir por zero");
            System.out.println("Valor inalterado: " + valor);
        }
        return divisor;              
    }
    

}
