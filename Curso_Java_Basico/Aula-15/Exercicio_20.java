import java.util.Scanner;

/**
 * 20. Faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As
 * perguntas são: . "Telefonou para a vítima?" a. "Esteve no local do crime?" b.
 * "Mora perto da vítima?" c. "Devia para a vítima?" d. "Já trabalhou com a
 * vítima?" O programa deve no final emitir uma classificação sobre a
 * participação da pessoa no crime. Se a pessoa responder positivamente a 2
 * questões ela deve ser classificada como "Suspeita", entre 3 e 4 como
 * "Cúmplice" e 5 como "Assassino". Caso contrário, ele será classificado como
 * "Inocente".
 */
public class Exercicio_20 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        char resposta1;
        char resposta2;
        char resposta3;
        char resposta4;
        char resposta5;

        int afirmativas = 0;

        System.out.println("Telefonou para a vítima?");
        resposta1 = ler.next().charAt(0);
        resposta1 = Character.toUpperCase(resposta1);

        System.out.println("Esteve no local do crime?");
        resposta2 = ler.next().charAt(0);
        resposta2 = Character.toUpperCase(resposta2);

        System.out.println("Mora perto da vítima?");
        resposta3 = ler.next().charAt(0);
        resposta3 = Character.toUpperCase(resposta3);

        System.out.println("Devia para a vítima?");
        resposta4 = ler.next().charAt(0);
        resposta4 = Character.toUpperCase(resposta4);

        System.out.println("Já trabalhou com a vítima?");
        resposta5 = ler.next().charAt(0);
        resposta5 = Character.toUpperCase(resposta5);

        if(resposta1 == 'S')
            afirmativas++;

        if(resposta2 == 'S')
            afirmativas++;

        if(resposta3 == 'S')
            afirmativas++;

        if(resposta4 == 'S')
            afirmativas++;

        if(resposta5 == 'S')
            afirmativas++;
        
            if(afirmativas == 0){
                System.out.println("A Pessoa é Inocente");

            }else if ( afirmativas == 2){
                System.out.println("A Pessoa é Suspeita");

            }else if ( afirmativas < 5){
                System.out.println("A Pessoa é Cúmplice");

            }else{
                System.out.println("A Pessoa é Culpada");
            }
    }
}