package aula03.aulaAoVivo.lambda;

import java.util.Arrays;
import java.util.List;

public class Exemplo2 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // exemplo aula03.aulaAoVivo.lambda
        // numeros.forEach( (n)-> System.out.println(n) );

        numeros.forEach( (n)-> {
            System.out.println(n);
            System.out.println(n * 2);
        } );

        // acessar a posição
        for (int i = 0; i < numeros.size() ; i++) {
            numeros.get(i);
        }

        // acessar o  item em si: forEach raiz
        for (Integer integer : numeros) {
            System.out.println(integer);
        }
    }
}
