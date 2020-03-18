import java.util.Scanner;

/**
 * 12. Tendo como dados de entrada a altura de uma pessoa, construa um
 * algoritmo que calcule seu peso ideal, usando a seguinte fórmula:
 * (72.7*altura) - 58
 * 
 * Rafael Bispo
 * 30/01/2020
 */
public class Exercicio_12 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double altura;
        double pesoIdeal;

        System.out.println("Informe sua Altura: ");
        altura = ler.nextDouble();
        pesoIdeal = (72.7 * altura) - 58;
        System.out.println("Seu Peso Ideal é: " + pesoIdeal);
    }
}