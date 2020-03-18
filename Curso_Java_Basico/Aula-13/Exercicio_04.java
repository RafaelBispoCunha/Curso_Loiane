import java.util.Scanner;

/** 
 *
 * 4. Faça um Programa que peça as 4 notas bimestrais e mostre a média.
 * 
 * Rafael Bispo
 * 24/01/2020
 */
public class Exercicio_04 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
        double nota1, nota2, nota3, nota4, media;
        
		System.out.println("Informe a 1° Nota: ");
        nota1 = ler.nextDouble();
        
		System.out.println("Informe a 2° Nota: ");
        nota2 = ler.nextDouble();
        
		System.out.println("Informe a 3° Nota: ");
        nota3 = ler.nextDouble();
        
		System.out.println("Informe a 4° Nota: ");
        nota4 = ler.nextDouble();
        
		media = (nota1 + nota2 + nota3 + nota4) / 4;
		System.out.println("O Número Informado foi: " + media);
		

	}

}