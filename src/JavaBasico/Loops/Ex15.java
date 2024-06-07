package JavaBasico.Loops;

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        int num, somaNum = 0, x = 0;
        float media;

        Scanner leia = new Scanner(System.in);

        do {
            System.out.println("\nDigite um número: ");
            num = leia.nextInt();

            if (num == 0) {
                System.out.println("\nVocê digitou ZERO, vamos finalizar o programa!");
            } else {
                if (num % 3 == 0) {
                    somaNum += num;
                    x++;
                }
            }
        } while (num != 0);

        if (x == 0) {
            System.out.println("\nNão foi possível achar a média...");
        } else {
            media = (float) somaNum / x;

            System.out.printf("A média de todos os números digitados que sejam múltiplos de 3 é: %.1f", media);
        }
    }
}
