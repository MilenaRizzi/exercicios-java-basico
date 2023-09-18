package com.milena.cursojava.aula12e13.exercicios;

import java.util.Scanner;

//Faça um Programa que peça a temperatura em graus Farenheit,
//transforme e mostre a temperatura em graus Celsius.
public class Ex09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a temperatura em Farenheit: ");
        int tempF = scan.nextInt();

        int tempC = (5*(tempF - 32)/9);
        System.out.println("A temperatura equivalente em Celsius é de: " + tempC +"ºC");
    }
}
