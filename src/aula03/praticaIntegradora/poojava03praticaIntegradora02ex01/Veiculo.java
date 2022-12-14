package aula03.praticaIntegradora.poojava03praticaIntegradora02ex01;

public class Veiculo {
    private String modelo;
    private String marca;
    private Double preco;

    public Veiculo(String modelo, String marca, Double preco) {
        this.modelo = modelo;
        this.marca = marca;
        this.preco = preco;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "aula04.aulaAoVivo.modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", preco=" + preco +
                '}';
    }
}
