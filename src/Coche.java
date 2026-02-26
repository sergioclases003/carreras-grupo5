import java.util.Random;

public class Coche {

    private String escuderia;
    private int velocidad_maxima;
    private double fiabilidad;
    private Random rand = new Random();

    public Coche(String escuderia, int velocidad_maxima, double fiabilidad) {
        this.escuderia = escuderia;
        this.velocidad_maxima = velocidad_maxima;
        this.fiabilidad = fiabilidad;
        }
        public int getVelocidad_maxima() {
            return velocidad_maxima;
        }

        public String getEscuderia() {
            return escuderia;
        }

    public double getFiabilidad() {
        return fiabilidad;
    }

    public boolean acabaCarrera(int kilometros) {
            int tramos = kilometros / 5;
            for (int i = 0; i < tramos; i++) {
                double aleatorio = rand.nextDouble();
                if (aleatorio > fiabilidad) {
                    return false;
                }
            }
            return true;
        }
    }