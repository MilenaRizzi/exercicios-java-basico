package com.milena.cursojava.aula14e15.exercicios;

import java.util.Scanner;

public class Exer28B {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Produto        | Até 5 Kg       | Acima de 5 Kg");
        System.out.println("-----------------------------------------------");
        exibirLinha("File Duplo", "R$ 4,90 por Kg", "R$ 5,80 por Kg");
        exibirLinha("Alcatra", "R$ 5,90 por Kg", "R$ 6,80 por Kg");
        exibirLinha("Picanha", "R$ 6,90 por Kg", "R$ 7,80 por Kg");

        System.out.println("\nEntre com a letra correspondente ao tipo de carne desejado");
        System.out.println("F - Filé duplo \nA - Alcatra \nP - Picanha");
        String tipoDeCarne = scan.next();

        System.out.println("Entre com a quantidade (kg) de carne comprada ");
        double carneKG = scan.nextDouble();

        double precoCarne = 0;

        if(tipoDeCarne.equalsIgnoreCase("F")) {
            System.out.println(carneKG + "kg - file duplo");

            if(carneKG <= 5){
                precoCarne = 4.9;
            } else {
                precoCarne = 5.8;
            }

        } else if (tipoDeCarne.equalsIgnoreCase("A")){
            System.out.println(carneKG + "kg - alcatra");

            if (carneKG <= 5){
                precoCarne = 5.9;
            } else {
                precoCarne = 6.8;
            }

        } else if(tipoDeCarne.equalsIgnoreCase("P")){
            System.out.println(carneKG + "kg - picanha");

            if (carneKG <= 5) {
                precoCarne = 6.9;
            } else {
                precoCarne = 7.8;
            }
        } else {
            System.out.println("Entrada inválida, digite um tipo de carne válido");
        }

        double precoTotal = carneKG * precoCarne ;
        System.out.println(carneKG + "kg * " + precoCarne + " = " + precoTotal);

        System.out.println("Compra no cartão da loja? digite 1 para sim:");
        int cartao = scan.nextInt();

        if(cartao == 1) {
            double desconto = precoTotal * 0.05;
            System.out.println("Desconto de: " + desconto);
            System.out.println("Valor a pagar: " + (precoTotal - desconto));
        } else {
            System.out.println("Valor a pagar: " + precoTotal);
        }

    }

    public static void exibirLinha(String produto, String precoAte5Kg, String precoAcima5Kg) {
        System.out.printf("%-15s | %-15s | %-15s%n", produto, precoAte5Kg, precoAcima5Kg);
    }
}
