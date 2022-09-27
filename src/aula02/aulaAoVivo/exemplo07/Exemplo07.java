package aula02.aulaAoVivo.exemplo07;

import java.util.Scanner;

public class Exemplo07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        String nome;
        String dadoDigitado;

        System.out.println("Digite seu nome: ");
        nome = entrada.nextLine();

        System.out.println("Digite um numero inteiro");
        numero = entrada.nextInt();
//        dadoDigitado = entrada.nextLine();
//        numero = Integer.parseInt(dadoDigitado);
//        System.out.println("Você digitou: " + dadoDigitado);

        System.out.println("Você digitou: " + numero);
        System.out.println("Você digitou: " + nome);
        entrada.close();
    }
}
