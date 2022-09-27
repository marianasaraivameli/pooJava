package aula02.aulaAoVivo.exemplo01;

public class AppLivro {
    public static void main(String[] args) {
        // criando o objeto
        Livro meuLivro = new Livro();

        meuLivro.titulo = "Programando em Java";
        meuLivro.autor = "Deitel";

        System.out.println("Livro: " + meuLivro.titulo);
    }
}
