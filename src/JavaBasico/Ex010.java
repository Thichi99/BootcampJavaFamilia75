package JavaBasico;

import java.util.Scanner;

public class Ex010 {
    public static void main(String[] args){
        String colaborador,cargo = "";
        int codigo;
        float salario,novoSalario = 0;


        Scanner leia = new Scanner(System.in);

        System.out.println("\nDigite o nome do Colaborador: ");
        colaborador = leia.nextLine();

        System.out.println("\nDigite o Código do Cargo: ");
        codigo = leia.nextInt();

        System.out.println("\nDigite o valor do Salário: ");
        salario = leia.nextFloat();

        switch(codigo){
            case 1:
                cargo = "Gerente";
                novoSalario = salario + ( 0.10f * salario);
                break;
            case 2:
                cargo = "Vendedor";
                novoSalario = salario + (0.07f * salario);
                break;
            case 3:
                cargo = "Supervisor";
                novoSalario = salario + (0.09f * salario);
                break;
            case 4:
                cargo = "Motorista";
                novoSalario = salario + (0.06f * salario);
                break;
            case 5:
                cargo = "Estoquista";
                novoSalario = salario + (0.05f * salario);
                break;
            case 6:
                cargo = "Técnico de TI";
                novoSalario = salario + (0.08f * salario);
                break;
            default:
                System.out.println("\nCódigo de cargo inválido. Tente novamente.");
                break;
        }

        System.out.printf("Nome do Colaborador: %s",colaborador);
        System.out.printf("Cargo: %s",cargo);
        System.out.printf("Novo Salário: %.2f",novoSalario);
    }
}
