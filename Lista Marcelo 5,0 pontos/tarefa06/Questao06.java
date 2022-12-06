package terefa06;

import java.util.Scanner;

public class Questao06 {
 

    public static void main(String[] args) {

        Double horasTrabalhadas;
        Double Desconto;
        Double totalDesconto;
        Double salarioLiquido;
        Double valorHora;
        Double salarioBruto;
        Scanner scan = new Scanner(System.in);

        System.out.println("insira as horas trabalhadas");
        horasTrabalhadas = scan.nextDouble();

        System.out.println("insira o valor da hora");
        valorHora = scan.nextDouble();

        System.out.println("insira o percentual de desconto");
        Desconto = scan.nextDouble();

        salarioBruto = horasTrabalhadas * valorHora;
        totalDesconto = Desconto / 100 / salarioBruto;
        salarioLiquido = salarioBruto - totalDesconto;

        System.out.println("o salario bruto é ="+ salarioBruto+ "o totalDesconto é ="+totalDesconto+ "o salario liquido é ="+salarioLiquido);

    }


}
