package pooJava03praticaIntegradora01ex02;

public class Relatorios extends Documentos{
    private int numPaginas;
    private String revisor;
    private String texto;

    public Relatorios(String nomeDocumento ,int numPaginas, String revisor, String texto) {
        super(nomeDocumento);
        this.numPaginas = numPaginas;
        this.revisor = revisor;
        this.texto = texto;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public String getRevisor() {
        return revisor;
    }

    public void setRevisor(String revisor) {
        this.revisor = revisor;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    @Override
    public String toString() {
        return "Relatorios{" +
                "numPaginas=" + numPaginas +
                ", revisor='" + revisor + '\'' +
                ", texto='" + texto + '\'' +
                '}';
    }
}
