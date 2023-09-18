package com.milena.cursojava.aula14e15.exercicios;

import java.util.Scanner;

public class Exer26 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o número de litros vendidos");
        double litrosVendidos = scan.nextInt();

        System.out.println("Digite a letra do tipo de combustível \nA-álcool \nG-gasolina");
        String tipoDeCombustivel = scan.next();

        double preco = 0;
        double porcentagem = 0;

        if(tipoDeCombustivel.equalsIgnoreCase("a")) {
            preco = litrosVendidos * 1.9;
            if(litrosVendidos <= 20){
                porcentagem = 3;
            } else {
                porcentagem = 5;
            }
        } else if (tipoDeCombustivel.equalsIgnoreCase("g")){
            preco = litrosVendidos * 2.5;
            if(litrosVendidos <= 20){
                porcentagem = 4;
            } else {
                porcentagem = 6;
            }
        }
        preco = preco - (litrosVendidos * (porcentagem / 100));
        System.out.println("O valor a ser pago pelo cliente é de: R$" + preco);

    }
}
/*26.Um posto está vendendo combustíveis com a seguinte tabela de
descontos:
. Álcool:
a. até 20 litros, desconto de 3% por litro
b. acima de 20 litros, desconto de 5% por litro
Gasolina:
c. até 20 litros, desconto de 4% por litro
d. acima de 20 litros, desconto de 6% por litro Escreva um
algoritmo que leia o número de litros vendidos, o tipo de
combustível (codificado da seguinte forma: A-álcool, Ggasolina), calcule e imprima o valor a ser pago pelo cliente
sabendo-se que o preço do litro da gasolina é R$ 2,50 o preço
do litro do álcool é R$ 1,90*/