package com.milena.cursojava.aula14e15.exercicios;

import java.util.Scanner;

/*Faça um Programa que verifique se uma letra digitada é vogal ou
consoante.*/
public class Exer04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite uma letra");
        String letra = scan.next();

        //if criado na aula de correção
        //para garantir que a entrada do usuário seja uma letra
        if(letra.length() > 1) {
            System.out.println("Não é uma letra válida");
        } else {
            switch(letra) {
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                case "A":
                case "E":
                case "I":
                case "O":
                case "U":
                    System.out.println("A letra " + "'" + letra + "'" + " é uma vogal"); break;
                default:
                    System.out.println("A letra " + "'" + letra + "'" + " é uma consoante");
            }
        }

        //switch com String a partir do java7

      //comparar strings em java é com equals
       /*if(letra.equals("a")|| letra == "e" || letra == "i" || letra == "o" || letra == "u"){
            System.out.println("A letra " + letra + " é uma vogal");
        } else {
            System.out.println("A letra " + "'" + letra + "'" + " é uma consoante");
        }*/
    }
}
