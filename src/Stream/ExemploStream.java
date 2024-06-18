package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExemploStream {
    public static void main(String[] args) {
        List<String> estados = Arrays.asList("São Paulo", "Rio de Janeiro", "Minas Gerais", "Espirito Santo", "Rio grande do Sul",
                "Santa Catarina", "Paraná");
        //verificar uma busca de estado por um String ou Char qualquer
        List<String> estadosR = estados.stream()
                .filter(x -> x.toString().startsWith("R"))
                .sorted()
                .collect(Collectors.toList());

        System.out.println("\nEstados cujo nome começam com a letra R: " + estadosR);

        //verificar os estados que terminam com alguma String ou Char
        System.out.println("\nExemplo - Método Count");

        long numeroEstadosTerminaComO = estados.stream()
                .filter(x -> x.toString().endsWith("o"))
                .count();

        //verifica um String ou Char na coleção inteira
        System.out.println("\nNúmero de Estados cujo nome terminam com a letra O: " + numeroEstadosTerminaComO);

        //verifica um String ou Char na coleção inteira
        System.out.println("\nExemplo - Método AllmMatch");

        boolean todosEstadosContemRio = estados.stream()
                .allMatch(x -> x.toString().contains("Rio"));

        System.out.println("\nNúmero de Estados cujo nome contém Rio: " + todosEstadosContemRio);

        //verifica se pelo menos um contém o string
        boolean algumEstadoContemRio = estados.stream()
                .anyMatch(x -> x.toString().contains("Rio"));

        System.out.println("\nPelo menos um Estado contém a palavra Rio? " + algumEstadoContemRio);
    }
}
