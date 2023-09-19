package com.milena.cursojava.aula16e17.exercicios;

import java.util.Scanner;

public class Exer11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com o primeiro número");
        int num1 = scan.nextInt();
        System.out.println("Entre com o segundo número");
        int num2 = scan.nextInt();
        int maior, menor;
        if(num1 > num2) {
            maior = num1;
            menor = num2;
        } else {
            maior = num2;
            menor = num1;
        }

        int soma = 0;
        for(int i = menor + 1, j = maior; i < j; i++){
            soma += i;
        }
        System.out.println("A soma dos números que estão entre " + menor + " e " + maior + " é: " + soma);
    }
}
