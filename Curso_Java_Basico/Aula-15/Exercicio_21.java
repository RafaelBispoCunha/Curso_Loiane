import java.util.Scanner;

/**
 * 21. Um posto está vendendo combustíveis com a seguinte tabela de descontos: .
 * Álcool: 
 * a. até 20 litros, desconto de 3% por litro 
 * b. acima de 20 litros, desconto de 5% por litro 
 * Gasolina: 
 * c. até 20 litros, desconto de 4% por litro
 * d. acima de 20 litros, desconto de 6% por litro Escreva um algoritmo que leia
 * o número de litros vendidos, o tipo de combustível (codificado da seguinte
 * forma: A-álcool, G- gasolina), calcule e imprima o valor a ser pago pelo
 * cliente
 * 
 * 
 * sabendo-se que o preço do litro da gasolina é R$ 2,50 o preço do litro do
 * álcool é R$ 1,90.
 */
public class Exercicio_21 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        char combustivel;
        int litros;
        double preco = 0, precoTotal = 0, desconto = 0;

        System.out.println("Informe a Quantidade de Combustivel: ");
        litros = ler.nextInt();

        System.out.println("Informe o tipo de Combustivel A - Alcool ou G - Gasolina: ");
        combustivel = ler.next().charAt(0);
        combustivel = Character.toUpperCase(combustivel);

        

        switch (combustivel) {
            case 'A':
                preco = litros * 1.90;
                if(litros > 20){
                    
                    desconto = (preco / 100) * 5;
                }else{
                    desconto = (preco / 100) * 3;
                }
                break;

            case 'G':
                preco = litros * 2.5;
                if(litros > 20){
                    desconto = (preco / 100) * 6;
                }else{
                    desconto = (preco / 100) * 4;
                }
                break;
        
            default:
                System.out.println("Combustivel Inválido");
                break;
        }
        precoTotal = preco - desconto;
        System.out.println("Preço " + preco +
                           "\nDesconto " + desconto +
                           "\nTotal " + precoTotal);
    }
}