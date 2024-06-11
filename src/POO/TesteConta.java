package POO;

public class TesteConta {
    public static void main(String[] args) {

        //Instância da classe Conta
        Conta conta = new Conta();

        //Definir um valor de saldo
        conta.setSaldo(723.00);

        //Definir um valor para depositar
        conta.depositar(999.00);

        //Resgatar o valor
        conta.verificaSaldo();
    }
}
