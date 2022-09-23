package exemplo04;

public class Relogio {
    private final int HORA_PADRAO = 12;
    private int hora, minuto, segundo;
    private static String marca;

    public Relogio(int hora, int minuto, int segundo) {
        setHora(hora);
        setMinuto(minuto);
        this.segundo = segundo;
    }

    public void setHora(int novaHora) {
        if (novaHora >= 0 && novaHora < 24) {
            hora = novaHora;
        } else {
            this.hora = HORA_PADRAO;
        }
    }

    public void setMinuto(int novoMinuto) {
        if(novoMinuto >= 0 && novoMinuto < 60) {
            minuto = novoMinuto;
        }
    }

    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void exibir() {
        System.out.println(Relogio.marca + "- Hora atual: " + hora + ":" +
                minuto + ":" + segundo);
    }

    public String show() {
        return (Relogio.marca + "- Hora atual: " + hora + ":" +
                minuto + ":" + segundo);
    }

    public static String horaAtual() {
        return "00:15:12";
    }

    public static String getMarca() {
        return marca;
    }

    public static void setMarca(String marca) {
        Relogio.marca = marca;
    }
}
