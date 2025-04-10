package Uge15.ExceptionsLogger;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Indtast første heltal: ");
            int a = scanner.nextInt();

            System.out.print("Indtast andet heltal: ");
            int b = scanner.nextInt();

            if (a == 0 || b == 0) {
                throw new ArithmeticException("Dividering med nul.");
            }

            System.out.println("Det bliver: " + (double) a / b);

        } catch (ArithmeticException e) {
            System.out.println("Fejl: Du må ikke dividere med nul.");
        }
    }
}
