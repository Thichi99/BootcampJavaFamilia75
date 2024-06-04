package JavaBasico;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args){
        float n1, n2, n3, n4, diferenca;

        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o número1: ");
        n1 = leia.nextFloat();

        System.out.println("Digite o número2: ");
        n2 = leia.nextFloat();

        System.out.println("Digite o número3: ");
        n3 = leia.nextFloat();

        System.out.println("Digite o número4: ");
        n4 = leia.nextFloat();

        diferenca = (n1 * n2) - (n3 * n4);

        System.out.println("A diferença é:"+diferenca);


    }
}
