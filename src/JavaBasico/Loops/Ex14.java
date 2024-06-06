package JavaBasico.Loops;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        int idade,contMenores=0,contMaiores=0;

        Scanner leia = new Scanner(System.in);

        System.out.println("\nDigite uma idade: ");
        idade = leia.nextInt();

        while(idade>=1){
            if (idade<=21){
                contMenores++;
            } else if (idade>=50) {
                contMaiores++;
            }
            System.out.println("\nDigite uma idade: ");
            idade = leia.nextInt();
        }
        System.out.println("\nTotal de pessoas menores de 21 anos: "+contMenores);
        System.out.println("\nTotal de pessoas maiores de 50 anos: "+contMaiores);
    }
}
