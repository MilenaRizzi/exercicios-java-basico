package com.milena.cursojava.aula16e17.exercicios;

import java.util.Scanner;

public class Exer17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com um número");
        int num = scan.nextInt();
        int fatorial = 1;
        for(int i = num; i > 0; i--){
            fatorial *= i;
        }
        System.out.println(fatorial);
    }
}
