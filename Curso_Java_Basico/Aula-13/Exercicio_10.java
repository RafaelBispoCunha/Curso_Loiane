import java.util.Scanner;

/**
 * 10. Faça um Programa que peça a temperatura em graus Celsius,
 * transforme e mostre em graus Farenheit.
 * 
 * Rafael Bispo
 * 30/01/2020
 */
public class Exercicio_10 {

    public static void main(String[] args) {
        Scanner ler = new Scanner();
        double farenheit;
        double celsius;

        System.out.println("Informe a temperatura em C°: ");
        celsius = ler.nextDouble();

        farenheit = (celsius * 1.8) + 32;
        System.out.println("A temperatura em F°: " + farenheit); 
    }
}