package com.milena.cursojava.aula16e17.exercicios;

public class Exer16 {
    public static void main(String[] args) {
        int fibN2 = 0;
        int fibN1 = 1;
        int fibN = 0;

        while ( fibN <= 500) {
            if(fibN == 0 || fibN == 1) {
                System.out.print(fibN + " ");
            }

            fibN = fibN1 + fibN2;
            fibN2 = fibN1;
            fibN1 = fibN;
            System.out.print(fibN + " ");
        }
    }
}
