package Uge6;
import java.util.Scanner;
public class HappyToday {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        // Sådan her udskriver jeg en besked til brugeren.
        System.out.println("I👏AM👏HAPPY👏TODAY");
        System.out.print("Skriv en sætning her: ");

        String inputSentence = scanner.nextLine();
        // Sådan får man den til at sætte en emoji imellem hver sætning
        String modifiedSentence = inputSentence.replace(" ", "👏");

        // Sådan sætter du den sammen så den sætter emojien
        System.out.println("Nye sætning: " + modifiedSentence);

        scanner.close();





    }
}
