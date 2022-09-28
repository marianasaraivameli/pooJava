package aula03.praticaIntegradora.poojava03praticaIntegradora02ex01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Veiculo> listaVeiculos = new ArrayList<>();

        listaVeiculos.add(new Veiculo("Fiesta", "Ford", 1000.0));
        listaVeiculos.add(new Veiculo("Focus", "Ford", 1200.0));
        listaVeiculos.add(new Veiculo("Explorer", "Ford", 2500.0));
        listaVeiculos.add(new Veiculo("Uno", "Fiat", 500.0));
        listaVeiculos.add(new Veiculo("Cronos", "Fiat", 1000.0));
        listaVeiculos.add(new Veiculo("Torino", "Fiat", 1250.0));
        listaVeiculos.add(new Veiculo("Aveo", "Chevrolet", 1250.0));
        listaVeiculos.add(new Veiculo("Spin", "Chevrolet", 2500.0));
        listaVeiculos.add(new Veiculo("Corola", "Toyota", 1200.0));
        listaVeiculos.add(new Veiculo("Fortuner", "Toyota", 3000.0));
        listaVeiculos.add(new Veiculo("Logan", "Renault", 950.0));

        Garagem garagem = new Garagem("ID175", listaVeiculos);

        System.out.println("Lista completa");
        garagem.mostrarTodosOsVeiculos();

        System.out.println("Lista ordenada por Preço em ordem crescente:");
        garagem.veiculosOrdenadosDePorPreco();

        System.out.println("Lista ordenada por Marca em ordem Alfabetica:");
        garagem.veiculosOrdenadosDePorMarca();
    }
}
