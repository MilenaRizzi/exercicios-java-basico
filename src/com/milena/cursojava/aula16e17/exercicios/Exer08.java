package com.milena.cursojava.aula16e17.exercicios;

import java.util.Scanner;

public class Exer08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double soma = 0;
        int num;
        for(int i = 1; i <= 5; i++){
            System.out.print("Informe o " + i + "º numero: ");
            num = scan.nextInt();
            soma += num;
        }
        double media = soma / 5;
        System.out.println("A média dos números é: " + media);
    }
}
