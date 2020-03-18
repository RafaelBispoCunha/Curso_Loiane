import java.util.Scanner;

/**
 * 23. O Hipermercado Tabajara está com uma promoção de carnes que é imperdível.
 * Confira:
 * 
 *             |   Até 5 Kg     | Acima de 5 Kg 
 * File Duplo  | R$ 4,90 por Kg | R$ 5,80 por Kg
 * Alcatra     | R$ 5,90 por Kg | R$ 6,80 por Kg 
 * Picanha     | R$ 6,90 por Kg | R$ 7,80 por Kg
 * 
 * 
 * Para atender a todos os clientes, cada cliente poderá levar apenas um dos
 * tipos de carne da promoção, porém não há limites para a quantidade de carne
 * por cliente. Se compra for feita no cartão Tabajara o cliente receberá ainda
 * um desconto de 5% sobre o total a compra. Escreva um programa que peça o tipo
 * e a quantidade de carne comprada pelo usuário e gere um cupom fiscal,
 * contendo as informações da compra: tipo e quantidade de carne, preço total,
 * tipo de pagamento, valor do desconto e valor a pagar.
 */
public class Exercicio_23 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int tipoCarne, formaPgto;
        double kgCarne = 0;
        double precoKg = 0;
        double valorTotal;
        double desconto = 0;
        String msg ="";
        System.out.println("Informe o Tipo de Carne"+
                          "\n1 - File duplo"+
                          "\n2 - Alcatra" +
                          "\n3 - Picanha");
        tipoCarne = ler.nextInt();

        System.out.println("Infome a quantidade em KG: ");
        kgCarne = ler.nextDouble();
        
        switch (tipoCarne) {
            case 1:
                msg = "File Duplo";
                if(kgCarne > 5){
                    precoKg = 5.8;
                }else{
                    precoKg = 4.9;
                }
                break;

            case 2:
                msg = "Alcatra";
                if(kgCarne > 5){
                    precoKg = 6.8;
                }else{
                    precoKg = 5.9;
                }
                break;
                
            case 3:
                msg = "Picanha";
                if(kgCarne > 5){
                    precoKg = 7.8;
                }else{
                    precoKg = 6.9;
                }
                break;
        
            default:
                System.out.println("Carne Invalida");
                break;
        }
        valorTotal = kgCarne * precoKg;
        System.out.println("KG " + kgCarne + " de " + msg + "\nValor Total " + valorTotal);

        System.out.println("Pagamento com cartão do Mercado? 1 - SIM | 2 - NÃO");
        formaPgto = ler.nextInt();

        switch (formaPgto) {
            case 1:
                desconto = (valorTotal /100) * 5;
                break;
            case 2:
                System.out.println("Não havera desconto");
                break;
        
            default:
                System.out.println("Forma de Pagamento Invalida");
                break;
        }
        System.out.println("Desconto " + desconto + "\nValor Total " + (valorTotal - desconto));
    }
}