package CollectionsEstruturaDeDados;

import java.util.*;

public class Colecao1 {
    public static void main(String[] args) {

        //List e ArrayList são ligados

        List<Integer> minhaLista = new ArrayList<Integer>(); //Criação da Lista

        //Adicionando elementos dentro da lista
        minhaLista.add(3);
        minhaLista.add(2);
        minhaLista.add(1);
        minhaLista.add(6);
        minhaLista.add(3);
        minhaLista.add(2);

        //Saida de Dados na Tela
        for (Integer listaElementos : minhaLista) {  //For each
            System.out.println(listaElementos);
        }

        //Removendo o primeiro índice do ArrayList
        System.out.println();
        minhaLista.remove(0);

        //Nova Saida de Dados
        for (Integer listaElementos : minhaLista) {  //For each
            System.out.println(listaElementos);
        }

        System.out.println();

        //Atribuindo um elemento do ArrayList a uma variável
        int primeiroElemento = minhaLista.get(0);
        System.out.println("\nO primeiro elemento da coleção é: " + primeiroElemento);

        System.out.println();

        //Criação de um laço de repetição com uma variável local
        for (int i = 0; i < minhaLista.size(); i++) {
            System.out.println("\nElemento: " + minhaLista.get(i));
        }

        Collections.sort(minhaLista);
        System.out.println("\nLista depois de ordenada...\n" + minhaLista);

        System.out.println();

        Set<Integer> meuSet = new HashSet<Integer>();

        meuSet.add(3);
        meuSet.add(2);
        meuSet.add(3);
        meuSet.add(5);
        meuSet.add(1);
        meuSet.add(0);

        meuSet.addAll(minhaLista);
    }
}
