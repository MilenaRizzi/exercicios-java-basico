package com.milena.cursojava.aula16e17.exercicios;

import java.util.Scanner;

public class Exer03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nomeUsuario, sexo, estadoCivil;
        int idade;
        double salario;

        do {
            System.out.println("Digite o nome -> Deve ser maior que 3 caracteres");
            nomeUsuario = scan.next();

            /* caso eu quisesse mostrar uma mensagem de especificando
            if (nomeUsuario.length() <= 3) {
                System.out.println("Nome de usuário deve ter mais de 3 caractere. Digite novamente");
            }*/
        } while (nomeUsuario.length() <= 3);

        do {
            System.out.println("Digite sua idade -> Entre 0 e 150");
            idade = scan.nextInt();
        } while (idade < 0 || idade > 150);


        do {
            System.out.println("Digite seu salário -> Deve ser maior que 0");
            salario = scan.nextDouble();
        } while (salario <= 0);


        do {
            System.out.println("Digite a letra correspondente ao sexo F - Feminino, M - Masculino");
            sexo = scan.next();

        } while (!sexo.equalsIgnoreCase("f") && !sexo.equalsIgnoreCase("m"));

        do {
            System.out.println("Digite a letra correspondente ao estado civil: \nS - Solteiro \nC - Casado \nV - Viúvo \nD - Divorciado");
            estadoCivil = scan.next();
        } while (!estadoCivil.equalsIgnoreCase("s") && !estadoCivil.equalsIgnoreCase("c") &&
                !estadoCivil.equalsIgnoreCase("v") && !estadoCivil.equalsIgnoreCase("d"));

        System.out.println("Usuário cadastrado: nome: " + nomeUsuario
                + "\nidade: " + idade
                + "\nsalario: " + salario
                + "\nsexo: " + sexo
                + "\nEstado civil: " + estadoCivil);


    }
}
