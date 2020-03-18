import java.util.Scanner;

/**
 * 11. As Organizações Tabajara resolveram dar um aumento de salário aos
seus colaboradores e lhe contraram para desenvolver o programa que
calculará os reajustes.
o Faça um programa que recebe o salário de um colaborador e o
reajuste segundo o seguinte critério, baseado no salário atual:
o salários até R$ 280,00 (incluindo) : aumento de 20%
o salários entre R$ 280,00 e R$ 700,00 : aumento de 15%
o salários entre R$ 700,00 e R$ 1500,00 : aumento de 10%
o salários de R$ 1500,00 em diante : aumento de 5% Após o
aumento ser realizado, informe na tela:
o o salário antes do reajuste;
o o percentual de aumento aplicado;
o o valor do aumento;
o o novo salário, após o aumento.
 */
public class Exercicio_11 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double salario;
        double salarioNovo;
        double aumento;
        int reajuste;

        System.out.println("Informe o Salário: ");
        salario = ler.nextDouble();

        if(salario <= 280){
            reajuste = 20;

        }else if(salario <= 700){
            reajuste = 15;

        }else if(salario <= 1500){
            reajuste = 10;

        }else{
            reajuste = 5;
        }
        aumento = (salario / 100) * reajuste;
        salarioNovo = salario + ((reajuste * salario) / 100);
        System.out.println("O Salário é de " + salario + 
                            " Com reajuste de " + reajuste +
                            "% houve um aumento de R$ " + aumento + 
                            " Total Ficou  R$ " + salarioNovo);
    }
}