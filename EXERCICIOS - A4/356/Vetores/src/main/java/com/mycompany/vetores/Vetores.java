
package com.mycompany.vetores;

import java.util.Scanner;

public class Vetores {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] nomes = new String[15];
        String[] sit = new String[15];
        double[] media = new double[15];
        double[] pr1 = new double[15];
        double[] pr2 = new double[15];

        for (int i = 0; i < 15; i++) {
            System.out.println("Digite " + (i + 1) + " nome: ");
            nomes[i] = scanner.nextLine();

            while (nomes[i].length() > 30) {
                System.out.println("Nomes com até 30 caracteres");
                System.out.println("Digite " + (i + 1) + " nome: ");
                nomes[i] = scanner.nextLine();
            }

            int t = 30 - nomes[i].length();
            for (int c = 1; c <= t; c++) {
                nomes[i] = " " + nomes[i];
            }
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite 1 nota: ");
            pr1[i] = scanner.nextDouble();
            System.out.println("Digite 2 nota: ");
            pr2[i] = scanner.nextDouble();
        }

        for (int i = 0; i < 5; i++) {
            media[i] = (pr1[i] + pr2[i]) / 2;
        }

        for (int i = 0; i < 5; i++) {
            if (media[i] >= 5) {
                sit[i] = "AP";
            } else {
                sit[i] = "RP";
            }
        }

       System.out.println("\n\n\n\t\t\t\tRELAÇÃO FINAL\n");
        for (int i = 0; i < 5; i++) {
            System.out.printf("%2d - %-30s %5.2f %5.2f %5s %5.2f\n", i + 1, nomes[i], pr1[i], pr2[i], sit[i], media[i]);
        }
    }
}
