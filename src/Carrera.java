public class Carrera {
    private Circuito circuito;      // donde se corre
    private int vueltas;            // número de vueltas
    private int temporada;          // año de la carrera
    private Piloto[] participantes; // pilotos que corren
    private Piloto[] clasificacion; // cómo quedan al final
    private boolean corrida;        // si ya se ha corrido o no

    // constructor: cuando creamos una carrera nueva
    public Carrera(Circuito circuito, int vueltas, int temporada, Piloto[] participantes) {
        this.circuito = circuito;
        this.vueltas = vueltas;
        this.temporada = temporada;
        this.participantes = participantes;

        // creo la clasificación con el mismo tamaño que los pilotos
        this.clasificacion = new Piloto[participantes.length];

        // al empezar todavía no se ha corrido
        this.corrida = false;
    }

    // calcula los km totales de la carrera
    public int obtenerLongitudTotal() {
        // lo que mide el circuito por las vueltas y ya
        return circuito.getLongitud() * vueltas;
    }

    // devuelve la clasificación final
    public Piloto[] getClasificacion() {
        return clasificacion;
    }
}