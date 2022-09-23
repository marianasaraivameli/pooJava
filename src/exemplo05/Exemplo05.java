package exemplo05;
import java.net.Socket;

public class Exemplo05 {
    // tratamento de exceções:
    public static void main(String[] args) {
        int vetor[] = new int[3];
//        Socket srv;

        // Forma especifica de tratar um erro
//        try {
//            for (int i = 0; i < 4; i++) {
//                System.out.println(vetor[i]);
//            }
//        }catch(ArrayIndexOutOfBoundsException ex) {
//            System.out.println("Erro: indice fora do limite");
//            System.out.println(ex.getMessage());
//            System.out.println(ex.getCause());
//        }

        // Tratando erro de forma global
        try {
            for (int i = 0; i < 4; i++) {
                System.out.println(vetor[i]);
            }
        }catch(ArrayIndexOutOfBoundsException ex) {
            System.out.println("Erro: indice fora do limite");
            System.out.println(ex.getMessage());
            System.out.println(ex.getCause());
        }catch(ArithmeticException ex) {
            System.out.println(ex.getMessage());
            System.out.println(ex.getCause());
        }catch(Exception ex) {
            System.out.println(ex.getMessage());
            System.out.println(ex.getCause());
        }finally {
            System.out.println("Finalizando as conexões");
        }

        System.out.println("Fim do programa!!");
//        srv = new Socket("27.0.0.1", 800);

    }
}
