package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainStream {
    public static void main(String[] args) {
        // stream é um fluxo de dados, montamos ou recebemos de algum lugar para transformar uma estrutura em uma stream.

        List<Integer> numeros = Arrays.asList(1, 32, 3, 4, 5, 16, 47, 8, 93, 10);

        Stream<Integer> stream = numeros.stream();

        System.out.println("Exibindo todos os dados");

        // mesmo resultado, formas diferentes de fazer o forEach
//        stream.forEach(e -> System.out.println(e));
        stream.forEach(System.out::println);
        // os métodos de finalização fecha o stream.

        System.out.println("Números pares: ");
        List<Integer> listaPares = numeros.stream().filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(listaPares);

        System.out.println("Números ordenados");
        numeros.stream()
                .sorted()
                .forEach(System.out::println);
    }

}
