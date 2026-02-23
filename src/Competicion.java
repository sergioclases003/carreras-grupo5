public class Competicion {
    private String nombre;
    private Piloto[] pilotos;
    private Carrera[] carreras;
    private int contadorPilotos;
    private boolean campeonatoIniciado;

    // Métodos

    public Competicion(String nombre, int maxPilotos, int maxCarreras) {
        this.nombre = nombre;
        this.pilotos = new Piloto[maxPilotos];
        this.carreras = new Carrera[maxCarreras];
        this.contadorPilotos = 0;
        this.campeonatoIniciado = false;
    }

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
        // TODO: implementar
        return false;
    }
    public void imprimirResultadoEscuderia() {
        // TODO: implementar
    }

}
