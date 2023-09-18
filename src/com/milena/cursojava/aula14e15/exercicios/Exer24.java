package com.milena.cursojava.aula14e15.exercicios;

import java.util.Scanner;

/*24.Faça um Programa que leia 2 números e em seguida pergunte ao
usuário qual operação ele deseja realizar. O resultado da operação
deve ser acompanhado de uma frase que diga se o número é:
. par ou ímpar;
a. positivo ou negativo;
b. inteiro ou decimal.*/
public class Exer24 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com o primeiro número: ");
        double num1 = scan.nextDouble();

        System.out.println("Entre com o segundo número: ");
        double num2 = scan.nextDouble();

        System.out.println("Digite a operação que deseja realizar: \n* Multiplicação \n/ Divisão \n+ Soma \n- Subtração");
        String letra = scan.next();

        double resultado = 0;
        boolean valida = true; //flag

        switch (letra){
            case "*": resultado = num1 * num2; break;
            case "/": resultado = num1 / num2; break;
            case "+": resultado = num1 + num2; break;
            case "-": resultado = num1 - num2; break;
            default:
                System.out.println("Operação Inválida");
                valida = false;
        }
        //caso o programa caia em default, o valida será false e o restante nem é executado
        // caso eu digitasse um q para a operação, cairia no default, mostraria operação inválida e encerraria o programa

        if(valida == true) {

            System.out.println("O resultado da operação é: " + resultado );

            if(resultado % 2 == 0) {
                System.out.println("Resultado é par");
            } else {
                System.out.println("Resultado é ímpar");
            }

            if(resultado >= 0) {
                System.out.println("Resultado é posivito");
            } else {
                System.out.println("Resultado é negativo");
            }

            if(resultado % 1 == 0){
                System.out.println("Resultado é inteiro");
            } else {
                System.out.println("Resultado é decimal");
            }
        }
    }
}
