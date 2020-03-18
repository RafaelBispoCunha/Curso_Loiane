import java.util.Scanner;

/**
 * 6. Faça um Programa que peça o raio de um círculo, calcule e mostre
 * sua área.
 * 
 * Rafael Bispo
 * 30/01/2020
 */
public class Exercicio_06 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double raio, area;

        System.out.println("Entre com o Raio:");
        raio = ler.nextDouble();

        area = Math.PI + Math.pow(raio, 2);
        System.out.println("A área do círulo é: " + area);

    }
}