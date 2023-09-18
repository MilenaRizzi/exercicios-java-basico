package com.milena.cursojava.aula14e15.exercicios;

import java.util.Scanner;

public class Exer21 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com o valor de saque: - minimo 10,00 máximo 600,00");
        int valorSaque = scan.nextInt();
        int nota100 = valorSaque / 100;
        int nota50 = valorSaque / 50;
        int nota10 = (valorSaque % 50) / 10;
        int nota5 = (valorSaque % 10) / 5;
        int nota1 = valorSaque % 10;

        if(valorSaque == 10) {
            nota10 = 1;
            System.out.println(nota10 + "notas de 10");
        } else if (valorSaque > 10 && valorSaque <= 49) {
            System.out.println(nota10 + " notas de 10, " + nota5 + " notas 5, " + nota1 + " notas de 1" );
        } else if (valorSaque >= 50 && valorSaque <= 99) {
            System.out.println(nota50 + " notas de 50, " + nota10 + " notas de 10, " + nota5 + " notas 5, " + nota1 + " notas de 1" );
        } else {
            System.out.println(nota100 + " notas de 100, " + nota50 + " notas de 50, " + nota10 + " notas de 10, " + nota5 + " notas 5, " + nota1 + " notas de 1" );
        }
    }
}

/*Faça um Programa para um caixa eletrônico. O programa deverá
perguntar ao usuário a valor do saque e depois informar quantas notas
de cada valor serão fornecidas. As notas disponíveis serão as de 1, 5,
10, 50 e 100 reais. O valor mínimo é de 10 reais e o máximo de 600
reais. O programa não deve se preocupar com a quantidade de notas
existentes na máquina.
. Exemplo 1: Para sacar a quantia de 256 reais, o programa
fornece duas notas de 100, uma nota de 50, uma nota de 5 e
uma nota de 1;
a. Exemplo 2: Para sacar a quantia de 399 reais, o programa
fornece três notas de 100, uma nota de 50, quatro notas de 10,
uma nota de 5 e quatro notas de 1.*/
