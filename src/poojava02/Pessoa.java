package poojava02;

public class Pessoa {
    private String nome;
    private int idade;
    private String ID;
    private double peso;
    private double altura;

    public Pessoa() {}

    public Pessoa(String nome, int idade, String ID) {
        this.nome = nome;
        this.idade = idade;
        this.ID = ID;
    }

    public Pessoa(String nome, int idade, String ID, double peso, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.ID = ID;
        this.peso = peso;
        this.altura = altura;
    }

    public int calcularIMC () {
        double resultIMC = peso / ( altura * altura);
        System.out.println(resultIMC);
        if (resultIMC < 20) {
            return -1;
        }
        if (resultIMC >=20 && resultIMC <=25) {
            return 0;
        }
        return 1;
    }

    public boolean ehMaiorIdade() {
        return idade >=18;
    }
}
