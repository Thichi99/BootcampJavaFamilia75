package POO;

public class Publico extends Telefone {

    public Publico() {
        super("Telefone Público");
    }

    public void disca(String numero) {
        System.out.println("\nO número " + numero + " está ligando...");
    }

    public void toca(int numtoques) {
        for (int i = 0; i < numtoques; i++) {
            System.out.println("\nTiriririririririiiii...");
        }
    }


}
