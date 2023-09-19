package com.milena.cursojava.aula16e17.exercicios;

import java.util.Scanner;

public class Exer19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Determine a quantidade de números você deseja inserir");
        int n = scan.nextInt();
        int num = 0;
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        int soma = 0;

        do {
            for (int i = 1; i <= n; i++) {
                System.out.println("Digite o número");
                num = scan.nextInt();
                if (num < 0 || num > 1000) {
                    System.out.println("Número inválido, digite números apenas entre 0 e 1000");
                    i = 0;
                } else {
                    soma += num;
                    if (num > maior) {
                        maior = num;
                    }
                    if (num < menor) {
                        menor = num;
                    }
                }
            }
            System.out.println("O menor elemento é: " + menor);
            System.out.println("O maior elemento é: " + maior);
            System.out.println("A soma dos elementos é: " + soma);
        } while (num < 0 || num > 1000);
    }
}
