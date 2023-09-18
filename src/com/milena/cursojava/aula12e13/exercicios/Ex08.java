package com.milena.cursojava.aula12e13.exercicios;

import java.util.Scanner;

//Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês.
public class Ex08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a quantidade de horas trabalhadas no mês: ");
        double horasTrabalhadasMes = scan.nextDouble();
        System.out.println("Digite quanto você ganha por hora: ");
        double ganhoPorHora = scan.nextDouble();

        double totalSalarioMes = horasTrabalhadasMes * ganhoPorHora;
        System.out.println("O total do seu salário nesse mês foi de: " + totalSalarioMes);

    }
}
