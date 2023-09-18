package com.milena.cursojava.aula14e15.exercicios;

import java.util.Scanner;

public class Exer28 {
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

        System.out.println("Digite a forma de pagamento");
        System.out.println("a-Cartão Tabajara \nb-Cartão Comum \nc-Dinheiro");
        String formaDePagamento = scan.next();

        double precoCarne = 0;

        if(tipoDeCarne.equalsIgnoreCase("F")) {
            if(carneKG <= 5){
                precoCarne = 4.9;
            } else {
                precoCarne = 5.8;
            }
        } else if (tipoDeCarne.equalsIgnoreCase("A")){

            if (carneKG <= 5){
                precoCarne = 5.9;
            } else {
                precoCarne = 6.8;
            }
        } else if(tipoDeCarne.equalsIgnoreCase("P")){
            if (carneKG <= 5) {
                precoCarne = 6.9;
            } else {
                precoCarne = 7.8;
            }
        } else {
            System.out.println("Entrada inválida, digite um tipo de carne válido");
        }

        double precoTotal = precoCarne * carneKG;;
        double desconto = 0;
        double  precoComDesconto = precoTotal;

        if(formaDePagamento.equalsIgnoreCase("a")) {
            desconto = precoTotal * 0.05;
            precoComDesconto = precoTotal - desconto;
        }

        System.out.println("Tipo de carne comprada: " + tipoDeCarne +
                "\nQuantidade de carne comprada: " + carneKG +
                "\nPreço total: " + precoTotal +
                "\nTipo de pagamento: " + formaDePagamento +
                "\nValor do desconto: " + desconto +
                "\nValor Final a pagar: " + precoComDesconto);
    }

    public static void exibirLinha(String produto, String precoAte5Kg, String precoAcima5Kg) {
        System.out.printf("%-15s | %-15s | %-15s%n", produto, precoAte5Kg, precoAcima5Kg);
    }
}
