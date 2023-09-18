package com.milena.cursojava.aula14e15.exercicios;

import java.util.Scanner;
//Faça um Programa que peça dois números e imprima o maior deles.
public class Exer01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com o primeiro número");
        int num1 = scan.nextInt();
        System.out.println("Entre com o segundo número");
        int num2 = scan.nextInt();

        if(num1 > num2) {
            System.out.println("Primeiro número é o maior -> " + num1);
        } else if (num1 < num2) {
            System.out.println("Segundo número é o maior -> " + num2);
        } else  {
            System.out.println("Números iguais");
        }
    }
}
