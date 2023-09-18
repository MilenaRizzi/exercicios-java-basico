package com.milena.cursojava.aula14e15.exercicios;

import java.util.Scanner;
//2. Faça um Programa que peça um valor e mostre na tela se o valor é positivo ou negativo.
public class Exer02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com um número");
        int num1 = scan.nextInt();

        if(num1 >= 0) {
            System.out.println("Número positivo");
        } else {
            System.out.println("Número negativo");
        }
    }
}
