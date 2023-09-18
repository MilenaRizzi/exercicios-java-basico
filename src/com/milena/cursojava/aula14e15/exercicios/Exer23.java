package com.milena.cursojava.aula14e15.exercicios;

import java.util.Scanner;

/*Faça um Programa que peça um número e informe se o número é
inteiro ou decimal. Dica: utilize uma função de arredondamento*/
public class Exer23 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com o primeiro número: ");
        double num1 = scan.nextDouble();
        System.out.println("Entre com o segundo número: ");
        double num2 = scan.nextDouble();

        if(num1 % 1 == 0) {
            System.out.println("O número " + (int) num1 + " é inteiro");
        } else  {
            System.out.println("O número " + num1 + " é decimal");
        }

        if(num2 % 1 == 0) {
            System.out.println("O número " + (int) num2 + " é inteiro");
        } else  {
            System.out.println("O número " + num2 + " é decimal");
        }
    }
}
