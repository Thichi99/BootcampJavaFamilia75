package CollectionsEstruturaDeDados;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex21 {
    public static void main(String[] args) {
        ;
        int num;
        Scanner ler = new Scanner(System.in);

        ArrayList<Integer> listaNum = new ArrayList<Integer>();

        for (int x = 0; x < 10; x++) {
            System.out.printf("Digite o %d° número: \n", x + 1);
            num = ler.nextInt();
            listaNum.add(num);
        }

        System.out.println("\nDigite o número que deseja encontrar: ");
        num = ler.nextInt();

        if (listaNum.contains(num)) {
            System.out.println("\nO número " + num + " está na posição: " + listaNum.indexOf(num));
        } else {
            System.out.println("\nO número " + num + " não foi encontrado!");
        }

    }
}
