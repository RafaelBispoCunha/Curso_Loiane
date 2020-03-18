import java.util.Scanner;

/**
 * 12. Faça um programa para o cálculo de uma folha de pagamento, sabendo que os
 * descontos são do Imposto de Renda, que depende do
 * 
 * 
 * salário bruto (conforme tabela abaixo) e 3% para o Sindicato e que o FGTS
 * corresponde a 11% do Salário Bruto, mas não é descontado (é a empresa que
 * deposita). O Salário Líquido corresponde ao Salário Bruto menos os descontos.
 * O programa deverá pedir ao usuário o valor da sua hora e a quantidade de
 * horas trabalhadas no mês. o Desconto do IR: o Salário Bruto até 900
 * (inclusive) - isento o Salário Bruto até 1500 (inclusive) - desconto de 5% o
 * Salário Bruto até 2500 (inclusive) - desconto de 10% o Salário Bruto acima de
 * 2500 - desconto de 20% Imprima na tela as informações, dispostas conforme o
 * exemplo abaixo. No exemplo o valor da hora é 5 e a quantidade de hora é 220.
 * 
 * Salário Bruto: (5 * 220) : R$ 1100,00 (-) IR (5%) : R$ 55,00 (-) INSS ( 10%)
 * : R$ 110,00 FGTS (11%) : R$ 121,00 Total de descontos : R$ 165,00 Salário
 * Liquido : R$ 935,00
 */
public class Exercicio_12 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double salarioBruto;
        double salarioLiquido;
        double valorHora;
        double horasTrabalhada;
        double valorIR;
        double valorINSS;
        double valorFGTS;
        double totalDescontos;
        int percentualIR = 0;

        System.out.println("Informe Total de Horas Trabalhada: ");
        horasTrabalhada = ler.nextDouble();

        System.out.println("Informe o Valor da Hora: ");
        valorHora = ler.nextDouble();

        salarioBruto = horasTrabalhada * valorHora;

        if(salarioBruto > 900 && salarioBruto <= 1500){
            percentualIR = 5;
        }else if(salarioBruto > 1500 && salarioBruto <= 2500){
            percentualIR = 10;
        }else if(salarioBruto > 2500){
            percentualIR = 20;
        }

        valorIR = (salarioBruto / 100) * percentualIR;
        valorINSS = (salarioBruto / 100) * 10;
        valorINSS = (salarioBruto / 100) * 10;
        valorFGTS = (salarioBruto / 100) * 11;
        totalDescontos = valorIR + valorINSS;
        salarioLiquido = salarioBruto - totalDescontos;

  
        System.out.println("Salario Bruto: (" + valorHora + " * " + horasTrabalhada + "): R$ " + salarioBruto);
        System.out.println("(-) IR (" + percentualIR + "%) : R$ " + valorIR);
        System.out.println("(-) INSS (10%) : R$" + valorINSS);
        System.out.println("(-) FGTS (11%) : R$" + valorFGTS);
        System.out.println("Total de Descontos : R$ " + totalDescontos );
        System.out.println("Salário Liquido : R$ " + salarioLiquido);
        
    }
}