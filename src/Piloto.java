import java.util.Random;

public class Piloto {
    private String nombre;
    private int edad;
    private Coche coche;
    private double habilidad;
    private Random rand = new Random();
    private String escuderia;

    public Piloto(String nombre, int edad, Coche coche, String nivelHabilidad, String escuderia) {
        this.nombre = nombre;
        this.edad = edad;
        this.coche = coche;
        this.escuderia= escuderia;

        switch (nivelHabilidad) {
            case "Excelente":
                this.habilidad = 0.9 + rand.nextDouble() * (1 - 0.9);
                break;
            case "Bueno":
                this.habilidad = 0.8 + rand.nextDouble() * (0.9 - 0.8);
                break;
            case "Mediocre":
                this.habilidad = 0.7 + rand.nextDouble() * (0.8 - 0.7);
                break;
            default:
                this.habilidad = 0.6;
        }
    }
    public double velocidadMedia() {
        double factorAleatorio = 0.9 + rand.nextDouble() * (1 - 0.9);

        return coche.getVelocidad_maxima()
                * habilidad
                * factorAleatorio
                * coche.getFiabilidad();
    }
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public Coche getCoche() {
        return coche;
    }
    public String getEscuderia() {
        return escuderia;
    }
}
