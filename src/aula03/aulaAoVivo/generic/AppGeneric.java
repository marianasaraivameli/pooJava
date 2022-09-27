package aula03.aulaAoVivo.generic;

import java.util.ArrayList;
import java.util.List;

public class AppGeneric {
    public static void main(String[] args) {
        MyClass<Integer> obj1 = new MyClass<>(222);
        MyClass<String> obj2 = new MyClass<>("Texto qualquer");

        System.out.println(obj1.getObj());
        System.out.println(obj2.getObj());

        // uma forma de declarar uma lista sem tipar, usa-se a ?. Não é orientado o uso indiscriminado, apenas em momentos especificos.
        List<?> lista = new ArrayList<>();
    }
}
