import java.util.Scanner;

/**
 * 2. Faça um Programa que peça um valor e mostre na tela se o valor é
 * positivo ou negativo.
 * 
 * Rafael Bispo
 * 31/01/2020
 */
public class Exercicio_02 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int numero;

        System.out.println("Informe um número: ");
        numero = ler.nextInt();

        if(numero < 0){
            System.out.println("O numero " + numero + " é Negativo");
        }else{
            System.out.println("O numero " + numero + " é Positivo");
        }
    }
}