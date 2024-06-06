package JavaBasico.Loops;

import java.util.Scanner;

public class ExemploFor {
    public static void main(String[] args){
        float n1,n2,n3,media,somaMedia=0,mg,maiorMedia=0;
        int x;

        Scanner leia = new Scanner(System.in);

        for (x=1; x<=4;x++){  // x++ é igual a x = x + 1
            System.out.println("\nEntre com a primeira nota: ");
            n1 = leia.nextFloat();
            System.out.println("\nEntre com a segunda nota: ");
            n2 = leia.nextFloat();
            System.out.println("\nEntre com a terceira nota: ");
            n3 = leia.nextFloat();

            media = (n1 + n2 + n3)/3;
            System.out.printf("\nSua média foi de %.2f",media);

            somaMedia += media; // somaMedia = somaMedia + media

            if(maiorMedia < media){
                maiorMedia = media;
            }
        }

        mg = somaMedia / (x-1);
        System.out.printf("\nMédia geral foi de: %.2f",mg);
        System.out.println("\nMaior média foi de: "+maiorMedia);

    }
}
