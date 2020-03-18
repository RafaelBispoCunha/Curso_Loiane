import java.util.Scanner;

/**
 * 11. Faça um Programa que peça 2 números inteiros e um número real.
 * Calcule e mostre:
 *   a. o produto do dobro do primeiro com metade do segundo .
 *   b. a soma do triplo do primeiro com o terceiro.
 *   c. o terceiro elevado ao cubo.
 * 
 * Rafael Bispo
 * 30/01/2020
 */
public class Exercicio_11 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int numero1;
        int numero2;
        double numero3;

        System.out.println("Informe o 1° número: ");
        numero1 = ler.nextInt();
        System.out.println("Informe o 2° número: ");
        numero2 = ler.nextInt();

        System.out.println("Informe um número real: ");
        numero3 = ler.nextDouble();

        System.out.println("O produto do dobro do primeiro com metade do segundo: " + (numero1 * 2) * (numero2 / 2));
        System.out.println("A soma do triplo do primeiro com o terceiro: " + (numero1 * 3) + numero3);
        System.out.println("O terceiro elevado ao cubo: " + (Math.pow(numero3, 3)));




    }
}