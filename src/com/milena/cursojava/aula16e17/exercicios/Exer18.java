package com.milena.cursojava.aula16e17.exercicios;

import java.util.Scanner;

public class Exer18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Determine a quantidade 'n' de conjuntos (n - tem de ser um inteiro)");
        int n = scan.nextInt();
        int num;
        int maior = Integer.MIN_VALUE;
        int menor =  Integer.MAX_VALUE;
        int soma = 0;
        for(int i = 1; i <= n; i++){
            System.out.println("Digite o " + i + "º número");
            num = scan.nextInt();
            soma += num;
            if(num > maior) {
                maior = num;
            }
            if(num < menor) {
                menor = num;
            }

        }

        System.out.println("O menor elemento é: " + menor);
        System.out.println("O maior elemento é: " + maior);
        System.out.println("A soma dos elementos é: " + soma);
    }
}
