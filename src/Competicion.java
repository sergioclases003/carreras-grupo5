public class Competicion {
    private String nombre;
    private Piloto[] pilotos;
    private Carrera[] carreras;
    private int contadorPilotos;
    private boolean campeonatoIniciado;

    // Métodos

    public boolean anhadirPiloto(Piloto piloto) {
        // TODO: implementar
        return false;
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
        Carrera carreranueva = new Carrera(circuito,vueltas, ,pilotos);
        if (campeonatoIniciado) {
            return false;
        } else {
            boolean yaexiste = false;
            for (int i = 0; i < carreras.length; i++) {
                if (carreras[i].get() == circuito) {
                    return false;
                    yaexiste = true;
                }
            }
            if (!yaexiste) {
                Carrera[] arraynuevo = new Carrera[carreras.length + 1];
                for (int i = 0; i < carreras.length; i++) {
                    arraynuevo[i] = carreras[i];

                }
                arraynuevo[arraynuevo.length] = carreranueva ;



            }
            return false;
        }
        public void imprimirResultadoEscuderia () {
            // TODO: implementar
        }

    }
}
