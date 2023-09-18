package com.milena.cursojava.aula14e15.exercicios;

import java.util.Scanner;

/*Faça um Programa que peça um número correspondente a um
determinado ano e em seguida informe se este ano é ou não bissexto.*/
public class Exer17 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com o número de um determinado ano: ");
        int ano = scan.nextInt();

        //se o ano resto da divisão por 400 for 0, então é bissexto
        // ou se o ano resto da divisão por 4 for 0 e o ano resto da divisão por 100 for 0, então é bissexto tbm
        if((ano % 400 == 0) || (ano % 4 == 0 && ano % 100 != 0)) {
            System.out.println("Ano informado é bissexto! ");
        } else {
            System.out.println("Ano informado não é bissexto! ");
        }
    }
}
