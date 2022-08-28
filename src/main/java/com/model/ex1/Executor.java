package com.model.ex1;

import java.util.Scanner;

public class Executor {
    public static void main(String[] args) {
      
        Aluno aluno = new Aluno();
        Scanner leitorScanner = new Scanner(System.in);
        float p1 = leitorScanner.nextFloat();
        float p2 = leitorScanner.nextFloat();
        float p3 = leitorScanner.nextFloat();
        float p4 = leitorScanner.nextFloat();

        System.out.println(aluno.mediaNotas(p1,p2,p3,p4));
    }
}