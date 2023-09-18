package com.milena.cursojava.aula12e13.exercicios;

import java.util.Scanner;

/*Faça um Programa que pergunte quanto você ganha por hora e o
número de horas trabalhadas no mês. Calcule e mostre o total do seu
salário no referido mês, sabendo-se que são descontados 11% para o
Imposto de Renda, 8% para o INSS e 5% para o sindicato, faça um
programa que nos dê:
. salário bruto.
a. quanto pagou ao INSS.
b. quanto pagou ao sindicato.
c. o salário líquido.
d. calcule os descontos e o salário líquido, conforme a tabela
abaixo:
*/
public class Ex15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a quantidade de horas trabalhadas no mês: ");
        double horasTrabalhadasMes = scan.nextDouble();
        System.out.println("Digite quanto você ganha por hora: ");
        double ganhoPorHora = scan.nextDouble();

        double totalSalarioMes = horasTrabalhadasMes * ganhoPorHora;
        double impostoRenda = totalSalarioMes * 0.11;
        double inss = totalSalarioMes * 0.08;
        double sindicato = totalSalarioMes * 0.05;
        double descontos = impostoRenda + inss + sindicato;
        double salarioLiquito = totalSalarioMes - descontos;

        System.out.println("Total Salário: " + totalSalarioMes + "Imposto de Renda: " + impostoRenda + "\nInss: " + inss + "\nSindicato: " + sindicato + "\nDescontos Totais: " + descontos +"\nSalário Líquido: " + salarioLiquito);
    }
}
