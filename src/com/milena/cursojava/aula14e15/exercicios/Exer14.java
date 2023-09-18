package com.milena.cursojava.aula14e15.exercicios;

import java.util.Scanner;

/*.Faça um programa que lê as duas notas parciais obtidas por um aluno
numa disciplina ao longo de um semestre, e calcule a sua média. A
atribuição de conceitos obedece à tabela abaixo:
Média de Aproveitamento Conceito
Entre 9.0 e 10.0 A
Entre 7.5 e 9.0 B
Entre 6.0 e 7.5 C
Entre 4.0 e 6.0 D
Entre 4.0 e zero E*/
public class Exer14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com a primeira nota: ");
        double nota1 = scan.nextDouble();
        System.out.println("Entre com a segunda nota: ");
        double nota2 = scan.nextDouble();
        double media = (nota1 + nota2) / 2;

        String conceito = "";
        String resultado;

        if(media >= 9) {
            conceito = "A";
        } else if(media >= 7.5 && media < 9){
            conceito = "B";
        } else if (media >= 6 && media < 7.5) {
            conceito = "C";
        } else if (media >= 4 && media < 6) {
            conceito = "D";
        } else if(media >= 0 && media < 4) {
            conceito = "E";
        }

        if (conceito.equals("A") || conceito.equals("B") || conceito.equals("C")){
            resultado = "APROVADO";
        } else {
            resultado = "REPROVADO";
        }
        System.out.println("Sua média é: " + media);
        System.out.println("Conceito da Nota: " + conceito);
        System.out.println("Resultado Final: " + resultado);
    }
}
