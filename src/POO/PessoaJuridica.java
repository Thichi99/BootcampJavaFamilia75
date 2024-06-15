package POO;

public class PessoaJuridica extends Cliente {

    private String cnpj;

    public PessoaJuridica(String nomeCliente, String endereco, String nacionalidade, int idade, int codigoCliente, String cnpj) {
        super(nomeCliente, endereco, nacionalidade, idade, codigoCliente);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public void visualizar() {
        System.out.println("Nome do Cliente: " + getNomeCliente() + "\nCNPJ do Cliente: " + getCnpj() + "\nCódigo do Cliente: " + getCodigoCliente() + "\nEndereço: "
                + getEndereco() + "\nNacionalidade: " + getNacionalidade() + "\nIdade: " + getIdade());
    }

}
