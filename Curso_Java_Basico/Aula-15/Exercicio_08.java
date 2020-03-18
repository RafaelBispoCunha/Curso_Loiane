import java.util.Scanner;

/**
 * 8. Faça um programa que pergunte o preço de três produtos e informe qual
 * produto você deve comprar, sabendo que a decisão é sempre pelo mais barato.
 * 
 * Rafael Bispo 01/02/2020
 */
public class Exercicio_08 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double produto1;
        double produto2;
        double produto3;

        System.out.println("Informe o preço do 1° produto: ");
        produto1 = ler.nextDouble();

        System.out.println("Informe o preço do 2° produto: ");
        produto2 = ler.nextDouble();

        System.out.println("Informe o preço do 3° produto: ");
        produto3 = ler.nextDouble();

        if(produto1 >= produto2 && produto1 >= produto3){
            if(produto2 >= produto3){
                System.out.println("O maior é " + produto1 + " e o menor " + produto3);
            }else{
                System.out.println("O maior é " + produto1 + " e o menor " + produto2);
            }

        }else if(produto2 >= produto1 && produto2 >= produto3){
            if(produto1 >= produto3){
                System.out.println("O maior é " + produto2 + " e o menor " + produto3);
            }else{
                System.out.println("O maior é " + produto2 + " e o menor " + produto1);
            }
            
        }else{
            if(produto1 >= produto2){
                System.out.println("O maior é " + produto3 + " e o menor " + produto2);
            }else{
                System.out.println("O maior é " + produto3 + " e o menor " + produto1);
            }
        }
    }
}