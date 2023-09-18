package com.milena.cursojava.aula14e15.exercicios;

import java.util.Scanner;

//.Faça um Programa que peça um número inteiro e determine se ele é
// par ou impar. Dica: utilize o operador módulo (resto da divisão)
public class Exer22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com um número inteiro");
        int num = scan.nextInt();

        if(num % 2 == 0) {
            System.out.println("O número digitado é par");
        } else {
            System.out.println("O número digitado é ímpar");
        }
    }
}
