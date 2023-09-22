/*
Exercício 3: Concatenação de Strings
Crie um programa Java que declare duas variáveis do tipo String para armazenar o primeiro nome e o sobrenome de uma pessoa. Em seguida, concatene essas duas strings para formar o nome completo e exiba-o na tela. */
import java.util.Scanner;


public class ConcatenacaoStrings {
    public static void main(String[] args) {
        // Declare duas variáveis do tipo String para armazenar o primeiro nome e o sobrenome
        String primeiroNome = "João";
        String sobrenome = "Silva";
        
        // Concatene as strings para formar o nome completo
        String nomeCompleto = primeiroNome + " " + sobrenome;
        
        // Exiba o nome completo na tela
        System.out.println("O nome completo é: " + nomeCompleto);
    }
}
