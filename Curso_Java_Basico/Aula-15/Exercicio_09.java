import java.util.Scanner;

/**
 * 9. Faça um Programa que leia três números e mostre-os em ordem decrescente.
 * 
 * Rafael Bispo 01/02/2020
 */
public class Exercicio_09 {

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
            
            if(numero2 >= numero3){
                System.out.println(numero1 + "\n" + numero2 + "\n" + numero3);
            }else{
                System.out.println(numero1 + "\n" + numero3 + "\n" + numero2);
            }
            
        }
        else if(numero2 >= numero1 && numero2 >= numero3){
            if(numero1 >= numero3){
                System.out.println(numero2 + "\n" + numero1 + "\n" + numero3);
            }else{
                System.out.println(numero2 + "\n" + numero3 + "\n" + numero1);
            }
        }
        else{
            if(numero1 >= numero2){
                System.out.println(numero3 + "\n" + numero1 + "\n" + numero2);
            }else{
                System.out.println(numero3 + "\n" + numero2 + "\n" + numero1);
            }
        }
    }
}