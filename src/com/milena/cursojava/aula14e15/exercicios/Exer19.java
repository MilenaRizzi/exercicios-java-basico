package com.milena.cursojava.aula14e15.exercicios;

import java.util.Scanner;

/*Faça um Programa que leia um número inteiro menor que 1000 e
imprima a quantidade de centenas, dezenas e unidades do mesmo.
- Observando os termos no plural a colocação do "e", da vírgula
entre outros. Exemplo:
- 326 = 3 centenas, 2 dezenas e 6 unidades
- 12 = 1 dezena e 2 unidades Testar com: 326, 300, 100, 320,
310,305, 301, 101, 311, 111, 25, 20, 10, 21, 11, 1, 7 e 16*/
public class Exer19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com um número inteiro menor que 1000");
        int num = scan.nextInt();
        int unidade;
        int dezena;
        int centena;

        if(num < 10) {
            unidade = num;
            System.out.println(num + " = " + unidade + " unidades" );
        } else if (num >= 10 && num <= 99) {
            dezena = num / 10;
            unidade = num % 10;
            System.out.println(num + " = " + dezena + " dezenas e " + unidade + " unidades" );
        } else if (num >= 100 && num < 1000){
            centena = num / 100;
            int restoDaDivisao = num % 100; // 326 / 100 = 26
            dezena = restoDaDivisao / 10;
            unidade = (restoDaDivisao) % 10;
            System.out.println(num + " = " + centena + " centenas e " + dezena + " dezenas e " + unidade + " unidades" );

        }

    }
}
