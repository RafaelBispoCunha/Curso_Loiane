import java.util.Scanner;

/**
 * 9. Faça um Programa que peça a temperatura em graus Farenheit,
 * transforme e mostre a temperatura em graus Celsius.
 * o C = (5 * (F-32) / 9).
 * 
 * Rafael Bispo
 * 30/01/2020
 */
public class Exercicio_09 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double farenheit;
        double celsius;

        System.out.println("Informe a temperatura em F°: ");
        farenheit = ler.nextDouble();

        celsius = 5 * (farenheit - 32) / 9;

        System.out.println("A temperatura em C° é: " + celsius);
    }
}