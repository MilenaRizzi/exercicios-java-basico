package com.milena.cursojava.aula12e13.exercicios;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o peso do peixe ");
        double peso = scan.nextDouble();
        double pesoExcedido = 0;
        double multa = 0;
        if(peso > 50) {
            pesoExcedido = (peso - 50);
            multa = pesoExcedido * 4;
            System.out.println("Peso Excedido: " + pesoExcedido + "\nMulta: " + multa);
        } else {
            System.out.println("Peso Excedido: " + pesoExcedido + "\nMulta: " + multa);
        }
    }
}
