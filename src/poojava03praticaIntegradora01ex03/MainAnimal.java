package poojava03praticaIntegradora01ex03;

public class MainAnimal {
    public static void main(String[] args) {
        System.out.println("Animal 1:");
        Cachorro cachorro1 = new Cachorro("Mel");
        System.out.println(cachorro1.getNome());
        cachorro1.emitirSom();
        cachorro1.comerCarne();

        System.out.println("Animal 2:");
        Gato gato1 = new Gato("PP");
        System.out.println(gato1.getNome());
        gato1.emitirSom();
        gato1.comerCarne();

        System.out.println("Animal 3:");
        Vaca vaca1 = new Vaca("Mimosa");
        System.out.println(vaca1.getNome());
        vaca1.emitirSom();
        vaca1.comerPasto();
    }
}
