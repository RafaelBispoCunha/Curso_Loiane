import java.util.Scanner;

/**
 * 6. Faça um Programa que leia três números e mostre o maior deles.
 * 
 * Rafael Bispo
 * 31/01/2020
 */
public class Exercicio_06 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int numero1;
        int numero2;
        int numero3;

        System.out.println("Informe o 1° número: ");
        numero1 = ler.nextInt();

        System.out.println("Informe o 2° número: ");
        numero2 = ler.nextInt();

        System.out.println("Informe o 3° número: ");
        numero3 = ler.nextInt();

        if(numero1 >= numero2 && numero1 >= numero3){
            System.out.println("O número " + numero1 + " é o maior");
        }
        else if(numero2 >= numero1 && numero2 >= numero3){
            System.out.println("O número " + numero2 + " é o maior");
        }
        else{
            System.out.println("O número " + numero3 + " é o maior");
        }
    }
}