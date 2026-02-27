import java.util.Scanner;
public class Simulador {
    public static void main(String[] args) {

        Coche coche1 = new Coche("Ferrari", 320, 0.90);
        Coche coche2 = new Coche("Ferrari", 315, 0.90);
        Coche coche3 = new Coche("Alpine", 310, 0.60);
        Coche coche4 = new Coche("Alpine", 308, 0.60);
        Coche coche5 = new Coche("RedBull", 318, 0.80);
        Coche coche6 = new Coche("RedBull", 316, 0.80);

        Piloto piloto1 = new Piloto("Charles Leclerc", 25, coche1, "Bueno");
        Piloto piloto2 = new Piloto("Lewis Hamilton", 27, coche2, "Excelente");
        Piloto piloto3 = new Piloto("Pierre Gasly", 24, coche3, "Mediocre");
        Piloto piloto4 = new Piloto("Franco Colapinto", 26, coche4, "Bueno");
        Piloto piloto5 = new Piloto("Max Verstappen", 23, coche5, "Excelente");
        Piloto piloto6 = new Piloto("Isack Hadjar", 28, coche6, "Mediocre");

        Circuito Silverstone = new Circuito("Silverstone", 5891);
        Circuito Monaco = new Circuito("Monaco", 3300);
        Circuito Spa = new Circuito("Spa", 7004);
        Circuito Barcelona = new Circuito("Barcelona", 4655);

        Competicion Formula1_2025 = new Competicion("Fórmula1");



    }
}