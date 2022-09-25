package poojava02parte02exercicio02;

import poojava02parte02exercicio02.Produto;
import poojava02parte02exercicio02.Pereciveis;
import poojava02parte02exercicio02.NaoPereciveis;
import poojava02parte02exercicio02.Venda;

import java.util.*;

public class Distribuidora {
    // https://www.alura.com.br/conteudo/java-collections--amp?gclid=Cj0KCQjw1bqZBhDXARIsANTjCPIwm7RVlFvHFv2msq1GWUmWAs4I8sMn4_cg2ZX5g-Rfbd7c2V6tS0MaAlm1EALw_wcB
    public static void main(String[] args) {
        Produto p1 = new Pereciveis(4,"Queijo Canastra", 15.45);
        Produto p2 = new Pereciveis(2,"Iogurte", 2.45);
        Produto p3 = new Pereciveis(1,"Queijo", 12.45);
        Produto p4 = new Pereciveis(3,"Coalhada", 10.45);
        Produto p5 = new Pereciveis(10,"Leite", 5.45);

        Produto np1 = new NaoPereciveis("Básico", "Feijão", 7.85);
        Produto np2 = new NaoPereciveis("Básico", "Arroz", 17.85);
        Produto np3 = new NaoPereciveis("Básico", "Óleo]", 9.85);
        Produto np4 = new NaoPereciveis("Básico", "Açúcar", 6.85);
        Produto np5 = new NaoPereciveis("Básico", "Macarrão", 2.85);

        System.out.println(np1.toString());

        List<Venda> produtos = new ArrayList<>();

        produtos.add(new Venda(p1, 1));
        produtos.add(new Venda(p2, 2));
        produtos.add(new Venda(p3, 2));
        produtos.add(new Venda(p4, 2));
        produtos.add(new Venda(p5, 2));
        produtos.add(new Venda(np1, 3));
        produtos.add(new Venda(np2, 2));
        produtos.add(new Venda(np3, 2));
        produtos.add(new Venda(np4, 2));
        produtos.add(new Venda(np5, 2));

        System.out.println(produtos);

        double valorTotal = 0;
        for(Venda produto: produtos){
            valorTotal += produto.getProduto().calcular(produto.getQuantidade());
            System.out.println(produto.getProduto());
        }

        System.out.println("TOTAL = " +valorTotal);
    }
}
