import java.util.Scanner;

/**
 * 22. Uma fruteira está vendendo frutas com a seguinte tabela de preços:
 * 
 *         |     Até 5 Kg        |      Acima de 5 Kg
 * Morango |   R$ 2,50 por Kg    |      R$ 2,20 por Kg
 * Maçã    |   R$ 1,80 por Kg    |      R$ 1,50 por Kg
 
Se o cliente comprar mais de 8 Kg em frutas ou o valor total da
compra ultrapassar R$ 25,00, receberá ainda um desconto de
10% sobre este total. Escreva um algoritmo para ler a
quantidade (em Kg) de morangos e a quantidade (em Kg) de
maças adquiridas e escreva o valor a ser pago pelo cliente.
 */
public class Exercicio_22 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double kiloMorango, kiloMaca;
        double precoMorango, precoMaca,precoParcial, precoTotal;
        int desconto = 0;

        System.out.println("Informe a quantidade em Kg de Morango: ");
        kiloMorango = ler.nextDouble();

        System.out.println("Informe a quantidade em Kg de Maça: ");
        kiloMaca = ler.nextDouble();

        if(kiloMorango > 5){
            precoMorango = 2.20 * kiloMorango;
        }else{
            precoMorango = 2.50 * kiloMorango;
        }

        if(kiloMaca > 5){
            precoMaca = 1.50 * kiloMaca;
        }else{
            precoMaca = 1.80 * kiloMaca;
        }


        if(kiloMaca + kiloMorango > 8 || precoMaca + precoMorango > 25){
            desconto = 10;
        }

        precoParcial = (precoMaca + precoMorango);
        precoTotal = precoParcial - ((precoParcial / 100) * 10);

    System.out.println("Morango KG "+ kiloMorango + " : R$" + precoMorango);
    System.out.println("Maça    KG "+ kiloMaca +    " : R$" + precoMaca);
    System.out.println("Preço " + precoParcial);
    System.out.println("Desconto " + desconto+"%");
    System.out.println("Total " + precoTotal);
    }
}