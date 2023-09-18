package com.milena.cursojava.aula12e13.exercicios;

import java.util.Scanner;
//Faça um Programa que peça um número e então mostre a
//mensagem O número informado foi [número].
public class Ex02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número");
        int numero = scan.nextInt();
        System.out.println("O número informado foi: " + numero);
    }
}
