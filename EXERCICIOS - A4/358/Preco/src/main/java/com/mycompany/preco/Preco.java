
package com.mycompany.preco;

import java.util.Scanner;

public class Preco {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] precoCompra = new double[100];
        
        double[] precoVenda = new double[100];
        
        int[] faixaLucro = new int[3];

        faixaLucro[0] = 0;
        faixaLucro[1] = 0;
        faixaLucro[2] = 0;

        for (int i = 0; i < 100; i++) {
            System.out.println("Preço de compra do produto: "+i);
            precoCompra[i] = scanner.nextDouble();
        }

        for (int i = 0; i < 100; i++) {
            System.out.println("Preço de venda do produto "+i);
            precoVenda[i] = scanner.nextDouble();
        }

        for (int i = 0; i < 100; i++) {
            double lucro = precoVenda[i] - precoCompra[i];

            if (lucro < 0.1) {
                faixaLucro[0]++;
            } else if (lucro <= 0.2) {
                faixaLucro[1]++;
            } else {
                faixaLucro[2]++;
            }
        }

        System.out.println("\nTotal de mercadorias com lucro < 10%: " + faixaLucro[0]);
        System.out.println("\nTotal de mercadorias com 10% <= lucro <= 20%: " + faixaLucro[1]);
        System.out.println("\nTotal de mercadorias com lucro > 20%: " + faixaLucro[2]);
    }
}

