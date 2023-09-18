package com.milena.cursojava.aula12e13.exercicios;

import java.util.Scanner;

/*.Faça um programa que peça o tamanho de um arquivo para download
(em MB) e a velocidade de um link de Internet (em Mbps), calcule e
informe o tempo aproximado de download do arquivo usando este link
(em minutos).*/
public class Ex18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o tamanho do arquivo em MB e a velicidade de um link de internet em Mbps");
        int tamanhoArquivo = scan.nextInt();
        int velocidadeInternet = scan.nextInt();
        double tempoDownloadSegundos = tamanhoArquivo / velocidadeInternet;
        double tempoDownloadMinutos = tempoDownloadSegundos / 60;
        System.out.println("O tempo de download do arquivo, em segundos, usando esse link é: " + tempoDownloadSegundos);

        System.out.println("O tempo de download do arquivo, em minutos, usando esse link é: " + tempoDownloadMinutos);
    }
}
