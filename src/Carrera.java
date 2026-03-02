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
    public double obtenerLongitudTotal() {
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

        // calcular velocidades medias de cada piloto
        double[] velocidades = new double[participantes.length];

        for (int i = 0; i < participantes.length; i++) {
            velocidades[i] = participantes[i].velocidadMedia();
            System.out.printf("%s va a una media de %.2f km/h%n", participantes[i].getNombre(), velocidades[i]);
        }

        // comprobar fiabilidad de los coches
        double km = obtenerLongitudTotal();
        for (int i = 0; i < participantes.length; i++) {
            if (!participantes[i].getCoche().acabaCarrera(km)) {
                System.out.println(participantes[i].getNombre() + " ha tenido que abandonar!");
                velocidades[i] = 0;
            }
        }
        // ordenar por velocidad media (por inserción) y rellenar clasificacion
        for (int i = 0; i < participantes.length; i++) {
            clasificacion[i] = participantes[i];
        }

        for (int i = 1; i < clasificacion.length; i++) {
            Piloto pilotoAux = clasificacion[i];
            double velAux = velocidades[i];
            int j = i - 1;

            while (j >= 0 && velocidades[j] < velAux) {
                clasificacion[j + 1] = clasificacion[j];
                velocidades[j + 1] = velocidades[j];
                j--;
            }
            clasificacion[j + 1] = pilotoAux;
            velocidades[j + 1] = velAux;
        }

        corrida = true;
        return true;
    }

    // devuelve el puesto de un piloto en la carrera (1 para el primero, 2 para el segundo etc)
    public int getPosicionDePiloto(Piloto p) {
        if (clasificacion != null) {
            for (int i = 0; i < clasificacion.length; i++) {
                if (clasificacion[i] != null && clasificacion[i].equals(p)) {
                    return i + 1;
                }
            }
        }
        return 0; // en caso de no encontrar el piloto
    }

}