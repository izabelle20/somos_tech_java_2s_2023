/*Exercício 2: Conversão de Temperatura
Escreva um programa Java que declare uma variável do tipo double para representar uma temperatura em graus Celsius. Em seguida, converta essa temperatura para Fahrenheit usando a fórmula: Fahrenheit = (Celsius * 9/5) + 32 e exiba o resultado. */

import java.util.Scanner;


public class ConversaoTemperatura {
    public static void main(String[] args) {
        // Declare uma variável do tipo double para representar a temperatura em graus Celsius
        double temperaturaCelsius = 25.0; // Você pode substituir este valor pela temperatura desejada
        
        // Converta a temperatura para Fahrenheit usando a fórmula
        double temperaturaFahrenheit = (temperaturaCelsius * 9 / 5) + 32;
        
        // Exiba o resultado da conversão
        System.out.println("A temperatura em Fahrenheit é: " + temperaturaFahrenheit + "°F");
    }
}
