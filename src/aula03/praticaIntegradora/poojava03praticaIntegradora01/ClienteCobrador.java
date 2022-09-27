package aula03.praticaIntegradora.poojava03praticaIntegradora01;

public class ClienteCobrador extends OperacoesBanco{
    String nome;

    public ClienteCobrador(String nome) {
        super();
        this.nome = nome;
    }

    @Override
    public void saqueDinheiro(int num) {
        super.saqueDinheiro(num);
    }

    @Override
    public void consultaSaldo(int num) {
        super.consultaSaldo(num);
    }

    @Override
    public String toString() {
        return nome;
    }
}
