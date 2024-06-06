package JavaBasico.Loops;

import java.util.Scanner;

public class ExemploDoWhile {
    public static void main(String[] args) {
        int x = 1, tab, res;

        Scanner leia = new Scanner(System.in);

        System.out.println("\nQual a tabuada que deseja visualizar? ");
        tab = leia.nextInt();

        do {

            res = tab * x;
            System.out.println("\n" + tab + " X " + x + " = " + res);
            x++;

        } while (x <= 10);
    }
}
