package com.milena.cursojava.aula16e17.exercicios;

import java.util.Scanner;

// permite que a pessoa escolha se quer continuar contabilizando ou não
public class Exer05B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char continuar;

        do {
            int populacaoA, populacaoB;
            double taxaCrescimentoA, taxaCrescimentoB;

            // Solicita as informações ao usuário e valida as entradas
            do {
                System.out.print("Informe a população do país A (>= 0): ");
                populacaoA = scanner.nextInt();
            } while (populacaoA < 0);

            do {
                System.out.print("Informe a taxa de crescimento do país A (>= 0): ");
                taxaCrescimentoA = scanner.nextDouble() / 100;
            } while (taxaCrescimentoA < 0);

            do {
                System.out.print("Informe a população do país B (>= 0): ");
                populacaoB = scanner.nextInt();
            } while (populacaoB < 0);

            do {
                System.out.print("Informe a taxa de crescimento do país B (>= 0): ");
                taxaCrescimentoB = scanner.nextDouble() / 100;
            } while (taxaCrescimentoB < 0);

            int anos = 0;

            while (populacaoA < populacaoB) {
                populacaoA += populacaoA * taxaCrescimentoA;
                populacaoB += populacaoB * taxaCrescimentoB;
                anos++;
            }

            System.out.println("Após " + anos + " anos, a população do país A ultrapassará ou igualará a população do país B.");
            System.out.println("População do país A: " + populacaoA);
            System.out.println("População do país B: " + populacaoB);

            System.out.print("Deseja calcular novamente? (S/N): ");
            continuar = scanner.next().charAt(0);
        } while (continuar == 'S' || continuar == 's');

    }
}
