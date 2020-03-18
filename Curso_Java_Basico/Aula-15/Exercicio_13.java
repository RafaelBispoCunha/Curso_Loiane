import java.util.Scanner;

/**
 * 13. Faça um Programa que leia um número e exiba o dia correspondente da
 * semana. (1-Domingo, 2- Segunda, etc.), se digitar outro valor deve aparecer
 * valor inválido.
 */
public class Exercicio_13 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int dia;

        System.out.println("Informe o dia da Semana:"+
                            "\n1 - Domingo \n2 - Segunda-feira" +
                            "\n3 - Terça-feira \n4 - Quarta-feira"+
                            "\n5 - Quinta-feira \n6 - Sexta-feira"+
                            "\n7 - Sabádo");
        dia = ler.nextInt();
        
        switch (dia) {
            case 1:
                System.out.println("O Dia Informado é Domingo");
                break;

            case 2:
                System.out.println("O Dia Informado é Segunda-feira");
                break;

            case 3:
                System.out.println("O Dia Informado é Terça-feira");  
                break;

            case 4:
                System.out.println("O Dia Informado é Quarta-feira");
                break;

            case 5:
                System.out.println("O Dia Informado é Quinta-feira");
                break;
                
            case 6:
                System.out.println("O Dia Informado é Sexta-feira");
                break;

            case 7:
                System.out.println("O Dia Informado é Sabádo");
                break;

        
            default:
                System.out.println("O Dia Informado é INVÁLIDO");
                break;
        }
    }
}