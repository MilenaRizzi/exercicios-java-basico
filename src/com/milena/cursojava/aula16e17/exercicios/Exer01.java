package com.milena.cursojava.aula16e17.exercicios;

import java.util.Scanner;
/*Faça um programa que peça uma nota, entre zero e dez. Mostre uma
mensagem caso o valor seja inválido e continue pedindo até que o
usuário informe um valor válido.*/
public class Exer01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double nota;

//        do {
//            System.out.println("Digite uma nota entre 0 e 10");
//            nota = scan.nextDouble();
//        } while (nota < 0 || nota > 10);

        do {
            System.out.print("Digite uma nota entre 0 e 10: ");
            nota = scan.nextDouble();

            if (nota < 0 || nota > 10) {
                System.out.println("Valor inválido! A nota deve estar entre 0 e 10.");
            }
        } while (nota < 0 || nota > 10);
    }
}
