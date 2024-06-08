package JavaBasico.Arrays;

import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        int linha, coluna, soma1 = 0, soma2 = 0;

        Scanner leia = new Scanner(System.in);

        for (linha = 0; linha < 3; linha++) {
            for (coluna = 0; coluna < 3; coluna++) {
                System.out.println("Entre com o valor da linha " + linha + " e coluna " + coluna + ": \n");
                matriz[linha][coluna] = leia.nextInt();
            }
        }

        System.out.println("Elementos na diagonal Principal: ");

        for (linha = 0; linha < 3; linha++) {
            System.out.print(matriz[linha][linha] + " ");

            soma1 += matriz[linha][linha];
        }

        System.out.println("\nElementos na diagonal Secundária: ");

        for (linha = 0; linha < 3; linha++) {
            System.out.print(matriz[linha][2 - linha] + " ");

            soma2 += matriz[linha][2 - linha];
        }

        System.out.println("\nSoma dos Elementos da Diagonal Principal: " + soma1);
        System.out.println("Soma dos Elementos da Diagonal Secundária: " + soma2);
    }
}
