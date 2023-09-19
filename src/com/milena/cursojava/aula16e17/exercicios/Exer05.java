package com.milena.cursojava.aula16e17.exercicios;

import java.util.Scanner;

public class Exer05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int populacaoA, populacaoB;
        double taxaA, taxaB;

        do {
            System.out.print("Digite a população da Cidade A");
            populacaoA = scan.nextInt();
            if (populacaoA <= 0) {
                System.out.println("Valor da população tem que ser maior que 0");
            }
        } while (populacaoA <= 0);


        do {
            System.out.print("Digite a taxa de crescimento da população A");
            taxaA = scan.nextDouble() / 100;
            if (taxaA <= 0) {
                System.out.println("Valor da taxa de crescimento tem que ser maior que 0");
            }
        } while (taxaA <= 0);

        do {
            System.out.print("Digite a população B");
            populacaoB = scan.nextInt();
            if (populacaoB <= 0) {
                System.out.println("Valor da população tem que ser maior que 0");
            }
        } while (populacaoB <= 0);

        do {
            System.out.print("Digite a taxa de crescimento da população B");
            taxaB = scan.nextDouble() / 100;
            if (taxaB <= 0) {
                System.out.println("Valor da taxa de crescimento tem que ser maior que 0");
            }
        } while (taxaB <= 0);

        int anos = 0;
        while (populacaoA <= populacaoB) {
            populacaoA += populacaoA * taxaA;
            populacaoB += populacaoB * taxaB;
            anos++;
        }
        System.out.println("A quantidade de anos necessarios para que a população de A ultrapasse B é de: " + anos + " anos.");
    }
}
