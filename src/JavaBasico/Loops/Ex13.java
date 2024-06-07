package JavaBasico.Loops;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        int x, num, contPar = 0, contImpar = 0;

        Scanner leia = new Scanner(System.in);

        System.out.println("\nDigite o 1 número: ");
        num = leia.nextInt();

        for (x = 1; x <= 10; x++) {
            if (num % 2 == 0) {
                contPar++;
            } else {
                contImpar++;
            }
            System.out.printf("Escreva o %d número: ", x + 1);
            num = leia.nextInt();
        }
        System.out.println("\nContagem de números Pares: " + contPar);
        System.out.println("\nContagem de números Impares: " + contImpar);
    }
}
