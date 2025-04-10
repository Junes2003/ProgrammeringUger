package Uge6;
import java.util.Scanner;
    public class Hjemmeopgave02Tommeberegner {

    // Sådan får jeg konstant for omregning fra tommer til centimeter


    public static void main(String[] args) {
        final double TOMMER_TIL_CM = 2.54;
        // Sådan her udskriver jeg en besked til brugeren.
        System.out.println("Velkommen til TommeBeregner!");
        System.out.println("Indtast en længde i tommer, og vi regner den om til centimeter.");

        // Sådan her laver jeg en Scanner til brugerinput
        Scanner scanner = new Scanner(System.in);

        // Her får jeg brugeren om at indtaste et tal i tommer.
        System.out.print("Indtast længden i tommer: ");
        double tommer = scanner.nextDouble();

        // Sådan beregner jeg længden i centimeter
        double centimeter = tommer * TOMMER_TIL_CM;

        // Sådan udskriver resultatet
        System.out.println(tommer + " tommer svarer til " + centimeter + " centimeter.");

        scanner.close();
    }
}








