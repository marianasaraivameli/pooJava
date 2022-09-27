package pooJava03praticaIntegradora01ex02;

public class Curriculo extends Documentos {
    private String nome;
    private int idade;
    private String habilidade;

    public Curriculo(String nomeDocumento, String nome, int idade, String habilidade) {
        super(nomeDocumento);
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getHabilidade() {
        return habilidade;
    }

    public void setHabilidade(String habilidade) {
        this.habilidade = habilidade;
    }

    @Override
    public String toString() {
        return "Curriculo{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", habilidade='" + habilidade + '\'' +
                '}';
    }
}
