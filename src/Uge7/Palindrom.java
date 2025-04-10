package Uge7;
import java.util.Scanner;
public class Palindrom {

    public static void main(String[] args) {
        // Sådan her opretter man en scanner til at læse input fra brugeren.
        Scanner scanner = new Scanner(System.in);

        // Sådan her beder jegbrugeren om at indtaste en streng
        System.out.print("Indtast en streng: ");
        String input = scanner.nextLine();

        // Sådam her fjerner jeg mellemrum og konverterer til små bogstaver
        input = input.replaceAll("\\s+", "").toLowerCase();

        // Her tjekker jeg om det er et palindrom og kalder metoden isPalindrome
        if (isPalindrome(input)) {
            System.out.println("Strengen er et palindrom.");
        } else {
            System.out.println("Strengen er ikke et palindrom.");
        }

        // Her lukker jeg scanner
        scanner.close();
    }

    // Det her er en metode der tjekker om strengen er et palindrom
    public static boolean isPalindrome(String input) {
        // Her opretter jeg en StringBuilder for at bygge den omvente streng
        StringBuilder reversed = new StringBuilder();

        //Her bygger jeg den omvente streng
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed.append(input.charAt(i));
        }

        // Sådan her tjekker jeg om at den opritleige streng er som den omvendte vesion.
        return input.equals(reversed.toString());
    }
}
