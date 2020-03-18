import java.util.Scanner;

/**
 * 4. Faça um Programa que verifique se uma letra digitada é vogal ou consoante.
 * 
 * Rafael Bispo 
 * 31/01/2020
 */
public class Exercicio_04 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        char letra;

        System.out.println("Digite um Letra Qualquer: ");
        letra = ler.next().charAt(0);
        letra = Character.toUpperCase(letra);
        switch (letra) {
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println(letra + " é uma vogal");
                break;
            default:
                System.out.println(letra + " não é uma vogal");
                break;
        }
    }
}