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
        this.vueltas = vueltas;
        this.temporada = temporada;
        this.participantes = participantes;
        this.clasificacion = new Piloto[participantes.length];
        this.corrida = false;
    }

    // Constructor básico
    public Carrera(Circuito circuito, int vueltas) {
        this.circuito = circuito;
        this.vueltas = vueltas;
        this.corrida = false;
    }

    // Calcula la distancia total de la carrera (en km)
    public int obtenerLongitudTotal() {
        return circuito.getLongitud() * vueltas;
    }

    public Piloto[] getClasificacion() {
        return clasificacion;
    }

    // asigna participantes e inicializa el array de clasificación con el mismo tamaño
    public void setParticipantes(Piloto[] participantes) {
        // por si te pasan un array nulo
        if (participantes != null) {
            this.participantes = participantes;
            this.clasificacion = new Piloto[participantes.length];
        }
    }

    // para que la competición no repita circuitos
    public Circuito getCircuito() {
        return circuito;
    }

    // el estado de la carrera
    public boolean isCorrida() {
        return corrida;
    }
}