package aula03.praticaIntegradora.poojava03praticaIntegradora02ex01;

import java.util.List;

public class Garagem {
    private int id;
    private List<String> listaVeiculos;

    public Garagem(int id, List<String> listaVeiculos) {
        this.id = id;
        this.listaVeiculos = listaVeiculos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<String> getListaVeiculos() {
        return listaVeiculos;
    }

    public void setListaVeiculos(List<String> listaVeiculos) {
        this.listaVeiculos = listaVeiculos;
    }
}
