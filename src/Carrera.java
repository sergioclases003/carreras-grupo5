public class Carrera {

    private Circuito circuito;
    private int vueltas;
    private int temporada;
    private Piloto[] participantes;
    private Piloto[] clasificacion;
    private boolean corrida;

    // Constructor para inicialización completa
    public Carrera(Circuito circuito, int vueltas, int temporada, Piloto[] participantes) {
        this.circuito = circuito;
        this.vueltas = vultas;
        this.temporada = temporada;
        this.participantes = participantes;
        this.clasificacion = new Piloto[participantes.length];
        this.corrida = false;
    }

    // Constructor básico (requiere configurar participantes más tarde)
    public Carrera(Circuito circuito, int vueltas) {
        this.circuito = circuito;
        this.vueltas = vueltas;
        this.corrida = false;
    }

    // Calcula la distancia total de la carrera (km)
    public int obtenerLongitudTotal() {
        return circuito.getLongitud() * vueltas;
    }

    public Piloto[] getClasificacion() {
        return clasificacion;
    }

    // Asigna participantes e inicializa el array de clasificación con el mismo tamaño
    public void setParticipantes(Piloto[] participantes) {
        this.participantes = participantes;
        this.clasificacion = new Piloto[participantes.length];
    }
}