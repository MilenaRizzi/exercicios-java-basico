package com.milena.cursojava.aula14e15.exercicios;

import java.util.Scanner;

public class Exer18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com uma data no formato: dd/mm/aaaa - utilize espaços no lugar das '/'");
        int dd = scan.nextInt();
        int mm = scan.nextInt();
        int aaaa = scan.nextInt();

        if(dd >= 1 && dd <= 31)  {
            if(mm >= 1 && mm <= 12) {
                if (aaaa >= 0){
                    System.out.println("Data válida");
                }
            }
        } else {
            System.out.println("Data inválida");
        }

    }
}
