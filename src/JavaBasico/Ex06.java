package JavaBasico;

import java.util.Scanner;

/*

 */

public class Ex06 {
    public static void main(String[] args){
        int numero;

        Scanner leia = new Scanner(System.in);

        System.out.println("Digite um número: ");
        numero = leia.nextInt();

        if(numero%2 == 0){
            if(numero>=0){
                System.out.printf("O %d é par e positivo.",numero);
            } else {
                System.out.printf("O %d é par e negativo.",numero);
            }
        } else {
            if(numero>=0){
                System.out.printf("O %d é ímpar e positivo.",numero);
            } else {
                System.out.printf("O %d é ímpar e negativo.",numero);
            }
        }
    }
}
