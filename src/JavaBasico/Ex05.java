package JavaBasico;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args){
        int a, b, c, soma;

        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o numero A: ");
        a = leia.nextInt();

        System.out.println("Digite o numero B: ");
        b = leia.nextInt();

        System.out.println("Digite o numero C: ");
        c = leia.nextInt();

        soma = a + b;

        if(soma>c) {
            System.out.println("A soma é maior que o número C.");
        } else if (soma<c) {
            System.out.println("A soma é menor que o número C.");
        } else {
            System.out.println("A soma é igual ao número C.");
        }
    }
}
