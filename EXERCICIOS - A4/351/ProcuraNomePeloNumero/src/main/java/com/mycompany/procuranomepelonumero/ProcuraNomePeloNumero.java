/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.procuranomepelonumero;

/**
 *
 * @author Administrator
 */
import java.util.Scanner;

public class ProcuraNomePeloNumero {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declara um vetor de nomes com 5 posições
        String[] nomes = new String[5];

        // Lê os 5 nomes do usuário
        for (int i = 0; i < 5; i++) {
            System.out.println("Nome " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();
        }

        // Lê o número da pessoa desejada
        System.out.println("Digite o número da pessoa: ");
        int numero = scanner.nextInt();

        // Verifica se o número está no intervalo de 1 a 5
        while (numero < 1 || numero > 5) {
            System.out.println("Número fora do intervalo");
            System.out.println("Digite o número da pessoa: ");
            numero = scanner.nextInt();
        }

        // Imprime o nome da pessoa correspondente ao número
        System.out.println(nomes[numero - 1]);
    }
}

