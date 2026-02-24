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



    
}