import java.util.Scanner;

/**
 * 5. Faça um programa para a leitura de duas notas parciais de um aluno.
 * O programa deve calcular a média alcançada por aluno e apresentar:
 *   A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
 *   A mensagem "Reprovado", se a média for menor do que sete;
 *   A mensagem "Aprovado com Distinção", se a média for igual a dez.
 * 
 * Rafael Bispo
 * 31/01/2020
 */
public class Exercicio_05 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double nota1;
        double nota2;
        double media;

        System.out.println("Informe a 1° Nota: ");
        nota1 = ler.nextDouble();

        System.out.println("Informe a 2° Nota: ");
        nota2 = ler.nextDouble();

        media = (nota1 + nota2) / 2;

        if(media >= 7 && media < 10){
            System.out.println("Aluno Aprovado com a média: " + media);
        }else if(media == 10){
            System.out.println("Aluno Aprovado com a média: " + media );
            System.out.println("PARABÉNS POR ALCANÇAR A MAIOR MÉDIA");
        }else{
            System.out.println("Aluno Reprovado com a média: " + media);
        }


    }
}