package aula04.aulaAoVivo.modelo;

import aula04.aulaAoVivo.exception.InvalidNumberException;

public class ContaCorrente extends Conta {

    public ContaCorrente(int numero, Cliente cliente) {
        super(numero, cliente);
    }

    @Override
    public boolean sacar(double valor) throws InvalidNumberException {
        if(saldoInsuficiente(valor)) {
            return false; // se o saldo não for suficiente
        }
        return super.sacar(valor);
    }


    // verifica se tem saldo na conta
    public boolean saldoInsuficiente(double valor) {
        return getSaldo() < valor;
    }

    @Override
    public String toString() {
        return "Conta Corrente" + super.toString();
    }
}
