package JavaBasico;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args){
        float n1, n2, n3, n4, media;

        Scanner leia = new Scanner(System.in);

        System.out.println("Digite a valor da Nota 1: ");
        n1 = leia.nextFloat();

        System.out.println("Digite a valor da Nota 2: ");
        n2 = leia.nextFloat();

        System.out.println("Digite a valor da Nota 3: ");
        n3 = leia.nextFloat();

        System.out.println("Digite a valor da Nota 4: ");
        n4 = leia.nextFloat();

        media = (n1 + n2 + n3 + n4)/4;

        System.out.printf("\nA média das suas notas é: %.1f", media);



    }
}
