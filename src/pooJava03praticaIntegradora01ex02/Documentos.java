package pooJava03praticaIntegradora01ex02;

import exemplo01Aula03.Imprimir;

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
