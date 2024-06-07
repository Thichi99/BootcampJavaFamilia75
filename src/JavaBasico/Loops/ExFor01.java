package JavaBasico.Loops;

import java.util.Scanner;

public class ExFor01 {
    public static void main(String[] args) {
        int numero, x, numeroImpar=0;

        Scanner leia = new Scanner(System.in);

        System.out.println("Digite um número: ");
        numero = leia.nextInt();

        for (x = 0; x <= numero; x++) {
            if (x % 2 != 0) {
                System.out.println(x);
            }
        }
    }
}
