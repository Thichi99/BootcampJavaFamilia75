package POO;

public class Celular extends Telefone {

    public Celular() {
        super("Telefone Celular");
    }

    public void toca(int codigoToque) {
        switch (codigoToque) {
            case 1:
                System.out.println("\nTirilim tirilim");
                break;
            case 2:
                System.out.println("\nQuando surge o alviverde imponente...");
                break;
            default:
                System.out.println("\nTararararammmm Tararararammmm ");
        }
    }

    public void disca(String numero) {
        System.out.println("\nO número " + numero + " está ligando...");
    }
}
