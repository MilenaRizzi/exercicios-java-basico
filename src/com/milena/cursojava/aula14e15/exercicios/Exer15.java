package com.milena.cursojava.aula14e15.exercicios;

import java.util.Scanner;

/*5.Faça um Programa que peça os 3 lados de um triângulo. O programa
deverá informar se os valores podem ser um triângulo. Indique, caso
os lados formem um triângulo, se o mesmo é: equilátero, isósceles ou
escaleno.
 Dicas:
- Três lados formam um triângulo quando a soma de quaisquer dois lados for maior que o terceiro;
- Triângulo Equilátero: três lados iguais;
- Triângulo Isósceles: quaisquer dois lados iguais;
- Triângulo Escaleno: três lados diferentes;*/
public class Exer15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o primeiro lado do triangulo");
        int lado1 = scan.nextInt();
        System.out.println("Digite o segundo lado do triangulo");
        int lado2 = scan.nextInt();
        System.out.println("Digite o terceiro lado do triangulo");
        int lado3 = scan.nextInt();

        if ((lado1 + lado2 > lado3) ||( lado2 + lado3 > lado1) || (lado1 + lado3 > lado2)) {
            if(lado1 == lado2 && lado1 == lado3){
                System.out.println("Triango Equilátero = Todos os lados são iguais");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("Triângulo Isóceles = Ao menos dois lados são iguais");
            } else {
                System.out.println("Triângulo Escaleno = Todos os lados são diferentes");
            }
        } else {
            System.out.println("Não é um triângulo");
        }
    }
}