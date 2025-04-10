package Uge7;
import java.util.Scanner;
public class PaswoordChecker {

    public static void main(String[] args) {
        // Sådan her opretter man en scanner til at læse input fra brugeren.
        Scanner scanner = new Scanner(System.in);

        // Her ber jeg brugeren om at indtaste et password.
        System.out.print("Indtast et password: ");
        String password = scanner.nextLine();

        // Sådan her tjekker jeg om passwordet er gyldigt og at jeg kalder metoden isValidPassword
        if (isValidPassword(password)) {
            System.out.println("Passwordet er sikkert.");
        } else {
            System.out.println("Passwordet er ikke sikkert.");
        }

        // Her lukker jeg scanner
        scanner.close();
    }

    // Det sådan man får metoden til at tjekke om at passwordet er sikkert
    public static boolean isValidPassword(String password) {
        // Her tjekker jeg om passwordet er mindst 8 tegn langt
        if (password.length() < 8) {
            return false;
        }

        // Her tjekker jeg om passwordet indeholder mellemrum
        if (password.contains(" ")) {
            return false;
        }

        // Her tjekker jeg om passwordet indeholder de forbudte ord
        if (password.toLowerCase().contains("secret") || password.toLowerCase().contains("qwerty")) {
            return false;
        }

        // HEr tjekker jeg om passwordet kun indeholder bogstaver og tal
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (!Character.isLetterOrDigit(c)) {
                return false;
            }
        }

        // Og hvis alle betingelser bliver opfyldt så returnerer vi true
        return true;

    }
}