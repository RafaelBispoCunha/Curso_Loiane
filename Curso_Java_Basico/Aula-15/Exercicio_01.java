import java.util.Scanner;

/**
 * 1. Faça um Programa que peça dois números e imprima o maior deles.
 * 
 * Rafael Bispo
 * 31/01/2020
 */
public class Exercicio_01 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int numero1;
        int numero2;

        System.out.println("Informe o 1° número: ");
        numero1 = ler.nextInt();

        System.out.println("Informe o 2° número: ");
        numero2 = ler.nextInt();

        if(numero1 > numero2){
            System.out.println("O número maior é: " + numero1);

        }else if(numero2 > numero1){
            System.out.println("O número maior é: " + numero2);

        }else{
            System.out.println("Números são iguais");
        }
    }
}