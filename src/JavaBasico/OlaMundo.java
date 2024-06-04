package JavaBasico;

import java.util.Scanner;

public class OlaMundo {

    public static void main(String[] args) {

        String nome = "Luana Sousa";
//        char resp = 'S';
        int idade = 29;
        float altura = 1.7F, nota1, nota2, nota3, media;

        Scanner leia = new Scanner(System.in);

        System.out.println("Seu nome é: "+nome);
        System.out.println("Você viveu: "+idade+" anos de vida");
        System.out.println("Sua altura é: "+altura);

        System.out.println("Entre com a primeira nota: ");
        nota1 = leia.nextFloat();

        System.out.println("Entre com a segunda nota: ");
        nota2 = leia.nextFloat();

        System.out.println("Entre com a terceira nota: ");
        nota3 = leia.nextFloat();

        media = (nota1 + nota2 + nota3) /3;

        System.out.printf("A média das suas notas são: %.2f",media);


    }

}
