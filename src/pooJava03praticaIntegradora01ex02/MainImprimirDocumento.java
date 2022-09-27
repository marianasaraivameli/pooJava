package pooJava03praticaIntegradora01ex02;

public class MainImprimirDocumento {
    public static void main(String[] args) {
        Curriculo curriculo = new Curriculo("Curriculo", "Mariana", 36, "Nutricionista");
        Imprimir.imprimirDocumento(curriculo);

        LivrosPdf livrosPdf = new LivrosPdf("Harry Potter", 345, "J.K.Rowling", "Enigma do Príncipe", "Fantasia");
        Imprimir.imprimirDocumento(livrosPdf);

        Relatorios relatorio = new Relatorios("Relatório Final", 3, "Fernanda Fortini", "Revisão da publicação concluída");
        Imprimir.imprimirDocumento(relatorio);
    }
}
