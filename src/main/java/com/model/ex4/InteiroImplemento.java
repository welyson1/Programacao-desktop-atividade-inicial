package com.model.ex4;

import com.model.ex3.Inteiro;

public class InteiroImplemento extends Inteiro {
    
    /**
     * Faz a soma de no valor armazenado
     * @param v valor para somar
     * @return valor somado pelo parametro
     */
    public int soma(int v){        
        /*Soma v ao valor deste objeto (valor + v). Este objeto passa a representar o novo
    valor, que também deve ser devolvido pelo método.*/
        this.setValor(this.getValor() + v);
        return this.getValor();
    }
    
    /**
     * Faz a subtração do valor
     * @param v
     * @return valor subtraido pelo parametro
     */
    public int subtrai(int v){        
        /*Subtrai v do valor deste objeto (valor - v). Este objeto passa a representar o novo
    valor, que também deve ser devolvido pelo método.*/
        int vv = this.getValor() - v;
        this.setValor(vv);
        return this.getValor();
    }
    
    /**
     * Faz a multiplicação do valor armazenado pelo valor passado
     * @param v valor para multiplicar
     * @return valor multiplicação pelo parametro
     */
    public int multiplicaPor(int v){        
        /*Multiplica o valor deste objeto por v (valor * v). Este objeto passa a representar o
    novo valor, que também deve ser devolvido pelo método.*/
        this.setValor(this.getValor() * v);
        return this.getValor();
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
            resultado = ((int)this.getValor()/divisor);
            return resultado;
        }else{
            System.out.println("Impossivel dividir por zero");
            System.out.println("Valor inalterado: " + this.getValor());
        }
        return this.getValor();              
    }    

}
