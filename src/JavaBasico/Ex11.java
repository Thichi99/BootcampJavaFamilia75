package JavaBasico;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args){
        int codigo;
        float numero1,numero2;

        Scanner leia = new Scanner(System.in);

        System.out.println("\nDigite um número: ");
        numero1 = leia.nextFloat();

        System.out.println("\nDigite outro número: ");
        numero2 = leia.nextFloat();

        System.out.println("\nDigite o Código da Operação: ");
        codigo = leia.nextInt();

        switch (codigo){
            case 1:
                float soma = numero1 + numero2;
                System.out.printf("O resultado da Soma é: %.0f",soma);
                break;
            case 2:
                float subtracao = numero1 - numero2;
                System.out.printf("O resultado da Subtração é: %.0f",subtracao);
                break;
            case 3:
                float multiplicacao = numero1 * numero2;
                System.out.printf("O resultado da Multiplicação é: %.0f",multiplicacao);
                break;
            case 4:
                float divisao = numero1 / numero2;
                System.out.printf("O resultado da Divisão é: %.0f",divisao);
                break;
            default:
                System.out.println("Digite uma opção válida.");
                break;
        }
    }
}
