package CollectionsEstruturaDeDados.EstruturaDeDados;

import java.util.Scanner;
import java.util.Stack;

public class Ex25 {
    public static void main(String[] args) {
        int op;

        Scanner ler = new Scanner(System.in);

        Stack<String> pilha = new Stack<>();

        do { //Criação do Menu
            System.out.println("*****************************************************");
            System.out.println("\n\t\t1 - Adicionar Livro na Pilha");
            System.out.println("\n\t\t2 - Listar todos os Livros");
            System.out.println("\n\t\t3 - Retirar Livro da Pilha");
            System.out.println("\n\t\t0 - Sair");
            System.out.println("\n*****************************************************\n");
            System.out.println("Entre com a opção desejada: ");

            op = ler.nextInt();
            //Configuração das Opções
            switch (op) {
                //Adicionar Livro na Pilha
                case 1:
                    ler.nextLine();
                    System.out.println("\nDigite o nome do Livro para adicionar na Pilha: ");
                    String livro = ler.nextLine();
                    pilha.push(livro);
                    System.out.println("\nLivro adicionado na Pilha.");
                    System.out.println("\n" + pilha);
                    break;

                //Listar Livros
                case 2:
                    if (pilha.isEmpty()) {
                        System.out.println("\nA Pilha está vazia!");
                    } else {
                        System.out.println("\n" + pilha);
                    }
                    break;

                //Retirar Livro da Pilha
                case 3:
                    ler.nextLine();

                    if (pilha.isEmpty()) {
                        System.out.println("\nA pilha está vazia.");
                    } else {
                        System.out.println("\nPilha: ");
                        pilha.pop();
                        System.out.println("\nUm Livro foi retirado da pilha!");
                        System.out.println("\n" + pilha);
                    }
                    break;

                //Sair do Programa
                case 0:
                    System.out.println("\nObrigado por utilizar o nosso sistema.");
                    break;

                default:
                    System.out.println("\nOpção Inválida.");
            }

        } while (op != 0);
    }
}
