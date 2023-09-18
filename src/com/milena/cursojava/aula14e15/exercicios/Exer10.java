package com.milena.cursojava.aula14e15.exercicios;

import java.util.Scanner;

/*.Faça um Programa que pergunte em que turno você estuda. Peça
para digitar M-matutino ou V-Vespertino ou N- Noturno. Imprima a
mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor
Inválido!", conforme o caso.*/
public class Exer10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a letra do turno em que você estuda: \nM- Matutino \nV- Vespertino \nN- Noturno ");
        String letra = scan.next();

        if (letra.equalsIgnoreCase("M")) {
            System.out.println("Bom Dia!");
        } else if (letra.equalsIgnoreCase("V")) {
            System.out.println("Boa Tarde!");
        } else if (letra.equalsIgnoreCase("N")) {
            System.out.println("Boa Noite!");
        } else {
            System.out.println("Valor inválido");
        }

        /* com switch
        switch (letra) {
            case "M":
                System.out.println("Bom Dia!");break;
            case "V":
                System.out.println("Boa Tarde!");break;
            case "N":
                System.out.println("Boa Noite!");break;
            default:
                System.out.println("Valor Inválido");
        }*/
    }
}
