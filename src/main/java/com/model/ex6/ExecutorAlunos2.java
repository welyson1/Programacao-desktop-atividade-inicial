package com.model.ex6;

import java.util.Scanner;

public class ExecutorAlunos2 {
    public static void main(String[] args) {
        Aluno2 alunos2 = new Aluno2();
        Scanner leitorScanner = new Scanner(System.in);

        System.out.print("Digite a nota 1: ");
        float n1 = leitorScanner.nextFloat();
        alunos2.recebeNota1(n1);

        System.out.print("Digite a nota 2: ");
        float n2 = leitorScanner.nextFloat();
        alunos2.recebeNota2(n2);

        System.out.print("Digite a nota 3: ");
        float n3 = leitorScanner.nextFloat();
        alunos2.recebeNota3(n3);

        System.out.print("Digite a nota 4: ");
        float n4 = leitorScanner.nextFloat();
        alunos2.recebeNota4(n4);

        alunos2.imprimeMédia();    
        
        alunos2.TestaAluno2();
    }
}
