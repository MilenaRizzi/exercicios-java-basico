package com.milena.cursojava.aula14e15.exercicios;

import java.util.Scanner;

public class Exer11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com o valor do salário atual ");
        double salario = scan.nextDouble();
        double novoSalario;
        int percentual;
        if(salario <= 280) {
            percentual = 20;
        } else if (salario >= 280 && salario < 700) {
            percentual = 15;
        } else if (salario >= 700 && salario < 1500) {
            percentual = 10;
        } else {
            percentual = 5;
        }
        novoSalario = salario + (salario * percentual/100);
        double valorDoAumento =  novoSalario - salario;

        System.out.println("Salário antes do reajuste: " + salario);
        System.out.println("O percentual do aumento aplicado foi de " + percentual + "%");
        System.out.println("O valor do aumento foi de: " + valorDoAumento);
        System.out.println("O novo salário é: " + novoSalario);
    }
}
/*As Organizações Tabajara resolveram dar um aumento de salário aos
seus colaboradores e lhe contraram para desenvolver o programa que
calculará os reajustes.
- Faça um programa que recebe o salário de um colaborador e o
reajuste segundo o seguinte critério, baseado no salário atual:
- salários até R$ 280,00 (incluindo) : aumento de 20%
- salários entre R$ 280,00 e R$ 700,00 : aumento de 15%
- salários entre R$ 700,00 e R$ 1500,00 : aumento de 10%
- salários de R$ 1500,00 em diante : aumento de 5% Após o
aumento ser realizado, informe na tela:
- o salário antes do reajuste;
- o percentual de aumento aplicado;
- o valor do aumento;
- o novo salário, após o aumento.*/