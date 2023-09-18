package com.milena.cursojava.aula14e15.exercicios;

import java.util.Scanner;

public class Exer27 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a quantidade em kg de morangos");
        double morangosKg = scan.nextDouble();

        System.out.println("Digite a quantidade em kg de maçãs");
        double macasKg = scan.nextDouble();

        double precoMorangos;
        double precoMacas;

        if(morangosKg <= 5) {
            precoMorangos = 2.5;
        } else {
            precoMorangos = 2.2;
        }
        precoMorangos = precoMorangos * morangosKg;
        //double precoTotalMorango = precoMorangos * morangosKg

        if (macasKg <= 5) {
            precoMacas = 1.8;
        } else {
            precoMacas =  1.5;
        }
        precoMacas = precoMacas * macasKg;
        //double precoTotalMaca = precoMaca * macasKg

        double precoParcial = precoMorangos + precoMacas;
        double precoTotal = precoParcial;

        if(morangosKg + macasKg == 8 || precoTotal > 25){
            precoTotal = precoParcial - (precoTotal * 0.1);
        }

        System.out.println("Quantidade morangos " + morangosKg + ", Preço Morangos: " + precoMorangos);
        System.out.println("Quantidade de maças: " + macasKg + ", Preço Maçãs: " + precoMacas);
        System.out.println("Total a se pago pelo cliente: " + precoTotal);
    }
}
/*.Uma fruteira está vendendo frutas com a seguinte tabela de preços:
Até 5 Kg Acima de 5 Kg
Morango R$ 2,50 por Kg R$ 2,20 por Kg
Maçã R$ 1,80 por Kg R$ 1,50 por Kg
Se o cliente comprar mais de 8 Kg em frutas ou o valor total da
compra ultrapassar R$ 25,00, receberá ainda um desconto de
10% sobre este total. Escreva um algoritmo para ler a
quantidade (em Kg) de morangos e a quantidade (em Kg) de
maças adquiridas e escreva o valor a ser pago pelo cliente.*/