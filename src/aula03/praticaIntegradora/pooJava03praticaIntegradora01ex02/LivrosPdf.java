package aula03.praticaIntegradora.pooJava03praticaIntegradora01ex02;

public class LivrosPdf extends Documentos{
    private int numPaginas;
    private String autor;
    private String titulo;
    private String genero;

    public LivrosPdf(String nomeDocumento,int numPaginas, String autor, String titulo, String genero) {
        super(nomeDocumento);
        this.numPaginas = numPaginas;
        this.autor = autor;
        this.titulo = titulo;
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "LivrosPdf{" +
                "numPaginas=" + numPaginas +
                ", autor='" + autor + '\'' +
                ", titulo='" + titulo + '\'' +
                ", genero='" + genero + '\'' +
                '}';
    }
}
