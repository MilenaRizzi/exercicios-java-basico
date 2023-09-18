package com.milena.cursojava.aula12e13.exercicios;

import java.util.Scanner;

//3. Faça um Programa que peça dois números e imprima a soma.
public class Ex03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite dois numeros");
        int numero1 = scan.nextInt();
        int numero2 = scan.nextInt();
        int soma = numero1 + numero2;
        System.out.println("A soma dos numeros é:  " + soma);
    }
}
