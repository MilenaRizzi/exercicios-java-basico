package com.milena.cursojava.aula14e15.exercicios;

import java.util.Scanner;

/*Faça um Programa que verifique se uma letra digitada é "F" ou "M".
Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido*/
public class Exer03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite F se o sexo for Feminino ou M se for Masculino");
        String letra = scan.next();
        if(letra.equalsIgnoreCase("F")) {
            System.out.println("F - Feminino");
        } else if(letra.equalsIgnoreCase("M")){
            System.out.println("M - Masculino");
        } else {
            System.out.println("Sexo Inválido");
        }

    }
}
