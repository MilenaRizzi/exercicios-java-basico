package com.milena.cursojava.aula16e17.exercicios;

import java.util.Scanner;

public class Exer12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com o número que deseja consultar a tabuada: ");
        int num = scan.nextInt();
        int multiplicacao;
        System.out.println("Tabuada de " + num + ":");
        for(int i = 1; i <= 10; i++) {
            multiplicacao = num * i;
            System.out.println(num + " X " + i + " = " + multiplicacao);
        }
    }
}
