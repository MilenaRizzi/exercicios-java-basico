package com.milena.cursojava.aula14e15.exercicios;

import java.util.Scanner;

public class Exer07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com o primeiro número");
        int num1 = scan.nextInt();
        System.out.println("Entre com o segundo número");
        int num2 = scan.nextInt();
        System.out.println("Entre com o terceiro número");
        int num3 = scan.nextInt();

    }
}
/*
        int maior = num1;

        if(num2 > maior) {
            maior = num2;
        } else if (num3 > maior) {
            maior = num3;
        }

        int menor = num1;
        if(num2 < menor) {
            menor = num2;
        } else if(num3 < menor) {
            menor = num3;
        }

        System.out.println("O maior número é: " + maior + "\nO menor número é: " + menor);*/
