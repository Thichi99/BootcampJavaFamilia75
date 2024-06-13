package POO;

public class Cliente {
    private String nomeCliente, endereco, nacionalidade;
    private int idade, codigoCliente;

    public Cliente(String nomeCliente, String endereco, String nacionalidade, int idade, int codigoCliente) {
        this.nomeCliente = nomeCliente;
        this.endereco = endereco;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.codigoCliente = codigoCliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public void visualizar() {
        System.out.println("Nome do Cliente: " + nomeCliente + "\nCódigo do Cliente: " + codigoCliente + "\nEndereço: "
                + endereco + "\nNacionalidade: " + nacionalidade + "\nIdade: " + idade);
    }
}
