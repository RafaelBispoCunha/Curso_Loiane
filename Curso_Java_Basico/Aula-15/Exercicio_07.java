import java.util.Scanner;

/**
 * 7. Faça um Programa que leia três números e mostre o maior e o menor deles.
 */
public class Exercicio_07 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int numero1;
        int numero2;
        int numero3;
       

        System.out.println("Informe 1° número: ");
        numero1 = ler.nextInt();

        System.out.println("Informe 2° número: ");
        numero2 = ler.nextInt();

        System.out.println("Informe 3° número: ");
        numero3 = ler.nextInt();

        if(numero1 >= numero2 && numero1 >= numero3){
            if(numero2 >= numero3){
                System.out.println("O maior é " + numero1 + " e o menor " + numero3);
            }else{
                System.out.println("O maior é " + numero1 + " e o menor " + numero2);
            }

        }else if(numero2 >= numero1 && numero2 >= numero3){
            if(numero1 >= numero3){
                System.out.println("O maior é " + numero2 + " e o menor " + numero3);
            }else{
                System.out.println("O maior é " + numero2 + " e o menor " + numero1);
            }
            
        }else{
            if(numero1 >= numero2){
                System.out.println("O maior é " + numero3 + " e o menor " + numero2);
            }else{
                System.out.println("O maior é " + numero3 + " e o menor " + numero1);
            }
        }
    }
}