package JavaBasico;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args){
        String nome;
        int idade;
        boolean primeiraDoacao,apto = false;

        Scanner leia = new Scanner(System.in);

        System.out.println("\nDigite o Nome do doador: ");
        nome = leia.nextLine();

        System.out.println("\nDigite a Idade do doador: ");
        idade = leia.nextInt();

        System.out.println("\nPrimeira doação de sangue? ");
        primeiraDoacao = leia.nextBoolean();

        if (idade>=18 && idade <=69){
            if (idade>=60){
                if(primeiraDoacao==false){
                    apto = true;
                }
            } else {
                apto = true;
            }
        }

        if (apto){
            System.out.println(nome + " está apto para doar sangue.");
        } else {
            System.out.println(nome + " não está apto para doar sangue.");
        }
    }
}
