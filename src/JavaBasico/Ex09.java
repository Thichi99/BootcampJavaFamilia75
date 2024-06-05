package JavaBasico;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args){
        int op,qntd;
        double valor,valorTotal;
        String nomeProduto;

        Scanner leia = new Scanner(System.in);

        System.out.printf("\n\t\tEscolha qual o produto que deseja: ");
        op = leia.nextInt();

        System.out.printf("\n\t\tEscolha qual a quantidade que deseja: ");
        qntd = leia.nextInt();

        switch (op){
            case 1:
                nomeProduto = "Cachorro Quente";
                valor = 10;
                valorTotal = valor * qntd;
                System.out.printf("\nProduto: %s\n Valor: %.2f",nomeProduto,valorTotal);
                break;
            case 2:
                nomeProduto = "X-Salada";
                valor = 15;
                valorTotal = valor * qntd;
                System.out.printf("\nProduto: %s\n Valor: %.2f",nomeProduto,valorTotal);
                break;
            case 3:
                nomeProduto = "X-Bacon";
                valor = 18;
                valorTotal = valor * qntd;
                System.out.printf("\nProduto: %s\n Valor: %.2f",nomeProduto,valorTotal);
                break;
            case 4:
                nomeProduto = "Bauru";
                valor = 12;
                valorTotal = valor * qntd;
                System.out.printf("\nProduto: %s\n Valor: %.2f",nomeProduto,valorTotal);
                break;
            case 5:
                nomeProduto = "Refrigerante";
                valor = 8;
                valorTotal = valor * qntd;
                System.out.printf("\nProduto: %s\n Valor: %.2f",nomeProduto,valorTotal);
                break;
            case 6:
                nomeProduto = "Suco de Laranja";
                valor = 13;
                valorTotal = valor * qntd;
                System.out.printf("\nProduto: %s\n Valor: %.2f",nomeProduto,valorTotal);
                break;
        }
    }
}
