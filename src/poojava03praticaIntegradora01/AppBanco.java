package poojava03praticaIntegradora01;

public class AppBanco {
    public static void main(String[] args) {
        ClienteBasico cliente1 = new ClienteBasico("Basico");
        ClienteCobrador cliente2 = new ClienteCobrador("Cobrador");
        ClienteExecutivo cliente3 = new ClienteExecutivo("Executivo");


        cliente1.saqueDinheiro(1);
        cliente1.consultaSaldo(0);
        cliente1.pagamento(1);

        cliente2.saqueDinheiro(0);
        cliente2.consultaSaldo(1);

        cliente3.deposito(0);
        cliente3.transferencia(1);
    }
}
