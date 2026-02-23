public class Coche {
    private String escuderia;
    private int velocidad_maxima;
    private double fiabilidad;

    public String getEscuderia(){
        return escuderia;
    }

    public int getVelocidad_maxima(){
        return velocidad_maxima;
    }
    public double getFiabilidad(){
        return fiabilidad;
    }

    public void setEscuderia(String escuderia) {
        this.escuderia = escuderia;
    }
    public void setVelocidad_maxima(int velocidad_maxima){
        this.velocidad_maxima = velocidad_maxima;
    }
    public void setFiabilidad(double fiabilidad){
        this.fiabilidad = fiabilidad;
    }
}
