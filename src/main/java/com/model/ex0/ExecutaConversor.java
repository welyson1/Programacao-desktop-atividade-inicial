package com.model.ex0;

import java.util.Scanner;

public class ExecutaConversor {

    public static void main(String[] args) {
        System.out.print("Digite o valor que você quer converter: ");
        Scanner valorScanner = new Scanner(System.in);
        float valor = valorScanner.nextFloat();
        
        System.out.println("1 - celsius2Fahrenheit");
        System.out.println("2 - celsius2Kelvin");
        System.out.println("3 - fahrenheit2Celsius");
        System.out.println("4 - fahrenheit2Kelvin");
        System.out.println("5 - kelvin2Celsius");
        System.out.println("6 - kelvin2Fahrenheit");
        System.out.print("Que tipo de conversão você quer fazer? ");
        Scanner opcaoScanner = new Scanner(System.in);
        int opcao = opcaoScanner.nextInt();

        Conversores converte = new Conversores();
        switch (opcao) {
            case 1:
                System.out.println("O equivalente em Fahrenheit é: " + converte.celsius2Fahrenheit(valor)); 
                break;
            
            case 2:
                System.out.println("O equivalente em Fahrenheit é: " + converte.celsius2Kelvin(valor)); 
                break;

            case 3:
                System.out.println("O equivalente em Fahrenheit é: " + converte.fahrenheit2Celsius(valor)); 
                break;
            
            case 4:
                System.out.println("O equivalente em Fahrenheit é: " + converte.fahrenheit2Kelvin(valor)); 
                break;

            case 5:
                System.out.println("O equivalente em Fahrenheit é: " + converte.kelvin2Celsius(valor)); 
                break;
            
            case 6:
                System.out.println("O equivalente em Fahrenheit é: " + converte.kelvin2Fahrenheit(valor)); 
                break;
        
            default:
                System.out.println("Essa conversão ainda não existe :(");
                break;
        }
    }
}
