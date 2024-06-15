package POO;

public class Fixo extends Telefone{

    public Fixo() {
        super("Telefone Fixo");
    }

    public void disca(String numero) {
        System.out.println("\nO número " + numero + " está ligando...");
    }

    public void toca(int numtoques) {
        for (int i = 0; i < numtoques; i++) {
            System.out.println("\nPiriripiriripiriri...");
        }
    }
}
