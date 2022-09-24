package poojava02;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Pessoa pessoa1 = new Pessoa("Maria", 17, "MG4521");
        Pessoa pessoa2 = new Pessoa("João", 25, "SP1371", 50, 1.55);
        // não é possível criar um novo objeto usando apenas um valor para nome e idade, uma vez que não temos um construtor apenas com estes parametros

        System.out.println(pessoa2.calcularIMC());
        System.out.println(pessoa1.ehMaiorIdade());
        System.out.println(pessoa2.ehMaiorIdade());
    }
}
