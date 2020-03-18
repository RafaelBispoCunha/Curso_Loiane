import java.util.Scanner;

/**
 * 10. Faça um Programa que pergunte em que turno você estuda. Peça para digitar
 * M-matutino ou V-Vespertino ou N- Noturno. Imprima a mensagem "Bom Dia!", "Boa
 * Tarde!" ou "Boa Noite!" ou "Valor Inválido!", conforme o caso.
 * 
 * Rafael Bispo 01/02/2020
 */
public class Exercicio_10 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        char periodo;
        System.out.println("Informe M para matutino ou V para Vespertino ou N para Noturno");
        periodo = ler.next().charAt(0);
        periodo = Character.toUpperCase(periodo);
        switch (periodo) {
        
            case 'M':  
                System.out.println("Periodo Informado é o Matutino");;  
                break;

           
            case 'V':   
                System.out.println("Periodo Informado é o Vespertino"); 
                break;

           
            case 'N':    
                System.out.println("Periodo Informado é o Noturno");
                break;
            default:
                System.out.println("Periodo Informado é Inválido");
                break;
        }
    }
}