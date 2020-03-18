import java.util.Scanner;

/** 
 * 2. Faça um Programa que peça um número e então mostre a mensagem:
 * O número informado foi [número].
 * 
 * Rafael Bispo
 * 24/01/2020
 */
public class Exercicio_02 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
		int numero;
		System.out.println("Informe um Número: ");
		numero = ler.nextInt();
		System.out.println("O Número Informado foi: " + numero);
    }
}