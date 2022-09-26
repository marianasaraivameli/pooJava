package exemplo02aula03;

public class Pessoa {
    String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return nome;
    }
}
