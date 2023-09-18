package com.milena.cursojava.aula12e13.exercicios;

import java.util.Scanner;

// Faça um Programa que converta metros para centímetros
public class Ex05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a quantidade de metros: ");

        double metro = scan.nextDouble();
        double centimetro = metro * 100;
        System.out.println("A quantidade de " + metro + "m " + " equivale a: " + centimetro + "cm");
    }
}
