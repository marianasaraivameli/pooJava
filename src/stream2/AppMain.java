package stream2;

import java.util.List;

public class AppMain {
    public static void main(String[] args) {
        List<Pessoa> pessoa = Dados.getPessoas();

        pessoa.stream()
                .filter(p -> p.getPais().equalsIgnoreCase("Brazil"))
                .limit(10)
                .forEach(System.out::println);

        System.out.println("Ordenado: ");
        pessoa.stream()
                .filter(p -> p.getPais().equalsIgnoreCase("Brazil"))
                .limit(10)
                .sorted()
                .forEach(System.out::println);

        System.out.println("Ordenado por nome: ");
        pessoa.stream()
                .filter(p -> p.getPais().equalsIgnoreCase("Brazil"))
                .limit(10)
                .sorted((p1, p2 )-> p1.getNome().compareTo(p2.getNome()))
                .forEach(System.out::println);

        // Gerando a média de idade"
        double mediaIdade = pessoa.stream()
                .mapToDouble((p -> p.getIdade()))
                .average().getAsDouble();
        System.out.println("Média de idade? " + mediaIdade);
    }

}
