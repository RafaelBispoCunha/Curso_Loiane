import java.util.Scanner;

/**
 * 15. Faça um Programa que peça os 3 lados de um triângulo. O programa deverá
 * informar se os valores podem ser um triângulo. Indique, caso os lados formem
 * um triângulo, se o mesmo é: equilátero, isósceles ou escaleno. o Dicas: o
 * Três lados formam um triângulo quando a soma de quaisquer dois lados for
 * maior que o terceiro; o Triângulo Equilátero: três lados iguais; o Triângulo
 * Isósceles: quaisquer dois lados iguais; o Triângulo Escaleno: três lados
 * diferentes;
 */
public class Exercicio_15 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int lado1, lado2, lado3;

        System.out.println("Informe o lado 1");
        lado1 = ler.nextInt();

        System.out.println("Informe o lado 2");
        lado2 = ler.nextInt();

        System.out.println("Informe o lado 3");
        lado3 = ler.nextInt();

        if(((lado1 + lado2) > lado3) || ((lado1 + lado3) > lado2) || ((lado2 + lado3) > lado1)){

            if(lado1 == lado2 && lado1 == lado3 && lado2 == lado3){
                System.out.println("Triângulo Equilátero");

            }else if(lado1 == lado2 || lado1 == lado3 || lado2 == lado3){
                System.out.println("Triângulo Isóceles");

            }else{
                System.out.println("Triângulo Escaleno");
            }
        }else{
            System.out.println("Não é um Triângulo");
        }
    }
}