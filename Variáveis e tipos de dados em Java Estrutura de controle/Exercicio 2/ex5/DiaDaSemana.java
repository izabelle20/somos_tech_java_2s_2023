/* Exercício 5: Dia da Semana com switch
Peça ao usuário para inserir um número de 1 a 7 representando um dia da semana. Use uma estrutura switch para exibir o nome do dia correspondente (por exemplo, 1 = Domingo, 2 = Segunda-feira, etc.). Se o usuário inserir um número fora do intervalo, mostre uma mensagem de erro. */


import java.util.Scanner;

public class DiaDaSemana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número de 1 a 7: ");
        int numeroDia = scanner.nextInt();
        
        String nomeDia;
        
        switch (numeroDia) {
            case 1:
                nomeDia = "Domingo";
                break;
            case 2:
                nomeDia = "Segunda-feira";
                break;
            case 3:
                nomeDia = "Terça-feira";
                break;
            case 4:
                nomeDia = "Quarta-feira";
                break;
            case 5:
                nomeDia = "Quinta-feira";
                break;
            case 6:
                nomeDia = "Sexta-feira";
                break;
            case 7:
                nomeDia = "Sábado";
                break;
            default:
                nomeDia = "Número inválido";
        }
        
        System.out.println("O dia correspondente ao número " + numeroDia + " é " + nomeDia);
        
        scanner.close();
    }
}
