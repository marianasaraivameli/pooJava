package aula02.aulaAoVivo.exemplo03;

public class Estudante extends Pessoa {
    public Estudante(String nome) {
        super(nome); // referência ao constructor da classe Pai, no caso Pessoa()
    }

    @Override
    public String toString() {
        return "Estudante: " + super.toString();
    }
}
