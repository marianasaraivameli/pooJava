package aula03.praticaIntegradora.poojava03praticaIntegradora02ex01;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Veiculo> listaVeiculo = new ArrayList<>();

        listaVeiculo.add(new Veiculo("Fiesta", "Ford", 1000));
        listaVeiculo.add(new Veiculo("Focus", "Ford", 1200));
        listaVeiculo.add(new Veiculo("Explorer", "Ford", 2500));
        listaVeiculo.add(new Veiculo("Uno", "Fiat", 500));
        listaVeiculo.add(new Veiculo("Cronos", "Fiat", 1000));
        listaVeiculo.add(new Veiculo("Torino", "Fiat", 1250));
        listaVeiculo.add(new Veiculo("Aveo", "Chevrolet", 1250));
        listaVeiculo.add(new Veiculo("Spin", "Chevrolet", 2500));
        listaVeiculo.add(new Veiculo("Corola", "Toyota", 1200));
        listaVeiculo.add(new Veiculo("Fortuner", "Toyota", 3000));
        listaVeiculo.add(new Veiculo("Logan", "Renault", 950));

        System.out.println(listaVeiculo);
    }
}
