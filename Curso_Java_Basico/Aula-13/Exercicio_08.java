import java.util.Scanner;

/**
 * 8. Faça um Programa que pergunte quanto você ganha por hora e o
 * número de horas trabalhadas no mês. Calcule e mostre o total do seu
 * salário no referido mês.
 * 
 * Rafael Bispo
 * 30/01/2020
 */
public class Exercicio_08 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double valorHora;
        double horaTrabalhada;
        double salario;

        System.out.println("Informe o valor por hora: ");
        valorHora = ler.nextDouble();

        System.out.println("Informe o Total de Horas trabalhada no mês: ");
        horaTrabalhada = ler.nextDouble();


        salario = valorHora * horaTrabalhada;
        System.out.println("O salário é: " + salario);

    }
}