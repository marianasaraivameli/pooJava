package poojava02parte02exercicio02;

public class Pereciveis extends Produto{
    private int diasParaVencer;

    public Pereciveis(int diasParaVencer, String nome, double preco) {
        super(nome, preco);
        this.diasParaVencer = diasParaVencer;
    }

    public int getDiasParaVencer() {
        return diasParaVencer;
    }

    public void setDiasParaVencer(int diasParaVencer) {
        this.diasParaVencer = diasParaVencer;
    }

    @Override
    public double calcular(double quantidadeDeProdutos) {
        if (diasParaVencer == 3) {
            return super.calcular(quantidadeDeProdutos)/2;
        }
        if (diasParaVencer == 2) {
            return super.calcular(quantidadeDeProdutos)/3;
        }
        if (diasParaVencer == 1) {
            return super.calcular(quantidadeDeProdutos)/4;
        }
        return super.calcular(quantidadeDeProdutos);
    }

    @Override
    public String toString() {
        return "Pereciveis{" +
                "diasParaVencer=" + diasParaVencer +
                '}';
    }
}
