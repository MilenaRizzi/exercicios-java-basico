package com.milena.cursojava.aula12e13.exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

//Faça um Programa que peça o raio de um círculo, calcule e mostre
//sua área.
public class Ex06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o raio do circulo: ");
        double raio = scan.nextDouble();
        double areaCirculo = Math.PI *(Math.pow(raio, 2));
        System.out.printf("A área do circulo é: %.2f%n", areaCirculo);
    }
}
