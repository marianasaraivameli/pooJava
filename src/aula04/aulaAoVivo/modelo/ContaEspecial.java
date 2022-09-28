package aula04.aulaAoVivo.modelo;

import aula04.aulaAoVivo.exception.InvalidNumberException;

public class ContaEspecial extends Conta {
    private double limite;

    public ContaEspecial(int numero, Cliente cliente, double limite) {
        super(numero, cliente);
        this.limite = limite;
    }

    @Override
    public boolean sacar(double valor) throws InvalidNumberException {
        if(saldoInsuficiente(valor)) {
            return false; // se o saldo não for suficiente
        }
        return super.sacar(valor);
    }

    // verifica se tem saldo na conta
    private boolean saldoInsuficiente(double valor) {
        return (getSaldo() + limite) < valor;
    }

    @Override
    public String toString() {
        return "Conta especial: " + super.toString();
    }
}
