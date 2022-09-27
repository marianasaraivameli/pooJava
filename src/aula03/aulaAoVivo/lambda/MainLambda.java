package aula03.aulaAoVivo.lambda;

public class MainLambda {

    interface InterfaceString {
        String executar(String str);
    }

    public static void main(String[] args) {
        InterfaceString novaString = s -> s + " terminação";

        imprimir("Original", novaString);
    }

    // somente sera usado no local que será escrito, em um único. o metodo não é aproveitado em outro lugar.
    // exemplo de sintaxe aula03.aulaAoVivo.lambda () -> {}

    public static void imprimir(String texto, InterfaceString interfaceString) {

        System.out.println(interfaceString.executar(texto));
    }
}
