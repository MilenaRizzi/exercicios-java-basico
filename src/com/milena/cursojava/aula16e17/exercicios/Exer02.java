package com.milena.cursojava.aula16e17.exercicios;

import java.util.Scanner;

/*Faça um programa que leia um nome de usuário e a sua senha e não
aceite a senha igual ao nome do usuário, mostrando uma mensagem
de erro e voltando a pedir as informações*/
public class Exer02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o nome de usuário");
        String nomeUsuario = scan.next();
        System.out.println("Digite sua senha");
        String senha = scan.next();

        while(nomeUsuario.equalsIgnoreCase(senha)) {
            System.out.println("Erro! Nome de usuário e senha não podem ser iguais. Digite novamente");
            System.out.println("Digite o nome de usuário");
            nomeUsuario = scan.next();
            System.out.println("Digite sua senha");
            senha = scan.next();
        }
        System.out.println("Usuário cadastrado");
    }

}
