package JavaBasico.Arrays;

import java.util.Scanner;

public class ExemploArrayMatriz {
    public static void main(String[] args) {
        int[][] valores = new int[2][2];
        int linha, coluna, somaValor = 0;
        float mediaValor;

        Scanner leia = new Scanner(System.in);

        for (linha = 0; linha < 2; linha++) {
            for (coluna = 0; coluna < 2; coluna++) {
                System.out.println("\nEntre com o valor da linha " + linha + " e coluna " + coluna + " :");
                valores[linha][coluna] = leia.nextInt();

                somaValor += valores[linha][coluna];
            }
        }

        mediaValor = (float) somaValor / 4;

        System.out.printf("\nMédia dos valores: %.2f",mediaValor);
    }
}
