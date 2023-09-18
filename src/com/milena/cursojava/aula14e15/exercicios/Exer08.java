package com.milena.cursojava.aula14e15.exercicios;

import java.util.Scanner;

/*. Faça um programa que pergunte o preço de três produtos e informe
qual produto você deve comprar, sabendo que a decisão é sempre
pelo mais barato.*/
public class Exer08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com o preço do primeiro produto");
        double preco1 = scan.nextDouble();
        System.out.println("Entre com o preço do segundo produto");
        double preco2 = scan.nextDouble();
        System.out.println("Entre com o preço do terceiro produto");
        double preco3 = scan.nextDouble();

        if (preco1 <= preco2 && preco1 <= preco3){
            System.out.println("Compre o produto 1");
        } else if (preco2 <= preco1 && preco2 <= preco3){
            System.out.println("Compre o produto 2");
        } else if (preco3 <= preco1 && preco3 <= preco2){
            System.out.println("Compre o produto 3");
        }
    }
}
