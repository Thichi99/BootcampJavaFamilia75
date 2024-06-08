package JavaBasico.Arrays;

import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        int[] vet = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
        int x, posicao = 0;

        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o número que você deseja encontrar: ");
        int num = leia.nextInt();

        for (x = 0; x < 10; x++) {
            if (num == vet[x]) {
                posicao = vet[x];
            }
        }

        if (posicao != 0) {
            System.out.printf("O número %d está localizado na posição: %d", num, (posicao - 1));
        } else {
            System.out.println("O número " + num + " não foi encontrado!");
        }
    }
}
