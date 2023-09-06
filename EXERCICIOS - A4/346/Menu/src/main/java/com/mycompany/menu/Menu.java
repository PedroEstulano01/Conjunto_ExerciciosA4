
package com.mycompany.menu;


import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String frase = "Olá Mundo";
        int opcao;

        while (true) {
            // Exibe o menu
            System.out.println("MENU");
            System.out.println("1 - Imprime o comprimento da frase");
            System.out.println("2 - Imprime os dois primeiros e os dois últimos caracteres da frase");
            System.out.println("3 - Imprime a frase espelhada");
            System.out.println("4 - Termina o algoritmo");
            System.out.print("Opção: ");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1 -> 
                    System.out.println("Número de caracteres da frase: " + frase.length());
                case 2 -> {
                    System.out.println("Dois primeiros caracteres: " + frase.substring(0, 2));
                    System.out.println("Dois últimos caracteres: " + frase.substring(frase.length() - 2));
                }
                case 3 -> {
                    for (int i = frase.length() - 1; i >= 0; i--) {
                        System.out.print(frase.charAt(i));
                    }
                    System.out.println();
                }
                case 4 -> {
                    
                    System.out.println("Fim do algoritmo");
                    return;
                }
                default -> 
                    System.out.println("Opção inválida");
            }
        }
    }
}