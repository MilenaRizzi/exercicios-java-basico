package com.milena.cursojava.aula16e17.exercicios;

import java.util.Scanner;

public class Exer13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com o primeiro número - base da operação");
        int base = scan.nextInt();
        System.out.println("Entre com o segundo número - expoente da operação");
        int expoente = scan.nextInt();
        double resultado = base;

        for(int i = 1; i < expoente; i++) {
            resultado *= base;
        }
        System.out.println(resultado);
    }
}
