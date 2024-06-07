package JavaBasico.Loops;

import java.util.Scanner;

public class ExWhile03 {
    public static void main(String[] args) {
        int codigo, somaAlcool = 0, somaGasolina = 0, somaDiesel = 0;

        Scanner leia = new Scanner(System.in);

        System.out.println("Escreva o código do produto: " +
                "\n1. Álcool" +
                "\n2. Gasolina" +
                "\n3. Diesel" +
                "\n4. Encerrar");
        codigo = leia.nextInt();

        while (codigo != 4) {
            if (codigo == 1) {
                somaAlcool++;
            } else if (codigo == 2) {
                somaGasolina++;
            } else if (codigo == 3) {
                somaDiesel++;
            } else {
                System.out.println("Digite um código válido.");
            }

            System.out.println("Escreva outro código do produto: " +
                    "\n1. Álcool" +
                    "\n2. Gasolina" +
                    "\n3. Diesel" +
                    "\n4. Encerrar");
            codigo = leia.nextInt();
        }

        System.out.println("MUITO OBRIGADO!");
        System.out.printf("\nÁlcool: %d", somaAlcool);
        System.out.printf("\nGasolina: %d", somaGasolina);
        System.out.printf("\nDiesel: %d", somaDiesel);
    }
}
