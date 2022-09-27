package aula03.praticaIntegradora.poojava03praticaIntegradora01ex03;

public class Cachorro extends Animal implements ComerCarne{

    public Cachorro(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom() {
        System.out.println("Auau");
    }

    @Override
    public void comerCarne() {
        System.out.println("Cachorro é carnívoro");
    }
}
