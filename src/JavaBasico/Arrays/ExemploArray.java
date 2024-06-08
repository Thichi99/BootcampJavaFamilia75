package JavaBasico.Arrays;

import java.util.Scanner;

public class ExemploArray {
    public static void main(String[] args) {
        float[] media = new float[4];
        float n1, n2, n3, somaMedia = 0, mg;
        int x;

        Scanner leia = new Scanner(System.in);

        for (x = 0; x < 4; x++) {
            System.out.println("\nEntre com a primeira nota: ");
            n1 = leia.nextFloat();
            System.out.println("\nEntre com a segunda nota: ");
            n2 = leia.nextFloat();
            System.out.println("\nEntre com a terceira nota: ");
            n3 = leia.nextFloat();

            media[x] = (n1 + n2 + n3) / 3;

            System.out.printf("\nSua média foi: %.1f", media[x]);

            somaMedia += media[x];
        }

        mg = somaMedia / x;

        System.out.printf("\n\t\t\tMédia geral: %.1f", mg);

        for (x = 0; x < 4; x++) {
            System.out.printf("\n\t\t\tMédia do participante %d foi de : %.1f", x + 1, media[x]);
        }
    }
}
