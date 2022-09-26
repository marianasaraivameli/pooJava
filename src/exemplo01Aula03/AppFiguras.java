package exemplo01Aula03;

public class AppFiguras {
    public static void main(String[] args) {
        Quadrado q = new Quadrado(1, 2);
        Figura f = new Quadrado(2,2);

        Figura vetorFigura[] = new Figura[3];
        vetorFigura[0] = new Quadrado(1, 1);
        vetorFigura[1] = new Quadrado(2, 2);
        vetorFigura[2] = new Circulo(3, 4);

        for (int i = 0; i < 3; i++) {
            vetorFigura[i].exibir();
        }

        GerarPdf.gerar(vetorFigura[0]);
        GerarPdf.gerar(vetorFigura[2]);

        ExibirTela tela = new ExibirTela();

        vetorFigura[0].show(tela);
        vetorFigura[1].show(tela);

    }
}
