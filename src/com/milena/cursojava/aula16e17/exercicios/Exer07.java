package com.milena.cursojava.aula16e17.exercicios;

import java.util.Scanner;

public class Exer07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int maior = 0;
        int num;
        for(int i = 1; i <= 5; i++){
            System.out.println("Informe o " + i + "º numero: ");
            num = scan.nextInt();
            if(num > maior) {
                maior = num;
            }
        }
        System.out.println("O maior número é: "+ maior);

    }
}
