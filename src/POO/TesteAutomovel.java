package POO;

public class TesteAutomovel {
    public static void main(String[] args) {

        //instanciando um objeto da classe Automovel
        Automovel carro = new Automovel("Yanca Paula", "HB20", "STJ4032", 2024);

        //troca de mensagens com a minha classe Automovel
        carro.imprimirInfo();

        System.out.println("\n***********Transferência de Proprietária***********");

        carro.setNomeProprietario("Daniele Valonga");

        carro.imprimirInfo();

        carro.setPlaca("SSZ7J10");

        carro.imprimirInfo();
    }
}
