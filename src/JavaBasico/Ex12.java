package JavaBasico;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        int opcao;
        float saldo = 1000;

        Scanner leia = new Scanner(System.in);

        System.out.println("\nDigite o código da Operação que deseja: ");
        opcao = leia.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("\n\t\tOperação - Saldo");
                System.out.println("\n\t\tSaldo: " + saldo);
                break;
            case 2:
                System.out.println("\nDigite o valor que deseja sacar: ");
                float saque = leia.nextFloat();
                if (saque > saldo) {
                    System.out.println("\n\t\tOperação - Saque");
                    System.out.println("\n\t\tSaldo Insuficiente!");
                } else {
                    float novoSaldo = (float) (saldo - saque);
                    System.out.println("\n\t\tOperação - Saque");
                    System.out.printf("\n\t\tNovo Saldo: %.2f", novoSaldo);
                }
                break;
            case 3:
                System.out.println("\nDigite o valor que deseja depositar: ");
                float deposito = leia.nextFloat();
                saldo += deposito;
                System.out.println("\n\t\tOperação - Depósito");
                System.out.printf("\n\t\tNovo Saldo: %.2f", saldo);
                break;
            default:
                System.out.println("\n\t\tOperação Inválida!");
                break;
        }
    }
}
