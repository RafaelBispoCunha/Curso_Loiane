import java.util.Scanner;

/*
* 14. Faça um programa que peça o tamanho de um arquivo para download
* (em MB) e a velocidade de um link de Internet (em Mbps), calcule e
* informe o tempo aproximado de download do arquivo usando este link (em minutos).
*
* Rafal Bispo
* 30/01/2020
*/

public class Exercicio_14 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double tamanho;
        double velocidade;
        double tempo;


        System.out.println("Informe o tamanho do arquivo: ");
        tamanho = ler.nextDouble();

        System.out.println("Informe a Velocidade: ");
        velocidade = ler.nextDouble();

        tempo = tamanho / velocidade;
        System.out.println("O tempo Gasto é: " + tempo);
        
        ler.close();
    }
}
