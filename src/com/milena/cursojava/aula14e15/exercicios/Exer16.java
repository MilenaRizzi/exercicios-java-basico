package com.milena.cursojava.aula14e15.exercicios;

import java.util.Scanner;

/*.Faça um programa que calcule as raízes de uma equação do segundo
grau, na forma ax2 + bx + c. O programa deverá pedir os valores de a,
b e c e fazer as consistências, informando ao usuário nas seguintes
situações:
a. Se o usuário informar o valor de A igual a zero, a equação não é
do segundo grau e o programa não deve fazer pedir os demais
valores, sendo encerrado;
b. Se o delta calculado for negativo, a equação não possui raizes
reais. Informe ao usuário e encerre o programa;
c. Se o delta calculado for igual a zero a equação possui apenas
uma raiz real; informe-a ao usuário;
d. Se o delta for positivo, a equação possui duas raiz reais;
informe-as ao usuário;*/
public class Exer16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com o valor de a");
        int a = scan.nextInt();

        if(a == 0){
            System.out.println("O programa será encerrado. Valor de a não pode ser igual a 0.");
        } else {
            System.out.println("Entre com o valor de b");
            int b = scan.nextInt();

            System.out.println("Entre com o valor de c");
            int c = scan.nextInt();

            double delta = (Math.pow(b, 2) - 4*a*c);
            double x1 = (-b + Math.sqrt(delta)) / 2;
            double x2 = (-b - Math.sqrt(delta)) / 2;

            if(delta < 0){
                System.out.println("Delta negativo. Equação não possui raízes reais.");
            } else if (delta == 0){
                System.out.println("Delta = 0. Equação possui apenas uma raiz real = " + x1);
            } else {
                System.out.println("Delta > 0. Equacação possui duas raizes reais: raiz 1 =  " + x1 + ", raiz 2 = " + x2);
            }
        }
    }
}
