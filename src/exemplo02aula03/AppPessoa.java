package exemplo02aula03;

import java.util.ArrayList;
import java.util.List;

public class AppPessoa {
    public static void main(String[] args) {
        List<Pessoa> lista = new ArrayList<>();

        lista.add(new Pessoa("Amanda"));
        lista.add(new Pessoa("Mariana"));
        lista.add(new Pessoa("Fernanda"));

        System.out.println(lista);

        // traz o item da posição 01
        System.out.println(lista.get(1));
    }
}
