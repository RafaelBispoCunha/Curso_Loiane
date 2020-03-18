import java.util.Scanner;

/**
 * 16. Faça um programa que calcule as raízes de uma equação do segundo grau, na
 * forma ax2 + bx + c. O programa deverá pedir os valores de a, b e c e fazer as
 * consistências, informando ao usuário nas seguintes situações: a. Se o usuário
 * informar o valor de A igual a zero, a equação não é do segundo grau e o
 * programa não deve fazer pedir os demais valores, sendo encerrado; b. Se o
 * delta calculado for negativo, a equação não possui raizes reais. Informe ao
 * usuário e encerre o programa; c. Se o delta calculado for igual a zero a
 * equação possui apenas uma raiz real; informe-a ao usuário; d. Se o delta for
 * positivo, a equação possui duas raiz reais; informe-as ao usuário;
 */
public class Exercicio_16 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int a, b, c;
        double x1, x2, delta;

        System.out.println("Informe o Valor de A: ");
        a = ler.nextInt();
        if(a == 0){
            System.out.println("Não é uma equação de 2° grau");
        }else{

            System.out.println("Informe o Valor de B: ");
            b = ler.nextInt();

            System.out.println("Informe o Valor de C: ");
            c = ler.nextInt();

            delta = (b * b) - (4 * a * c);

            if(delta < 0){
                System.out.println("Delta negativo");
            }else{
                x1 = ((-b ) + Math.sqrt(delta)) / (2 * a);
                x2 = ((-b ) - Math.sqrt(delta)) / (2 * a);
                System.out.println("Delta = " +delta +"\nX1 = " + x1 + "\nX2 = " +x2);
            }

        }
    }
}