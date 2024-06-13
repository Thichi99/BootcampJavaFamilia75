package POO;

import java.util.Scanner;

public class TesteCliente {
    public static void main(String[] args) {
        String nome = "", endereco = "", nacionalidade = "";
        int idade = 0, codigo = 0;

        Scanner ler = new Scanner(System.in);

        Cliente c1 = new Cliente(nome, endereco, nacionalidade, idade, codigo);

        Cliente c2 = new Cliente(nome, endereco, nacionalidade, idade, codigo);

        System.out.println("Digite o nome do Cliente: ");
        nome = ler.nextLine();
        c1.setNomeCliente(nome);

        ler.nextLine();

        System.out.println("Digite o Código do Cliente: ");
        codigo = ler.nextInt();
        c1.setCodigoCliente(codigo);

        ler.nextLine();

        System.out.println("Digite o endereço do Cliente: ");
        endereco = ler.nextLine();
        c1.setEndereco(endereco);

        System.out.println("Digite a Nacionalidade do Cliente: ");
        nacionalidade = ler.nextLine();
        c1.setNacionalidade(nacionalidade);

        ler.nextLine();

        System.out.println("Digite a Idade do Cliente: ");
        idade = ler.nextInt();
        c1.setIdade(idade);

        ler.nextLine();

        c1.visualizar();

        System.out.println("Digite o nome do Cliente: ");
        nome = ler.nextLine();
        c2.setNomeCliente(nome);

        System.out.println("Digite o Código do Cliente: ");
        codigo = ler.nextInt();
        c2.setCodigoCliente(codigo);

        ler.nextLine();

        System.out.println("Digite o endereço do Cliente: ");
        endereco = ler.nextLine();
        c2.setEndereco(endereco);

        System.out.println("Digite a Nacionalidade do Cliente: ");
        nacionalidade = ler.nextLine();
        c2.setNacionalidade(nacionalidade);

        ler.nextLine();

        System.out.println("Digite a Idade do Cliente: ");
        idade = ler.nextInt();
        c2.setIdade(idade);

        ler.nextLine();

        c2.visualizar();

    }
}
