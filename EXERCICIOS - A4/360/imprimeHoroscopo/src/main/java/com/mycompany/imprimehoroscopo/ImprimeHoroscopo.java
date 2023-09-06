package com.mycompany.imprimehoroscopo;

import java.util.Scanner;

public class ImprimeHoroscopo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] ultDia = {20, 19, 20, 20, 20, 20, 21, 22, 22, 22, 21, 21};
        String[] signo = {"Capricórnio", "Aquário", "Peixes", "Áries", "Touro", "Gêmeos", "Câncer", "Leão", "Virgem", "Libra", "Escorpião", "Sagitário"};
        System.out.println("Digite a data de nascimento (ddmm) ou 9999 para sair: ");
        int data = scanner.nextInt();
        while (data != 9999) {
            int dia = data / 100;
            int mes = data % 100;
            mes--;
            if (dia > ultDia[mes]) {
                mes = (mes + 1) % 12;
            }
            System.out.println("Seu horóscopo é: " + signo[mes]);
            System.out.println("Digite a data de nascimento (ddmm) ou 9999 para sair: ");
            data = scanner.nextInt();
        }
    }
}
