package aula03.praticaIntegradora.poojava03praticaIntegradora01ex03;

public class Gato extends Animal implements ComerCarne{
    public Gato(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom() {
        System.out.println("Miau");
    }

    @Override
    public void comerCarne() {
        System.out.println("Gato é carnívoro");
    }
}
