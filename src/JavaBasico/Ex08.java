package JavaBasico;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        String palavra1, palavra2, palavra3, animal = "";

        Scanner leia = new Scanner(System.in);

        System.out.println("Digite a primeira característica: ");
        palavra1 = leia.nextLine();

        System.out.println("Digite a segunda característica: ");
        palavra2 = leia.nextLine();

        System.out.println("Digite a terceira característica: ");
        palavra3 = leia.nextLine();

        if (palavra1.equalsIgnoreCase("vertebrado")) {
            if (palavra2.equalsIgnoreCase("ave")) {
                if (palavra3.equalsIgnoreCase("carnivoro")) {
                    animal = "Águia";
                } else if (palavra3.equalsIgnoreCase("onivoro")) {
                    animal = "Pomba";
                }
            } else if (palavra2.equalsIgnoreCase("mamifero")) {
                if (palavra3.equalsIgnoreCase("onivoro")) {
                    animal = "Homem";
                } else if (palavra3.equalsIgnoreCase("herbivoro")) {
                    animal = "Vaca";
                }
            }
        } else if (palavra1.equalsIgnoreCase("invertebrado")) {
            if (palavra2.equalsIgnoreCase("inseto")) {
                if (palavra3.equalsIgnoreCase("hematofago")) {
                    animal = "Pulga";
                } else if (palavra3.equalsIgnoreCase("herbivoro")) {
                    animal = "Lagarta";
                }
            } else if (palavra2.equalsIgnoreCase("anelideo")) {
                if (palavra3.equalsIgnoreCase("hematofago")) {
                    animal = "Sanguessuga";
                } else if (palavra3.equalsIgnoreCase("onivoro")) {
                    animal = "Minhoca";
                }
            }
        }

        if (animal.isEmpty() == false) {
            System.out.printf("O animal escolhido foi: %s ", animal);
        } else {
            System.out.println("Não encontrei nenhum animal.");
        }
    }
}
