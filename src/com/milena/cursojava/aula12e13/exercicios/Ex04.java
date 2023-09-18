package com.milena.cursojava.aula12e13.exercicios;

import java.util.Scanner;

//4. Faça um Programa que peça as 4 notas bimestrais e mostre a média.
public class Ex04 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite suas 4 notas bimestrais: ");
        double nota1 = scan.nextDouble();
        double nota2 = scan.nextDouble();
        double nota3 = scan.nextDouble();
        double nota4 = scan.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println("A media das notas é:  " + media);

    }
}
