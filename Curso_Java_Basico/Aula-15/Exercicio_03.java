import java.util.Scanner;

/**
 * 3. Faça um Programa que verifique se uma letra digitada é "F" ou "M".
 * Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido.
 * 
 * Rafael Bispo
 * 31/01/2020
 */
public class Exercicio_03 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        char letra;

        System.out.println("Digite F para Feminino ou M para Masculino: ");
        letra = ler.next().charAt(0);
        letra = Character.toUpperCase(letra);

        switch(letra){
            case 'F':
                System.out.println("Sexo Feminino");
                break;
            case 'M':
                System.out.println("Sexo Masculino");
                break;
            default:
            System.out.println("Sexo inválido:");    

        }
    }
}