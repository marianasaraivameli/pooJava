package aula03.aulaAoVivo.exemplo01Aula03;

public class Quadrado extends Figura {
    public Quadrado (int x, int y) {
        super(x, y);
    }

    public String getName() {
        return "Quadrado";
    }

    @Override
    public void exibir() {
        System.out.println("Quadrado");
    }

    @Override
    public void show(Imprimir imprimir) {
        imprimir.exibir("Quadrado");

    }

}
