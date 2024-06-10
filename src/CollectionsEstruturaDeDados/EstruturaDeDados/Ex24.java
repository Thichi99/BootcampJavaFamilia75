package CollectionsEstruturaDeDados.EstruturaDeDados;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ex24 {
    public static void main(String[] args) {
        int op;

        Scanner ler = new Scanner(System.in);

        Queue<String> fila = new LinkedList<>();

        do { //Criação do Menu
            System.out.println("*****************************************************");
            System.out.println("\n\t\t1 - Adicionar Cliente na Fila");
            System.out.println("\n\t\t2 - Listar todos os Clientes");
            System.out.println("\n\t\t3 - Retirar Cliente da Fila");
            System.out.println("\n\t\t0 - Sair");
            System.out.println("*****************************************************");
            System.out.println("Entre com a opção desejada: ");

            op = ler.nextInt();
            //Configuração das Opções
            switch (op) {
                //Adicionar Cliente na Fila
                case 1:
                    ler.nextLine();
                    System.out.println("\nDigite o nome do Cliente para adicionar na Fila: ");
                    String cliente = ler.nextLine();
                    fila.add(cliente);
                    System.out.println("\nCliente adicionado na Fila.");
                    System.out.println(fila);
                    break;

                //Listar Clientes
                case 2:
                    if (fila.isEmpty()) {
                        System.out.println("\nA Fila está vazia!");
                    } else {
                        System.out.println(fila);
                    }
                    break;

                //Retirar Cliente da Fila
                case 3:
                    ler.nextLine();
                    System.out.println("\nDigite o nome do Cliente que deseja remover: ");
                    String clienteR = ler.nextLine();

                    if (fila.contains(clienteR)) {
                        fila.remove(clienteR);
                        System.out.println("\nO Cliente foi Chamado!");
                    } else {
                        System.out.println("\nCliente não encontrado.");
                    }
                    System.out.println(fila);
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
