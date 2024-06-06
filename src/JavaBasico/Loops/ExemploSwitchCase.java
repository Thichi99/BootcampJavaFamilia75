package JavaBasico.Loops;

import java.util.Scanner;

public class ExemploSwitchCase {
    public static void main(String[]args) {
        int op;

        Scanner leia = new Scanner(System.in);

        System.out.println("\n\t\tMenu de elogios:");
        System.out.println("\n1- Empáticos");
        System.out.println("\n2 - Incríveis");
        System.out.println("\n3 - Galera Bonita");
        System.out.println("\n4 - São FOFOS");
        op = leia.nextInt();

        switch(op){
            case 1:
                System.out.println("\n1- Empáticos");
                break;
            case 2:
                System.out.println("\n2- Incríveis");
                break;
            case 3:
                System.out.println("\n3- Galera Bonita");
                break;
            case 4:
                System.out.println("\n1- São FOFOS");
                break;
            default:
                System.out.println("\nOpção Inválida!!!");
        }
    }
}
