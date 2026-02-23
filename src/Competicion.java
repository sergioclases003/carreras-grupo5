import javax.swing.*;

public class Competicion {
    private String nombre;
    private Piloto[] pilotos;
    private Carrera[] carreras;
    private int contadorPilotos;
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
        nuevoArray[pilotos.length-1] = piloto;
        this.pilotos = nuevoArray;
        System.out.println("Añadiendo el piloto " + piloto.getNombre() + " a la competición " + nombre);
        return true;
    }


    public boolean arrancarCampeonato() {
        // TODO: implementar
        return false;
    }

    public void imprimirResultado() {
        // TODO: implementar
    }

    //Sergio

    public boolean anhadirCarrera(Circuito circuito, int vueltas) {
        Carrera carreranueva = new Carrera(circuito,vueltas,1,pilotos);
        if (campeonatoIniciado) {
            return false;
        } else {


            boolean yaexiste = false;
            for (int i = 0; i < carreras.length; i++) {
                if (carreras[i].getCircuito() == circuito) {
                    yaexiste = true;
                    return false;

                }
            }
            if (!yaexiste) {
                Carrera[] arraynuevo = new Carrera[carreras.length + 1];
                for (int i = 0; i < carreras.length; i++) {
                    arraynuevo[i] = carreras[i];

                }
                arraynuevo[arraynuevo.length -1] = carreranueva ;
                carreras = arraynuevo;



            }
            return false;
        }
        public void imprimirResultadoEscuderia () {
            // TODO: implementar
        }

    }
}
