import java.util.Scanner;

/**
 * 18. Faça um Programa que peça um número inteiro e determine se ele é
par ou impar. Dica: utilize o operador módulo (resto da divisão).
 */
public class Exercicio_18 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int numero;

        System.out.println("Infome um número: ");
        numero = ler.nextInt();

        if(numero % 2 == 0){
            System.out.println("O número: " + numero + " é Par");
        }
        else{
            System.out.println("O número: " + numero + " é Impar");
        }
    }
}