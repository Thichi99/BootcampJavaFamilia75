package POO;

import java.util.Scanner;

public class TesteCliente {
    public static void main(String[] args) {
        String nome = "", endereco = "", nacionalidade = "", cpf = "", cnpj = "";
        int idade = 0, codigo = 0;

        Scanner ler = new Scanner(System.in);

        Cliente c1 = new Cliente(nome, endereco, nacionalidade, idade, codigo);

        Cliente c2 = new Cliente(nome, endereco, nacionalidade, idade, codigo);

        PessoaFisica pf1 = new PessoaFisica(nome, endereco, nacionalidade, idade, codigo, cpf);

        PessoaFisica pf2 = new PessoaFisica(nome, endereco, nacionalidade, idade, codigo, cpf);

        PessoaJuridica pj1 = new PessoaJuridica(nome, endereco, nacionalidade, idade, codigo, cnpj);

        PessoaJuridica pj2 = new PessoaJuridica(nome, endereco, nacionalidade, idade, codigo, cnpj);

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

        System.out.println("Digite o nome do Cliente: ");
        nome = ler.nextLine();
        pf1.setNomeCliente(nome);

        System.out.println("Digite o CPF do Cliente: ");
        cpf = ler.nextLine();
        pf1.setCpf(cpf);

        ler.nextLine();

        System.out.println("Digite o Código do Cliente: ");
        codigo = ler.nextInt();
        pf1.setCodigoCliente(codigo);

        ler.nextLine();

        System.out.println("Digite o endereço do Cliente: ");
        endereco = ler.nextLine();
        pf1.setEndereco(endereco);

        System.out.println("Digite a Nacionalidade do Cliente: ");
        nacionalidade = ler.nextLine();
        pf1.setNacionalidade(nacionalidade);

        ler.nextLine();

        System.out.println("Digite a Idade do Cliente: ");
        idade = ler.nextInt();
        pf1.setIdade(idade);

        ler.nextLine();

        pf1.visualizar();

        System.out.println("Digite o nome do Cliente: ");
        nome = ler.nextLine();
        pf2.setNomeCliente(nome);

        System.out.println("Digite o CPF do Cliente: ");
        cpf = ler.nextLine();
        pf2.setCpf(cpf);

        ler.nextLine();

        System.out.println("Digite o Código do Cliente: ");
        codigo = ler.nextInt();
        pf2.setCodigoCliente(codigo);

        ler.nextLine();

        System.out.println("Digite o endereço do Cliente: ");
        endereco = ler.nextLine();
        pf2.setEndereco(endereco);

        System.out.println("Digite a Nacionalidade do Cliente: ");
        nacionalidade = ler.nextLine();
        pf2.setNacionalidade(nacionalidade);

        ler.nextLine();

        System.out.println("Digite a Idade do Cliente: ");
        idade = ler.nextInt();
        pf2.setIdade(idade);

        ler.nextLine();

        pf2.visualizar();

        System.out.println("Digite o nome do Cliente: ");
        nome = ler.nextLine();
        pj1.setNomeCliente(nome);

        System.out.println("Digite o CNPJ do Cliente: ");
        cnpj = ler.nextLine();
        pj1.setCnpj(cnpj);

        ler.nextLine();

        System.out.println("Digite o Código do Cliente: ");
        codigo = ler.nextInt();
        pj1.setCodigoCliente(codigo);

        ler.nextLine();

        System.out.println("Digite o endereço do Cliente: ");
        endereco = ler.nextLine();
        pj1.setEndereco(endereco);

        System.out.println("Digite a Nacionalidade do Cliente: ");
        nacionalidade = ler.nextLine();
        pj1.setNacionalidade(nacionalidade);

        ler.nextLine();

        System.out.println("Digite a Idade do Cliente: ");
        idade = ler.nextInt();
        pj1.setIdade(idade);

        ler.nextLine();

        pj1.visualizar();

        System.out.println("Digite o nome do Cliente: ");
        nome = ler.nextLine();
        pj2.setNomeCliente(nome);

        System.out.println("Digite o CNPJ do Cliente: ");
        cnpj = ler.nextLine();
        pj2.setCnpj(cnpj);

        ler.nextLine();

        System.out.println("Digite o Código do Cliente: ");
        codigo = ler.nextInt();
        pj2.setCodigoCliente(codigo);

        ler.nextLine();

        System.out.println("Digite o endereço do Cliente: ");
        endereco = ler.nextLine();
        pj2.setEndereco(endereco);

        System.out.println("Digite a Nacionalidade do Cliente: ");
        nacionalidade = ler.nextLine();
        pj2.setNacionalidade(nacionalidade);

        ler.nextLine();

        System.out.println("Digite a Idade do Cliente: ");
        idade = ler.nextInt();
        pj2.setIdade(idade);

        ler.nextLine();

        pj2.visualizar();

    }
}
