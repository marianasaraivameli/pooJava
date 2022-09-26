package poojava03praticaIntegradora01;

public abstract class OperacoesBanco {

    public OperacoesBanco() {
    }

    public void deposito(int num){
        if(num == 1) {
            System.out.println("Realizar depósito");
        } else {
            System.out.println("Erro ao realizar o depósito");
        }
    }

    public void transferencia(int num){
        if(num == 1) {
            System.out.println("Realizar transferência");
        } else {
            System.out.println("Erro ao realizar a transferência");
        }
    }

    public void saqueDinheiro(int num){
        if(num == 1) {
            System.out.println("Realizar saque em Dinheiro");
        } else {
            System.out.println("Erro ao realizar o saque em Dinheiro");
        }
    }

    public void consultaSaldo(int num){
        if(num == 1) {
            System.out.println("Realizar consulta de saldo");
        } else {
            System.out.println("Erro ao realizar a consulta de saldo");
        }
    }

    public void pagamento(int num){
        if(num == 1) {
            System.out.println("Realizar pagamento de serviço");
        } else {
            System.out.println("Erro ao realizar o pagamento de serviço");
        }
    }
}
