package aula03.praticaIntegradora.poojava03praticaIntegradora02ex01;

import java.util.List;
import java.util.Comparator;
import java.util.OptionalDouble;

public class Garagem {
    private String id;
    List<Veiculo> listaVeiculos;

    public Garagem(String id, List<Veiculo> listaVeiculos) {
        this.id = id;
        this.listaVeiculos = listaVeiculos;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Veiculo> getListaVeiculos() {
        return listaVeiculos;
    }

    public void setListaVeiculos(List<Veiculo> listaVeiculos) {
        this.listaVeiculos = listaVeiculos;
    }

    public void mostrarTodosOsVeiculos() {
        listaVeiculos.forEach(System.out::println);
    }
    
    public void veiculosOrdenadosDePorPreco() {
        listaVeiculos.stream()
                .sorted((v1,v2) -> v1.getPreco().compareTo(v2.getPreco()))
                .forEach(System.out::println);
    }

    public void veiculosOrdenadosDePorMarca() {
        listaVeiculos.stream()
                .sorted((v1,v2) -> v1.getMarca().compareTo(v2.getMarca()))
                .forEach(System.out::println);
    }
}
