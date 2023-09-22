/* Exercício 4: Cálculo de Média com Condição if/else
Crie um programa que solicite ao usuário duas notas e calcule a média. Em seguida, utilize uma estrutura if/else para determinar se o aluno foi aprovado (média maior ou igual a 6) ou reprovado.*/

import java.util.Scanner;

public class CalculoMediaAprovacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicita ao usuário as duas notas
        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();
        
        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();
        
        // Calcula a média das notas
        double media = (nota1 + nota2) / 2;
        
        // Verifica se o aluno foi aprovado ou reprovado
        if (media >= 6.0) {
            System.out.println("O aluno foi aprovado com média " + media);
        } else {
            System.out.println("O aluno foi reprovado com média " + media);
        }
        
        scanner.close();
    }
}
