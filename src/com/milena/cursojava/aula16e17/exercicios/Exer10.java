package com.milena.cursojava.aula16e17.exercicios;

import java.util.Scanner;

public class Exer10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com o primeiro número");
        int num1 = scan.nextInt();
        System.out.println("Entre com o segundo número");
        int num2 = scan.nextInt();
        int maior, menor;
        if(num1 > num2) {
            maior = num1;
            menor = num2;
        } else {
            maior = num2;
            menor = num1;
        }
        for(int i = menor + 1, j = maior; i < j; i++){
            System.out.println(i);
        }
    }
}
