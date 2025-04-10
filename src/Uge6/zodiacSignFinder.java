package Uge6;

import java.util.Scanner;
public class zodiacSignFinder {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hvilken måned er du født i?");
        int måned = scanner.nextInt();

        System.out.println("Hvilken dato er du født i?");
        int dato = scanner.nextInt();

        String zodiacSign = "";
        if ((måned == 3 && dato >= 21) || (måned == 4 && dato <= 19)) {
            zodiacSign = "Vædderen";
        } else if ((måned == 4 && dato >= 20) || (måned == 5 && dato <= 20)) {
            zodiacSign = "Tyren";
        } else if ((måned == 5 && dato >= 21) || (måned == 6 && dato <= 20)) {
            zodiacSign = "Tvillingerne";
        } else if ((måned == 6 && dato >= 21) || (måned == 7 && dato <= 22)) {
            zodiacSign = "Krebsen";
        } else if ((måned == 7 && dato >= 23) || (måned == 8 && dato <= 22)) {
            zodiacSign = "Løven";
        } else if ((måned == 8 && dato >= 23) || (måned == 9 && dato <= 22)) {
            zodiacSign = "Jomfruen";
        } else if ((måned == 9 && dato >= 23) || (måned == 10 && dato <= 22)) {
            zodiacSign = "Vægten";
        } else if ((måned == 10 && dato >= 23) || (måned == 11 && dato <= 21)) {
            zodiacSign = "Skorpionen";
        } else if ((måned == 11 && dato >= 22) || (måned == 12 && dato <= 21)) {
            zodiacSign = "Skytten";
        } else if ((måned == 12 && dato >= 22) || (måned == 1 && dato <= 19)) {
            zodiacSign = "Stenbukken";
        } else if ((måned == 1 && dato >= 20) || (måned == 2 && dato <= 18)) {
            zodiacSign = "Vandmanden";
        } else if ((måned == 2 && dato >= 19) || (måned == 3 && dato <= 20)) {
            zodiacSign = "Fiskene";

            System.out.println("Dit stjernetegn er: " + zodiacSign);

            scanner.close();
    }
    }
}
