package poojava02;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Pessoa pessoa1 = new Pessoa("Maria", 25, "MG4521");
        Pessoa pessoa2 = new Pessoa("João", 20, "SP1371", 70, 1.75);
        // não é possível criar um novo objeto usando apenas um valor para nome e idade, uma vez que não temos um construtor apenas com estes parametros
    }
}
