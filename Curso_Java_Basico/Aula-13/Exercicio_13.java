import java.util.Scanner;

/**
 * 13. Faça um Programa que pergunte quanto você ganha por hora e o
 * número de horas trabalhadas no mês. Calcule e mostre o total do seu
 * salário no referido mês, sabendo-se que são descontados 11% para o
 * Imposto de Renda, 8% para o INSS e 5% para o sindicato, faça um
 * programa que nos dê:
 *  . salário bruto.
 *  a. quanto pagou ao INSS.
 *  b. quanto pagou ao sindicato.
 *  c. o salário líquido.
 *  d. calcule os descontos e o salário líquido, conforme a tabela abaixo:
 * + Salário Bruto : R$ - IR (11%) : R$ - INSS
 * (8%) : R$ - Sindicato ( 5%) : R$ = Salário Liquido : R$
 * Obs.: Salário Bruto - Descontos = Salário Líquido.
 * 
 * Rafal Bispo
 * 30/01/2020
 */
public class Exercicio_13 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double ganhoHora;
        double horasTrabalhada;
        double salarioLiquido;
        double salarioBruto;
        double ir;
        double inss;
        double sindicato;

        System.out.println("Informe o valor por Hora trabalhada: ");
        ganhoHora = ler.nextDouble();

        System.out.println("Informe o Total de Horas Trabalhadas: ");
        horasTrabalhada = ler.nextDouble();

        salarioBruto = ganhoHora * horasTrabalhada;
        System.out.println("Salário Bruto:" + salarioBruto);
        
        ir = salarioBruto * 0.11;
        inss = salarioBruto * 0.08;
        sindicato = salarioBruto * 0.05;
        salarioLiquido = salarioBruto - ir- inss - sindicato;
        System.out.println("Imposto de Renda: " + ir);
        System.out.println("INSS: " + inss);
        System.out.println("Sindicato: " + sindicato);
        System.out.println("Salário Liquido: " + salarioLiquido);
        
        ler.close();
    }
}