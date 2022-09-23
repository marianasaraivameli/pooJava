public class Main {
    public static void main(String[] args) {
        String[] cidades = {"Londres", "Madrid", "Nova York", "Buenos Aires", "Assunción", "São Paulo", "Lima", "Santiago do Chile", "Lisboa", "Tokio"};
        int[] maxima = {33, 32, 27, 37, 42, 43, 39, 26, 31, 35};
        int[] minima = {-2, -3, -8, 4, 6, 5, 0, -7, -1, -10};

        int valueMax = 0;
        int indexMax = 0;
        for (int i = 0; i < maxima.length; i++) {
            if (valueMax < maxima[i]) {
                valueMax = maxima[i];
                indexMax = i;
            };
        }

        int valueMin = 1000;
        int indexMin = 0;
        for (int i = 0; i < minima.length; i++) {
            if (valueMin > minima[i]) {
                valueMin = minima[i];
                indexMin = i;
            };
        }

        System.out.println(cidades[indexMax]);
        System.out.println(cidades[indexMin]);
    }
}