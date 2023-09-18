package com.milena.cursojava.aula14e15.exercicios;

import java.util.Scanner;

public class Exer20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com a primeira nota: ");
        double nota1 = scan.nextDouble();
        System.out.println("Entre com a segunda nota: ");
        double nota2 = scan.nextDouble();
        System.out.println("Entre com a terceira nota: ");
        double nota3 = scan.nextDouble();

        double media = (nota1 + nota2) / 2;
        if(media == 10) {
            System.out.println("Média 10! Aprovado com distinção");
        } else if(media >= 7){
            System.out.println("Média = " + media + " Aprovado");
        } else {
            System.out.println("Média = " + media + " Reprovado");
        }
    }
}
