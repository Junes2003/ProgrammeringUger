package ObligatoriskeOpgaver;
import java.util.Random;
import java.util.Scanner;
public class MrGreenOriginal {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    // Her spørger jeg brugeren om de vil spille
    System.out.println("Velkommen til Blackjack Dice Game!");
    System.out.print("Vil du spille? Skriv 'klar' for at starte: ");
    String startGame = scanner.nextLine().toLowerCase();

    // Hvis brugeren ikke skriver klar så slutter spillet
    if (!startGame.equals("klar")) {
        System.out.println("Du valgte ikke at spille. SES taber!");
        return;
    }

    // Sådan her får man spillet til at begynde
    while (true) {
    int userSum = 0;
    int machineSum = 0;

    // Sådam får man brugeren til at kaste
    while (true) {
    // Sådan her får brugeren kastet to terninger
    int throw1 = random.nextInt(6) + 1;
    int throw2 = random.nextInt(6) + 1;
    userSum += throw1 + throw2;
        System.out.println("Du kastede: " + throw1 + " og " + throw2 + " (Sum: " + userSum + ")");

    // Tjek om brugeren har ramt 21
    if (userSum == 21) {
        System.out.println("Tillykke! Du har Black Jack og vinder skejs!");
        break; // Brugeren har vundet
    }

    // Tjek om brugeren har overskredet 21
    if (userSum > 21) {
        System.out.println("Desværre, du har overskredet 21. Du taber!");
        break; // Brugeren har overskredet 21, de taber
    }

    // Få brugeren til at vælge "hit" eller "stand"
    String input;
    while (true) {
        System.out.print("Vil du 'hit' eller 'stand'? ");
        input = scanner.nextLine().toLowerCase();
    if (input.equals("hit") || input.equals("stand")) {
        break;
    } else {
        System.out.println("Læs ordentligt! Skriv kun 'hit' eller 'stand'.");
    }
    }
    if (input.equals("stand")) {
        break; // Brugeren vælger at stå, maskinen kaster nu
    }
    }

    // Når brugeren rammer 21 så skal maskinen stoppe
    if (userSum == 21) {
        break; // Brugeren har allerede vundet, spillet stopper
    }


    // Sådan her får jeg maskinen til at fortsætte med at kaste indtil den når op på 16 eller højere
    while (machineSum < 17) {
    int throw1 = random.nextInt(6) + 1;
    int throw2 = random.nextInt(6) + 1;
    machineSum += throw1 + throw2;
        System.out.println("Maskinen kastede: " + throw1 + " og " + throw2 + " (Sum: " + machineSum + ")");
    }

    // Sådan her tjekkker man om maskinen overskrider 21
    if (machineSum > 21) {
        System.out.println("Maskinen overskred 21. Du vinder!");
        break; // Her taber maskinen og brugeren vinder
    }

    // Sådan her får man resultaterne ud
        System.out.println("\n=== RESULTAT ===");
        System.out.println("Din sum: " + userSum);
        System.out.println("Maskinens sum: " + machineSum);

    // Her bliver vinderen bestemt
    if (userSum > machineSum) {
        System.out.println("Du vinder! Din sum (" + userSum + ") er højere end maskinens (" + machineSum + ").");
    } else if (machineSum > userSum) {
        System.out.println("Maskinen vinder! Dens sum (" + machineSum + ") er højere end din (" + userSum + ").");
    } else {
        System.out.println("Uafgjort! Begge har samme sum.");
    }

    // Her spørger jeg om brugeren vil spille igen
        System.out.print("\nVil du spille igen? (ja/nej): ");
        String playAgain = scanner.nextLine().toLowerCase();
    if (playAgain.equals("nej")) {
        System.out.println("Tak for at spille!");
        break;
    }
    }
}
}
