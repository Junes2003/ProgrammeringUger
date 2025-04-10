package Uge6;
import java.util.Scanner;
public class Opskrift {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hvor mange cookies vil du bage?");
        int antalCookies = scanner.nextInt();

        double melPerCookie = 50.0;

        // Sådan beregner jeg den samlede mængde mel, der skal bruges
        double totalMel = antalCookies * melPerCookie;

        // Sådan udskriver jeg resultatet
        System.out.println("For at bage " + antalCookies + " cookies, skal du bruge " + totalMel + " gram mel.");

        scanner.close();
    }
}
