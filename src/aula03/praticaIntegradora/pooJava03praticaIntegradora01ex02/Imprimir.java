package aula03.praticaIntegradora.pooJava03praticaIntegradora01ex02;

public interface Imprimir {
    public static void imprimirDocumento(Documentos documento) {
        System.out.println(documento.toString());
    }
}
