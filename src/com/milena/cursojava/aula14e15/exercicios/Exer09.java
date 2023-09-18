package com.milena.cursojava.aula14e15.exercicios;

import java.util.Scanner;

//Faça um Programa que leia três números e mostre-os em ordem decrescente.
public class Exer09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com o primeiro número");
        int num1 = scan.nextInt();
        System.out.println("Entre com o segundo número");
        int num2 = scan.nextInt();
        System.out.println("Entre com o terceiro número");
        int num3 = scan.nextInt();

        int maior = num1;
        if(num2 > maior) {
            maior = num2;
        } else if(num3 > maior){
            maior = num3;
        }

        int menor = num1;
        if(num2 < menor) {
            menor = num2;
        } else if(num3 < menor) {
            menor = num3;
        }

        int meio = num1;
        if(num2 != maior && num2 != menor) {
            meio = num2;
        } else if(num3 != maior && num3 != menor){
            meio = num3;
        }

        System.out.println("Os elementos em ordem decrescente são: " + maior + " " + meio + " " + menor);

    }
}
