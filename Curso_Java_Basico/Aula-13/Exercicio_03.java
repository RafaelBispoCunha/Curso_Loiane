import java.util.Scanner;
/**
 * 3. Faça um Programa que peça dois números e imprima a soma.
 * 
 * Rafael Bispo
 * 24/01/2020
 */
public class Exercicio_03 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
		int numero1, numero2;
		
		System.out.println("Informe o 1° Número: ");
		numero1 = ler.nextInt();

		System.out.println("Informe o 2° Número: ");
		numero2 = ler.nextInt();

		System.out.println("A Soma é: " + (numero1 + numero2));
    }
}