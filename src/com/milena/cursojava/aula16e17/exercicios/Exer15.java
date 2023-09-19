package com.milena.cursojava.aula16e17.exercicios;

import java.util.Scanner;

public class Exer15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com o número");
        int n = scan.nextInt();
        int fibN2 = 0;
        int fibN1 = 1;
        int fibN;
        if (n >= 1) {
            System.out.print(fibN2 + " ");
        }
        if (n >= 2) {
            System.out.print(fibN1 + " ");
        }
        for(int i = 0 ; i <= n; i++){
            fibN = fibN1 + fibN2;
            fibN2 = fibN1;
            fibN1 = fibN;
            System.out.print(fibN + " ") ;
        }
    }
}
