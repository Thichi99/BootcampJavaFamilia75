package JavaBasico.Loops;

import java.util.Scanner;

public class ExWhile02 {
    public static void main(String[] args) {
        int x, y;

        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        x = leia.nextInt();

        System.out.println("Digite o segundo número: ");
        y = leia.nextInt();

        while (x != 0 && y != 0) {
            if (x >= 1) {
                if (y >= 1) {
                    System.out.println("Primeiro Quadrante");
                } else {
                    System.out.println("Quarto Quadrante");
                }
            } else {
                if (y >= 1) {
                    System.out.println("Segundo Quadrante");
                } else {
                    System.out.println("Terceiro Quadrante");
                }
            }
            System.out.println("Digite o primeiro número: ");
            x = leia.nextInt();

            System.out.println("Digite o segundo número: ");
            y = leia.nextInt();
        }
    }
}
