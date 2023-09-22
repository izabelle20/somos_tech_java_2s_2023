/*Exercício 1: Cálculo da Média 
Escreva um programa Java que declare três variáveis do tipo double para representar as notas de um aluno em três provas diferentes. Calcule e exiba a média das notas.
 */

 import java.util.Scanner;
 
 public class CalculoMedia {
    public static void main(String[] args) {
        // Declare três variáveis do tipo double para representar as notas das provas
        double nota1 = 7.5;
        double nota2 = 8.0;
        double nota3 = 9.5;
        
        // Calcule a média das notas
        double media = (nota1 + nota2 + nota3) / 3.0;
        
        // Exiba a média das notas
        System.out.println("A média das notas é: " + media);
    }
}
