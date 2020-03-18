import java.util.Scanner;

/**
 * 19. Faça um Programa que leia 2 números e em seguida pergunte ao
usuário qual operação ele deseja realizar. O resultado da operação
deve ser acompanhado de uma frase que diga se o número é:
. par ou ímpar;
a. positivo ou negativo;
 */
public class Exercicio_19 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double numero1;
        double numero2;
        double resultado = 0;
        char opc;

        System.out.println("Informe o 1° número: ");
        numero1 = ler.nextDouble();


        System.out.println("Informe \n+ para Soma"+
                            "\n- para Subtração"+
                            "\n/ para Divisão"+
                            "\n* para Multiplicação");
        opc = ler.next().charAt(0);
        
        System.out.println("Informe o 2° número: ");
        numero2 = ler.nextDouble();
        switch (opc) {
            case '+':
                resultado = numero1 + numero2;
                break;

            case '-':
                resultado = numero1 - numero2;
                break;   

            case '/':
                resultado = numero1 / numero2;
                break;

            case '*':
                resultado = numero1 / numero2;
                break;
        
            default:
                System.out.println("Operação invalida");
                break;
        }
        
        if(resultado % 2 == 0){
            
            System.out.println("O número: " + resultado + " é Par");
        }
        else{
            System.out.println("O número: " + resultado + " é Impar");
        }
        if(resultado > 0 ){
            System.out.println("Positivo");
        }  else{
            System.out.println("Negativo");
        }              
        
    }
}