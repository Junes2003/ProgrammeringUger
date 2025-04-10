package Uge7;
import java.util.Scanner;
public class Trafiklys {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Indtast farven (rød, gul eller grøn): ");
        String farve = scanner.nextLine().toLowerCase();

        boolean detSikkert = false;

        switch (farve) {
            case "rød":
                System.out.println("Stop");
                detSikkert = false;
                break;
            case "gul":
                System.out.println("Vent");
                detSikkert = false;
                break;
            case "grøn":
                System.out.println("Gå");
                detSikkert = true;
                break;
            default:
                System.out.println("Ugyldigt input. Brug 'rød', 'gul' eller 'grøn'.");
                return;
        }

    }
}