import java.util.Scanner;

/**	
 *
 * 5. Faça um Programa que converta metros para centímetros.
 * 
 * Rafael Bispo
 * 24/01/2020
 */
public class Exercicio_05 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double metros;
		System.out.println("Informe os Metros: ");
		metros = ler.nextDouble();
		System.out.println("Os " + metros + " Metros Informado dão:" + (metros / 0.01) + " cm");
		

	}

}