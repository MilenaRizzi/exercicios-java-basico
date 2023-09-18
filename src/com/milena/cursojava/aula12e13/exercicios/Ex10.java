package com.milena.cursojava.aula12e13.exercicios;

import java.util.Scanner;

//Faça um Programa que peça a temperatura em graus Celsius,
//transforme e mostre em graus Farenheit.
public class Ex10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a temperatura em graus Celsius: ");
        double tempC = scan.nextDouble();
        double temF = (1.8*tempC) + 32;
        System.out.println("A temperatura equivalente em Fahrenheit é de: " + temF+"ºF");
    }
}
