package com.milena.cursojava.aula12e13.exercicios;

import java.util.Scanner;

//Faça um Programa que peça 2 números inteiros e um número real.
//Calcule e mostre:
//a. o produto do dobro do primeiro com metade do segundo .
//b. a soma do triplo do primeiro com o terceiro.
//c. o terceiro elevado ao cubo.
public class Ex11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite dois numeros inteiros ");
        int int1 = scan.nextInt();
        int int2 = scan.nextInt();
        System.out.println("Digite um número real: ");
        double real = scan.nextDouble();

        //para uma entrada int1 = 2 e int2 = 5, a alternativa a = 8 e não 10, dado que as variáveis são do tipo inteiro
        //ao dividir int2/2 que seria 2,5, como a variavel é int, ao dividir resultará 2 e não 2,5
        // portanto, 2*2 = 4, 5 / 2 = 2 e não 2,5 pois é int
        double a = (int1 * 2) * (int2 / 2);
        double b = (int1 * 3) + real;
        double c = Math.pow(real, 3);

        System.out.println("o produto do dobro do primeiro com metade do segundo: " + a);
        System.out.println("a soma do triplo do primeiro com o terceiro: " + b);
        System.out.println("o terceiro elevado ao cubo: " + c);
    }
}
