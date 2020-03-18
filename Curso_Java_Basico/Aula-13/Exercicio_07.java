import java.util.Scanner;

/**
 * 7. Faça um Programa que calcule a área de um quadrado, em seguida
 * mostre o dobro desta área para o usuário.
 * 
 * Rafael Bispo
 * 30/01/2020
 */
public class Exercicio_07 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double lado, area;

        System.out.println("Informe o lado: ");
        lado = ler.nextDouble();

        area = Math.pow(lado, 2);

        System.out.println("A área quadrada é: " + area);
        System.out.println("O dobra da área quadrada é: " + (area * 2));
        
    }
}