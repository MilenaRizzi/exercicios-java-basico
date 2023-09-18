package com.milena.cursojava.aula12e13.exercicios;

import java.util.Scanner;

/*.Faça um programa para uma loja de tintas. O programa deverá pedir o
tamanho em metros quadrados da área a ser pintada. Considere que a
cobertura da tinta é de 1 litro para cada 3 metros quadrados e que a
tinta é vendida em latas de 18 litros, que custam R$ 80,00. Informe ao
usuário a quantidades de latas de tinta a serem compradas e o preço
total.*/
public class Ex16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o tamanho, em metros quadrados, da área a ser pintada: ");
        double tamanho = scan.nextDouble();
        double litros = tamanho / 3;
        double precoTotal = (80*litros) / 18;
        double quantidadeDeLatas = litros / 18;
        System.out.println("Para o tamanho de " + tamanho +"m², a quantidade de latas serão: " + quantidadeDeLatas + " e o preço total, será: " + precoTotal);

    }
}
