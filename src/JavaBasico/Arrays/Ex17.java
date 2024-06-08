package JavaBasico.Arrays;

import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        int[] vet = new int[10];
        int x, soma = 0;
        float media = 0;

        Scanner leia = new Scanner(System.in);

        for (x = 0; x < 10; x++) {
            System.out.println("Escreva um número: ");
            vet[x] = leia.nextInt();

            soma += vet[x];
        }

        media = (float) soma / x ;

        System.out.println("Elementos nos indices impares: ");

        for (x = 1; x < 10; x += 2) {
            System.out.print(vet[x] + " ");
        }

        System.out.println("\nSoma: "+soma);
        System.out.printf("Média: %.2f",media);

    }
}
