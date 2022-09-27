package aula01.praticaIntegradora;

public class Main {
    public static void main(String[] args) {
        String[] cidades = {"Londres", "Madrid", "Nova York", "Buenos Aires", "Assunción", "São Paulo", "Lima", "Santiago do Chile", "Lisboa", "Tokio"};

        int matriz[][] = {{-2, 33}, {-3, 32}, {-8, 27}, {4, 37}, {6, 42}, {5,43}, {0, 39}, {-7, 26}, {-1, 31}, {-10, 35}};

        int valueMax = 0;
        int indexMax = 0;

        int valueMin = 1000;
        int indexMin = 0;
        for (int i = 0; i < cidades.length; i++) {
            for (int j = 0; j < 2; j++) {
                if (valueMax < matriz[i][j]) {
                    valueMax = matriz[i][j];
                    indexMax = i;
                };
                if (valueMin > matriz[i][j]) {
                    valueMin = matriz[i][j];
                    indexMin = i;
                };
            }
        }

        System.out.println("Temperatura máxima " + valueMax + " " + "na cidade de " + cidades[indexMax]);
        System.out.println("Temperatura minima " + valueMin + " " + "na cidade de " + cidades[indexMin]);
    }
}