import java.util.Scanner;

/**
 * 17. Faça um Programa que peça um número correspondente a um determinado ano e
 * em seguida informe se este ano é ou não bissexto.
 */
public class Exercicio_17 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int ano;
        

        System.out.println("Informe um Ano qualquer: ");
        ano = ler.nextInt();

        if((ano % 400 == 0) || (ano % 4 == 0 && ano % 100 != 0)){
            System.out.println("O ano " + ano + " é Bissexto");
        }else{
            System.out.println("O ano " + ano + " não é Bissexto");
        }
    }
}