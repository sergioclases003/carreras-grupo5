import javax.swing.*;

public class Competicion {
    private String nombre;
    private Piloto[] pilotos;
    private Carrera[] carreras;
    private boolean campeonatoIniciado;

    // Métodos

    public boolean anhadirPiloto(Piloto piloto) {

        if (campeonatoIniciado){
            System.out.println("No se puede añadir a " + piloto.getNombre() + ": El campeonato ya ha comenzado.");
            return false;
        }
        for (int i = 0; i < pilotos.length; i++) {
            if (pilotos[i].getNombre().equals(piloto.getNombre())) {
                System.out.println("El piloto " + piloto.getNombre() + " ya está inscrito.");
                return false;
            }
        }

        Piloto[] nuevoArray = new Piloto[pilotos.length + 1];
        for (int i = 0; i < pilotos.length; i++) {
            nuevoArray[i] = pilotos[i];
        }
        nuevoArray[nuevoArray.length-1] = piloto;
        this.pilotos = nuevoArray;
        System.out.println("Añadiendo el piloto " + piloto.getNombre() + " a la competición " + nombre);
        return true;
    }


    public boolean arrancarCampeonato() {
        if (campeonatoIniciado) {
            System.out.println("El campeonato " + nombre + " ya se ejecutó anteriormente.");
            return false;
        }

        System.out.println("=== ARRANCANDO CAMPEONATO: " + nombre + " ===");

        // Recorrer carreras
        for (int i = 0; i < carreras.length; i++) {
            if (carreras[i] != null) {
                carreras[i].ejecutarCarrera();
            }
        }

        campeonatoIniciado = true;
        return true;
    }

    public void imprimirResultado() {
        Piloto[] rankingPilotos = new Piloto[pilotos.length];
        int[] rankingPuntos =calcularPuntos();

        // Ordenar por puntos
        for (int i = 1; i < rankingPuntos.length; i++) {
            int puntosAux = rankingPuntos[i];
            Piloto pilotoAux = rankingPilotos[i];
            int j = i - 1;

            while (j >= 0 && rankingPuntos[j] < puntosAux) {
                rankingPuntos[j + 1] = rankingPuntos[j];
                rankingPilotos[j + 1] = rankingPilotos[j];
                j--;
            }
            rankingPuntos[j + 1] = puntosAux;
            rankingPilotos[j + 1] = pilotoAux;
        }

        System.out.println("\n=== CLASIFICACIÓN FINAL DE PILOTOS ===");
        for (int i = 0; i < rankingPilotos.length; i++) {
            System.out.println((i + 1) + "º - " + rankingPilotos[i].getNombre() + ": " + rankingPuntos[i] + " pts");
        }
    }

    //Sergio

    public boolean anhadirCarrera(Circuito circuito, int vueltas) {
        Carrera carreraNueva = new Carrera(circuito,vueltas,pilotos);
        if (campeonatoIniciado) {
            System.out.println("La competicion ya ha empezado no se pueden añadir carreras");
            return false;
        } else {
            for (int i = 0; i < carreras.length; i++) {
                if (carreras[i].getCircuito().equals(circuito)) {
                    System.out.println("Este circuito ya pertenece a esta competicion y tiene una carrera asignada");
                    return false;

                }
            }
            Carrera[] arrayNuevo = new Carrera[carreras.length + 1];
            for (int i = 0; i < carreras.length; i++) {
                arrayNuevo[i] = carreras[i];
            }
            arrayNuevo[arrayNuevo.length -1] = carreraNueva ;
            carreras = arrayNuevo;
            System.out.println("Carrera añadida correctamente al campeonato...");



            }
            return true;
        }
        public void imprimirResultadoEscuderia () {
            String[] escuderiasProcesadas = new String[pilotos.length];
            int[] rankingPuntos = calcularPuntos();

            int contadorEsc = 0;

            for (int i = 0; i < pilotos.length; i++) {

                String escActual = pilotos[i].getEscuderia();

                // Comprobar si ya hemos procesado esta escudería
                boolean yaProcesada = false;
                for (int j = 0; j < contadorEsc; j++) {
                    if (escuderiasProcesadas[j].equals(escActual)) {
                        yaProcesada = true;
                        break;
                    }
                }

                if (yaProcesada) {
                    continue;
                }

                int totalPuntos = 0;
                for (int k = 0; k < pilotos.length; k++) {
                    if (pilotos[k].getEscuderia().equals(escActual)) {
                        totalPuntos += rankingPuntos[k];
                    }
                }
                escuderiasProcesadas[contadorEsc] = escActual;
                contadorEsc++;

                System.out.println("Escudería: " + escActual + " → Puntos totales: " + totalPuntos);
            }
        }
        public int [] calcularPuntos(){
            int[] rankingPuntos = new int[pilotos.length];
            for (int i = 0; i < pilotos.length; i++) {

                int sumaPuntos = 0;

                for (int j = 0; j < carreras.length; j++) {
                    if (carreras[j] != null) {
                        int posicion = carreras[j].getPosicionDePiloto(pilotos[i]);
                        if (posicion == 1) sumaPuntos += 10;
                        else if (posicion == 2) sumaPuntos += 8;
                        else if (posicion == 3) sumaPuntos += 5;
                    }
                }
                rankingPuntos[i] = sumaPuntos;
            }
            return  rankingPuntos;

        }


}


