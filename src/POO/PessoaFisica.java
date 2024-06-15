package POO;

public class PessoaFisica extends Cliente {

    private String cpf;

    public PessoaFisica(String nomeCliente, String endereco, String nacionalidade, int idade, int codigoCliente, String cpf) {
        super(nomeCliente, endereco, nacionalidade, idade, codigoCliente);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public void visualizar() {
        System.out.println("Nome do Cliente: " + getNomeCliente() + "\nCPF do Cliente: " + getCpf() + "\nCódigo do Cliente: " + getCodigoCliente() + "\nEndereço: "
                + getEndereco() + "\nNacionalidade: " + getNacionalidade() + "\nIdade: " + getIdade());
    }

}
