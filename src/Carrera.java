public class Carrera {

    // atributos 
    private Circuito circuito;       // circuito donde se corre la carrera
    private int vueltas;             // número de vueltas de la carrera
    private int temporada;           // temporada a la que pertenece la carrera
    private Piloto[] participantes;  // array de pilotos que participan
    private Piloto[] clasificacion;  // array de pilotos ordenado por puesto
    private boolean corrida;         // indica si la carrera ya se ha corrido

    // los constructores 

    public Carrera(Circuito circuito, int vueltas, int temporada, Piloto[] participantes) {
        this.circuito = circuito;
        this.vueltas = vueltas;
        this.temporada = temporada;
        this.participantes = participantes;
        this.clasificacion = new Piloto[participantes.length];
        this.corrida = false;
    }

    public Carrera(Circuito circuito, int vueltas) {
        this.circuito = circuito;
        this.vueltas = vueltas;
        this.corrida = false;
    }


    // métodos y getters y setters

    // Calcula la distancia total de la carrera (longitud del circuito * vueltas)
    public int obtenerLongitudTotal() {
        return circuito.getLongitud() * vueltas;
    }


    // array de clasificación (pilotos ordenados por puesto)
    public Piloto[] getClasificacion() {
        return clasificacion;
    }

    //  participantes e inicializa el array de clasificación con el mismo tamaño
    public void setParticipantes(Piloto[] participantes) {
        if (participantes != null) {
            this.participantes = participantes;
            this.clasificacion = new Piloto[participantes.length];
        }
    }

    // devuelve el circuito de la carrera (sirve para que la competición no repita circuitos)
    public Circuito getCircuito() {
        return circuito;
    }

    // devuelve si la carrera ya se ha corrido o no
    public boolean isCorrida() {
        return corrida;
    }

    // simula la carrera si no se ha corrido aún
    public boolean ejecutarCarrera() {
        if (corrida) {
            System.out.println("Esta carrera ya se ha corrido.");
            return false;
        }

        // TODO: calcular velocidades medias de cada piloto
        // TODO: comprobar fiabilidad de los coches
        // TODO: ordenar por velocidad media (inserción) y rellenar clasificacion

        corrida = true;
        return true;
    }

}