package com.milena.cursojava.aula16e17.exercicios;

import java.util.Scanner;

public class Exer14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int soma = 0;
        int qntdPar = 0;
        int qntdImpar = 0;
        int num;
        for(int i = 1; i <= 10; i++){
            System.out.println("Informe o " + i + "º numero: ");
            num = scan.nextInt();
            soma += num;
            if(num % 2 == 0) {
                qntdPar++;
            } else {
                qntdImpar++;
            }
        }
        System.out.println("A soma dos números é: " + soma);
        System.out.println("Existem " + qntdPar + " números pares e " + qntdImpar + " números impares");
    }
}
