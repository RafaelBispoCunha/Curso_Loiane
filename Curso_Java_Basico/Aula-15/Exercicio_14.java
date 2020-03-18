import java.util.Scanner;

/**
 * 14. Faça um programa que lê as duas notas parciais obtidas por um aluno numa
 * disciplina ao longo de um semestre, e calcule a sua média. A atribuição de
 * conceitos obedece à tabela abaixo:
 * 
 * Média de Aproveitamento Conceito Entre 9.0 e 10.0 A Entre 7.5 e 9.0 B Entre
 * 6.0 e 7.5 C Entre 4.0 e 6.0 D Entre 4.0 e zero E O algoritmo deve mostrar na
 * tela as notas, a média, o conceito correspondente e a mensagem “APROVADO” se
 * o conceito for A, B ou C ou “REPROVADO” se o conceito for D ou E.
 */
public class Exercicio_14 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double nota1;
        double nota2;
        double media;
        String msg ="";

        System.out.println("Informe a 1° Nota: ");
        nota1 = ler.nextInt();

        System.out.println("Informe a 2° Nota: ");
        nota2 = ler.nextInt();

        media = (nota1 + nota2) / 2;

        if(media < 4){
            msg = "E - REPROVADO";
        }
        else if(media < 6){
            msg = "D - REPROVADO";
        }
        else if(media < 7.5){
            msg = "C - APROVADO";
        }
        else if(media < 9){
            msg = "B - APROVADO";
        }
        else{
            msg = "A - APROVADO";
        }
        System.out.println("As notas do Aluno são:"+
        "\n1° Nota " + nota1 +
        "\n2° Nota " + nota2 +
        "\nSua Media é " + media +
        "\nConceito\n"+ msg);
    }
}