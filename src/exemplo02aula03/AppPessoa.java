package exemplo02aula03;

import java.util.ArrayList;
import java.util.List;

public class AppPessoa {
    public static void main(String[] args) {
        List<Pessoa> lista = new ArrayList<>();

        lista.add(new Pessoa("Amanda", 25, "Ferreira"));
        lista.add(new Pessoa("Mariana", 36, "Saraiva"));
        lista.add(new Pessoa("Fernanda", 32, "Fortini"));

        System.out.println(lista);

        // traz o item da posição 01
        System.out.println(lista.get(1));
    }
}
