package JavaBasico;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        float salario, abono;

        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o Salário: ");
        salario = leia.nextFloat();

        System.out.println("Digite o Abono: ");
        abono = leia.nextFloat();

        salario += abono;

        System.out.printf("Seu novo salário é: %.2f", salario);
    }
}
