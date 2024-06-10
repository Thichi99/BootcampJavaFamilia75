package CollectionsEstruturaDeDados;

import java.util.ArrayList;
import java.util.Scanner;

public class Colecao2 {
    public static void main(String[] args) {
        int op;
        Scanner ler = new Scanner(System.in);

        ArrayList<String> estoque = new ArrayList<String>();
        //Criação do Menu Estoque
        do {

            System.out.println("\n\t\tMenu de Opções do Estoque");
            System.out.println("\n(1) Deseja adicionar produtos ao estoque? ");
            System.out.println("\n(2) Deseja remover produtos do estoque? ");
            System.out.println("\n(3) Deseja atualizar produtos do estoque? ");
            System.out.println("\n(4) Deseja mostrar os produtos do estoque? ");
            System.out.println("\n(0) Encerrar o programa de estoque ");
            System.out.println("\nDigite a opção que deseja:  ");

            op = ler.nextInt();
            //Configuração das Opções do Estoque
            switch (op) {
                //Adicionar
                case 1:
                    ler.nextLine();
                    System.out.println("\nDigite o produto para adicionar ao estoque: ");
                    String produto = ler.nextLine();
                    estoque.add(produto);
                    System.out.println("Produto adicionado.");
                    System.out.println(estoque);
                    break;

                // Remover
                case 2:
                    ler.nextLine();
                    System.out.println("\nDigite o produto para remover do estoque: ");
                    String produtor = ler.nextLine();

                    if (estoque.contains(produtor)) {
                        estoque.remove(produtor);
                        System.out.println("\nProduto Removido.");
                    } else {
                        System.out.println("\nProduto não encontrado!");
                    }
                    System.out.println(estoque);
                    break;

                //Atualizar
                case 3:
                    ler.nextLine();
                    System.out.println("\nDigite o produto que quer atualizar: ");
                    String verifica = ler.nextLine();
                    System.out.println("\nDigite o nome do produto que entrará no lugar do produto " + verifica + " : ");
                    String novo = ler.nextLine();
                    if (estoque.contains(verifica)) {
                        estoque.remove(verifica);
                        estoque.add(novo);
                        System.out.println("\nProduto atualizado.");
                    } else {
                        System.out.println("\nProduto não encontrado!");
                    }
                    System.out.println(estoque);
                    break;

                //Visualizar
                case 4:
                    System.out.println("\nProdutos que estão no estoque: ");
                    System.out.println(estoque);
                    break;

                //Encerrar
                case 0:
                    System.out.println("\nObrigado por utilizar o nosso sistema. \nVolte sempre!");
                    break;

                default:
                    System.out.println("\nOpção Invalida!");
            }

        } while (op != 0);
    }
}
