package poojava03praticaIntegradora01ex03;

public class Vaca extends Animal implements ComerPasto{
    public Vaca(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom() {
        System.out.println("Muuh");
    }

    @Override
    public void comerPasto() {
        System.out.println("Vaca é herbívora");
    }
}
