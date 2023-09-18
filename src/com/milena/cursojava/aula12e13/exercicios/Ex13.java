package com.milena.cursojava.aula12e13.exercicios;

import java.util.Scanner;

/*Tendo como dados de entrada a altura e o sexo de uma pessoa,
//construa um algoritmo que calcule seu peso ideal, utilizando as
seguintes fórmulas:
. Para homens: (72.7*h) - 58
//a. Para mulheres: (62.1*h) - 44.7 (h = altura)
//b. Peça o peso da pessoa e informe se ela está dentro, acima ouabaixo do peso */
public class Ex13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o sexo: Feminino ou Masculino");
        String sexo = scan.next();
        System.out.println("Digite sua altura: ");
        double altura = scan.nextDouble();
        System.out.println("Digite o seu peso atual: ");
        double pesoAtual = scan.nextDouble();
        double pesoIdeal = 0;
        if (sexo == "Feminino") {
            pesoIdeal = (62.1 * altura) - 44.7;
        } else {
            pesoIdeal = (72.7 * altura) - 58;
        }

        if (pesoIdeal == pesoAtual) {
            System.out.println("Você esta dentro do peso ideal");
        } else if (pesoIdeal >  pesoAtual) {
            System.out.println("Voce está abaixo do seu peso ideal");
        } else {
            System.out.println("Você está acima do seu peso ideal");
        }

    }
}
