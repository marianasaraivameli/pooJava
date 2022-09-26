package poojava03praticaIntegradora01;

public class ClienteBasico  extends OperacoesBanco{
    String nome;

    public ClienteBasico(String nome) {
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
    public void pagamento(int num) {
        super.pagamento(num);
    }

    @Override
    public String toString() {
        return nome;
    }
}
