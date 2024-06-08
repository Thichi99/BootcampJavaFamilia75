package JavaBasico.Arrays;

import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        float[][] notas = new float[10][4];
        float[] medias = new float[10];
//        float soma = 0;
        int linha, coluna;

        Scanner leia = new Scanner(System.in);

        for (linha = 0; linha < 10; linha++) {
            float soma = 0;
            for (coluna = 0; coluna < 4; coluna++) {
                System.out.println("Escreva a nota " + (coluna + 1) + " do Alune " + (linha + 1) + ": ");
                notas[linha][coluna] = leia.nextFloat();

                soma += notas[linha][coluna];
            }
            medias[linha] = soma / 4;
        }

        System.out.println("Média dos Alunes: ");

        for (linha = 0; linha < 10; linha++) {
            System.out.printf("Média do Alune %d foi de: %.1f\n", (linha + 1), medias[linha]);
        }
    }
}
