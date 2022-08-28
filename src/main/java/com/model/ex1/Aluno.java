package com.model.ex1;

public class Aluno {    
    /**
     * Calcula a media final de quatro notas
     * Os parametros abaixo aceitam float
     * @param p1 Nota 1
     * @param p2 Nota 2
     * @param p3 Nota 3
     * @param p4 Nota 4
     * @return Status do aluno com a media final calculada
     */
    public String mediaNotas(float p1, float p2, float p3, float p4){
        float resultaNotas = (p1+p2+p3+p4)/4;
        String returnResultado = "";

        if (resultaNotas >= 7) {
            returnResultado = "Aprovado com: " + resultaNotas;
        }        
        if (resultaNotas < 7) {
            returnResultado = "Reprovado com: " + resultaNotas;
        }

        return returnResultado;
    }
}