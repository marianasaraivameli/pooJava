package aula03.aulaAoVivo.wrapper;

public class MainWrapper {
    public static void main(String[] args) {
        int n = 10;
        Integer integer = 15; // autoboxing: boxing

        n = integer; // autoboxing: unboxing

        System.out.println(n);
        System.out.println(integer);

        int valor = Integer.parseInt("123");
        String texto = Integer.toString(123);
        String texto1 = 123 + ""; // transforma em texto da mesma forma que acima, usando o metodo toString().

        System.out.println(texto);
        System.out.println(texto1);

        Integer n1 = 200;
        Integer n2 = 200;

        System.out.println(n1 == n2); // são objetos diferentes, por isso retorna false.

        // para comparar precisamos usar um metodo, chamado equals, conforme mostrado abaixo:
        System.out.println(n1.equals(n2));
    }
}
