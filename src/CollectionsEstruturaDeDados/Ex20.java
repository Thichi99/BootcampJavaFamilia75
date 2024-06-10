package CollectionsEstruturaDeDados;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        ArrayList<String> cores = new ArrayList<String>();

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite as cores que deseja: ");
            String coresL = ler.nextLine();
            cores.add(coresL);
        }

        System.out.println("Lista de cores adicionadas: \n" + cores);
        cores.sort(null);
        System.out.println("\nLista de cores ordenadas: \n" + cores);
    }
}
