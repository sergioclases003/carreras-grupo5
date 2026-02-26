public class Circuito {

    private String nombre;
    private double longitud;
    private Carrera[] carreras;

    public Circuito(String nombre, double longitud) {
        this.nombre = nombre;
        this.longitud = longitud;
        this.carreras = new Carrera[0]; //
    }
    public void anhadirCarrera(Carrera carrera) {

        Carrera[] nuevoArray = new Carrera[carreras.length + 1];

        for (int i = 0; i < carreras.length; i++) {
            nuevoArray[i] = carreras[i];
        }
        nuevoArray[carreras.length] = carrera;

        carreras = nuevoArray;
    }
    public int obtenerCarrerasTotales() {
        return carreras.length;
    }
    public void mostrarInfo() {
        System.out.println("Circuito: " + nombre);
        System.out.println("Longitud: " + longitud + " km");
        System.out.println("Carreras registradas: " + carreras.length);
    }
    public double getLongitud() {
        return longitud;
    }
}
