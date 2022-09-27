package aula03.praticaIntegradora.poojava03praticaIntegradora01;

public class ClienteExecutivo extends OperacoesBanco{
    String nome;

    public ClienteExecutivo(String nome) {
        super();
        this.nome = nome;
    }

    @Override
    public void deposito(int num) {
        super.deposito(num);
    }

    @Override
    public void transferencia(int num) {
        super.transferencia(num);
    }

    @Override
    public String toString() {
        return nome;
    }
}
