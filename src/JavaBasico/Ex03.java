package JavaBasico;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args){
        double salarioBruto, adicionalNoturno, horasExtras, descontos, salarioLiquido;

        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o seu salário: ");
        salarioBruto = leia.nextDouble();

        System.out.println("Digite o adicional noturno: ");
        adicionalNoturno = leia.nextDouble();

        System.out.println("Digite suas horas extras: ");
        horasExtras = leia.nextDouble();

        System.out.println("Digite os descontos: ");
        descontos = leia.nextDouble();

        salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras * 5) - descontos;

        System.out.println("O valor do salário liquido é: "+salarioLiquido);



    }
}
