package aula03.aulaAoVivo.exemplo02aula03;

public class Pessoa {
    String nome;
    int idade;
    String sobrenome;

    public Pessoa(String nome, int idade, String sobrenome) {
        this.nome = nome;
        this.idade= idade;
        this.sobrenome= sobrenome;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome=" + nome + " , sobrenome= " + sobrenome + ", idade = " + idade +
                '}';
    }
}
