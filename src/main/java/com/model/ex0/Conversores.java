package com.model.ex0;

public class Conversores {
    /**
     * Faz a conversão de celsius para Fahrenheit
     * @param celsius float
     * @return float resultado da conversão em Fahrenheit
     */
    public float celsius2Fahrenheit(float celsius){
        return ((float) (celsius * 1.8 + 32));
    }

    /**
     * Faz a conversão de celsius para Kelvin
     * @param celsius float
     * @return float resultado da conversão em Kelvin
     */
    public float celsius2Kelvin(float celsius){
        return celsius + 273;
    }

    /**
     * Faz a conversão de fahrenheit para Celsius
     * @param fahrenheit float
     * @return float resultado da conversão em Celsius
     */
    public float fahrenheit2Celsius(float fahrenheit){
        return (float) ((fahrenheit - 32)/1.8);
    }

    /**
     * Faz a conversão de fahrenheit para Kelvin
     * @param fahrenheit float
     * @return float resultado da conversão em Kelvin
     */
    public float fahrenheit2Kelvin(float fahrenheit){
        return (float) celsius2Kelvin(fahrenheit2Celsius(fahrenheit));
    }

    /**
     * Faz a conversão de kelvin para Celsius
     * @param kelvin float
     * @return float resultado da conversão em Celsius
     */
    public float kelvin2Celsius(float kelvin){
        return kelvin - 273;
    }

    /**
     * Faz a conversão de kelvin para Fahrenheit
     * @param kelvin float
     * @return float resultado da conversão em Fahrenheit
     */
    public float kelvin2Fahrenheit(float kelvin){
        return (float) ( kelvin - 273.15) * 9/5 + 32;
    }
}
