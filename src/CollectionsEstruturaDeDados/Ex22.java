package CollectionsEstruturaDeDados;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Ex22 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        Set<Integer> dados = new HashSet<Integer>();

        for (int x = 0; x < 10; x++) {
            System.out.println("\nDigite os dados que deseja: ");
            int num = ler.nextInt();
            dados.add(num);
        }

        System.out.println("\nLista de dados do Set: ");

        Iterator<Integer> listaDados = dados.iterator();

        while (listaDados.hasNext()){
            System.out.println("\n" + listaDados.next());
        }
    }
}
