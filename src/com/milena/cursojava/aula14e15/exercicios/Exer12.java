package com.milena.cursojava.aula14e15.exercicios;

import java.util.Scanner;

/*Faça um programa para o cálculo de uma folha de pagamento,
sabendo que os descontos são do Imposto de Renda, que depende do
salário bruto (conforme tabela abaixo) e 3% para o Sindicato e que o
FGTS corresponde a 11% do Salário Bruto, mas não é descontado (é
a empresa que deposita). O Salário Líquido corresponde ao Salário
Bruto menos os descontos. O programa deverá pedir ao usuário o
valor da sua hora e a quantidade de horas trabalhadas no mês.
- Desconto do IR:
- Salário Bruto até 900 (inclusive) - isento
- Salário Bruto até 1500 (inclusive) - desconto de 5%
- Salário Bruto até 2500 (inclusive) - desconto de 10%
- Salário Bruto acima de 2500 - desconto de 20% Imprima na tela as informações,
dispostas conforme o exemplo abaixo. No exemplo o valor da hora é 5 e a quantidade de hora é 220.*/
public class Exer12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com a quantidade de horas trabalhadas no mês: ");
        double horasTrabalhadasMes = scan.nextDouble();
        System.out.println("Digite o valor que você ganha por hora trabalhada");
        double valorDaHora = scan.nextDouble();

        double salarioBruto = horasTrabalhadasMes * valorDaHora;
        double irPorCento;

        if(salarioBruto > 900 && salarioBruto <= 1500) {
            irPorCento = 5;
        } else if (salarioBruto >= 2500) {
            irPorCento = 10;
        } else {
            irPorCento = 20;
        }

        double impostoRenda = salarioBruto * (irPorCento/100);
        double inss = salarioBruto * 0.10;
        double fgts = salarioBruto * 0.11;
        double totalDescontos = inss + impostoRenda;
        double salarioLiquido = salarioBruto - totalDescontos;

        System.out.println("Salário Bruto: (" + valorDaHora + " * " +  horasTrabalhadasMes + "): R$ " +  salarioBruto);
        System.out.println("(-) IR (" + irPorCento +"%): R$" + impostoRenda);
        System.out.println("(-) INSS (10%): " + "R$ " + inss);
        System.out.println("FGTS (11%): " + "R$ " + fgts);
        System.out.println("Total de Descontos: " + totalDescontos);
        System.out.println("Salário Líquido: " + salarioLiquido);
    }
}
