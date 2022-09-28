package aula04.aulaAoVivo;


import aula04.aulaAoVivo.data.GerenciaContas;
import aula04.aulaAoVivo.exception.ContaInexistenteException;
import aula04.aulaAoVivo.modelo.Cliente;

public class Main {
    private static GerenciaContas contas = new GerenciaContas();
    public static void main(String[] args) {
        contas.novaContaCorrente(new Cliente());
        contas.novaContaCorrente(new Cliente());
        contas.novaContaCorrente(new Cliente());

        try {
            contas.depositar(1, 100);
            contas.transferir(1, 2, 50);
            System.out.println(contas.obterDadosConta(1));
            System.out.println(contas.obterDadosConta(2));
            System.out.println(contas.obterDadosConta(3));
        } catch (Exception e) {
            System.out.println("Erro");
        }
    }
}
