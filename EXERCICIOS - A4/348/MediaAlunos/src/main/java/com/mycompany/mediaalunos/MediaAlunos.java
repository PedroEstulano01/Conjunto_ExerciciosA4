
package com.mycompany.mediaalunos;

import java.util.Scanner;

public class MediaAlunos {

    public static void main(String[] args) {
        int i;
        String[] nomes = new String[5];
        int[] notas1 = new int[5];
        int[] notas2 = new int[5];
        float[] medias = new float[5];

        for (i = 0; i < 5; i++) {
            System.out.println("Digite o nome do aluno " + (i + 1) + ": ");
            nomes[i] = new Scanner(System.in).nextLine();
            System.out.println("Digite a primeira nota: ");
            notas1[i] = new Scanner(System.in).nextInt();
            System.out.println("Digite a segunda nota: ");
            notas2[i] = new Scanner(System.in).nextInt();
            medias[i] = (notas1[i] + notas2[i]) / 2;
        }

        System.out.println("\n\n\n\t\t\t\tRELATÓRIO FINAL\n");
        for (i = 0; i < 5; i++) {
            System.out.println("\n" + (i + 1) + " - " + nomes[i]);
            System.out.println("\t" + notas1[i] + "\t" + notas2[i] + "\t" + medias[i]);
        }
        System.out.println("\n");
    }
}


