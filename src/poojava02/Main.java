package poojava02;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Pessoa pessoa1 = new Pessoa("Maria", 17, "MG4521");
        Pessoa pessoa2 = new Pessoa("João", 25, "SP1371", 50, 1.55);
        // não é possível criar um novo objeto usando apenas um valor para nome e idade, uma vez que não temos um construtor apenas com estes parametros

        if (pessoa2.calcularIMC() == -1) {
            System.out.println("Classificação: Abaixo do peso para " + pessoa2.getNome());
        }
        if (pessoa2.calcularIMC() == 0) {
            System.out.println("Classificação: Peso saudável para " + pessoa2.getNome());
        }
        if (pessoa2.calcularIMC() == 1) {
            System.out.println("Classificação: Sobrepeso para " + pessoa2.getNome());
        }

        if (pessoa1.ehMaiorIdade()) {
            System.out.println("É maior de idade: " + pessoa1.getNome());
        } else {
            System.out.println("É menor de idade: " + pessoa1.getNome());
        }
    }
}
