package JavaBasico.Loops;

import java.util.Scanner;

public class ExWhile01 {
    public static void main(String[] args) {
        int senha = 0;

        Scanner leia = new Scanner(System.in);

        while (senha != 2002) {
            System.out.println("Digite sua senha: ");
            senha = leia.nextInt();

            if (senha == 2002) {

                System.out.println("Acesso Permitido");

            } else {

                System.out.println("Senha Invalida");

            }
        }
    }
}
