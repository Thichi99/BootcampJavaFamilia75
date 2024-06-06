package JavaBasico.Loops;

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        int num, somaNum=0,x=0;
        float media;

        Scanner leia = new Scanner(System.in);

        System.out.println("\nDigite um número: ");
        num = leia.nextInt();

        do {
            if (num % 3 == 0){
                somaNum += num;
                x++;
            }
            System.out.println("\nDigite um número: ");
            num = leia.nextInt();

        } while (num != 0);

        media = (float) somaNum / x;

        System.out.printf("A média de todos os números digitados que sejam múltiplos de 3 é: %.1f",media);
    }
}
