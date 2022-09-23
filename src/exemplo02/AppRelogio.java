package exemplo02;

public class AppRelogio {
    public static void main(String[] args) {
        Relogio meuRelogio = new Relogio(9, 12, 0);
        Relogio outroRelogio = new Relogio(8, 32, 14);

//        meuRelogio.setHora(9);
//        meuRelogio.setMinuto(30);
//
//        outroRelogio.setHora(10);
//        outroRelogio.setMinuto(25);

        meuRelogio.exibir();
        outroRelogio.exibir();

        System.out.println("hora: " + meuRelogio.getHora());
        System.out.println("minuto: " + meuRelogio.getMinuto());
    }
}
