package JavaBasico.Loops;

import java.util.Scanner;

public class ExemploWhile {
    public static void main(String[] args) {
        int num, contImpar = 0, somaPar = 0;

        Scanner leia = new Scanner(System.in);

        System.out.println("\nEntre com um número inteiro: ");
        num = leia.nextInt();

        while (num != 0){
            if (num % 2 == 0){
                somaPar += num;
            } else {
                contImpar++;
            }
            System.out.println("\nEntre com um número inteiro: ");
            num = leia.nextInt();
        }
        System.out.println("\nSomatório de números pares: "+somaPar);
        System.out.println("\nQuantidade de número impares: "+contImpar);
    }
}
