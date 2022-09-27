package aula03.praticaIntegradora.pooJava03praticaIntegradora01ex02;

public abstract class Documentos {
    String nomeDocumento;

    public Documentos( String nomeDocumento) {
        this.nomeDocumento = nomeDocumento;
    }

    @Override
    public String toString() {
        return "Documentos{" +
                "nomeDocumento='" + nomeDocumento + '\'' +
                '}';
    }
}
