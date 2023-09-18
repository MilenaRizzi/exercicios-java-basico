package com.milena.cursojava.aula12e13.exercicios;

import java.util.Scanner;

//Faça um Programa que calcule a área de um quadrado, em seguida
//mostre o dobro desta área para o usuário.
public class Ex07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o lado do quadrado: ");
        double lado = scan.nextDouble();
        double area = Math.pow(lado, 2);
        System.out.println("O dobro da área do quadrado é: " + area * 2);
    }
}
