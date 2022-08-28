package com.model.ex6;

public class Aluno2 {
    float n1, n2, n3, n4;
    /**
     * @param n - é a nota 1 para composição da media
     */
    public void recebeNota1(float n){
        n1 = n;
    }

    /**
     * @param n - é a nota 2 para composição da media
     */
    public void recebeNota2(float n){
        n2 = n;
    }

    /**
     * @param n - é a nota 3 para composição da media
     */
    public void recebeNota3(float n){
        n3 = n;
    }

    /**
     * @param n - é a nota 4 para composição da media
     */
    public void recebeNota4(float n){
        n4 = n;
    }
    
    /**
     * Calcula a média das notas;
     * Pega o valor da media e testa para gerar o status:
     * - Aprovado
     * - Reprovado
     */
    public String imprimeMédia() {
        //Calculo da média
        float media = (n1+n2+n3+n4)/4;

        //Condição de status
        float resultaNotas = (n1+n2+n3+n4)/4;
        String returnResultado = "";

        if (resultaNotas >= 7) {
            returnResultado = "Aprovado com: " + media;
        }        
        if (resultaNotas < 7) {
            returnResultado = "Reprovado com: " + media;
        }

        return returnResultado;
        
    }

    public void TestaAluno2() {
       //Testa se os metodos da classe Aluno2 estão corretos
       System.out.println("");
       recebeNota1((float) 5.2);
       imprimeMédia();
    }
}
