package Uge6;

public class CountDownExample {
    public static void main(String[] args) {
//Opgave 1
        int i1 = 1;

        do{
        System.out.println("Hello World");
        ++i1;
        } while (i1<=3);

//Opgave 2
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

//Opgave 3
        for (int i = 0; i < 10; i++) {
            System.out.println("e");
        }

//Opgave 4
        int i2 = 5;
        while (i2 >= -5) {
            System.out.println(i2);
            i2--;
        }

//Opgave 5
        int i3 = 5;
        while (i3 <= 30) {
            System.out.println(i3);
            i3 += 3;
        }

//Opgave 6
        /*
        int count = 10;
        while (count >= 0) {
        System.out.println("Countdown: " + count);
                }
        System.out.println("Finished running loop!");
        // Den printer uendeligt, da den ikke har et stop

         */

//Opgave 7
        int count = 0;
        int sum = 0;

        do {
            System.out.println("Currrent count is " + count);
            System.out.println("Currrent sum is " + sum);
            sum += count;
            count++;
            } while(count > 0 && count < 10);
        // a. Ja den gør som forventet, da count ikke kan kommer over 10 men s summen godt kan.
        // b. Nej summen er forkert, da summen er blevet sat før print, hvilket gør at den kommer bagud. Counten kommer ikke op til 10 men 9 hvilket den skal.
        // c. Kan ikke finde noget endnu

//Opgave 8
        // a.
        for (int i4 = 2; i4 <= 12; i4 += 2) {
            System.out.println("Tallet er: " + i4);

            }
            // b.
        for (int i5 = 4; i5 <= 79; i5 += 15) {
            System.out.println("Tallet er: " + i5);
            }

            // c.
        for (int i6 = 30; i6 >= -20; i6 -= 10) {
            System.out.println("Tallet er: " + i6);
            }

            // d.
        for (int i7 = -7; i7 <= 13; i7 += 4) {
            System.out.println("Tallet er: " + i7);
            }

            // e.
        for (int i8 = 97; i8 >= 82; i8 -= 3) {
            System.out.println("Tallet er: " + i8);
            }

//Opgave 9
        // for (int i = 1; i <= 3; i++) { // Ydre loop
        //for (int j = 1; j <= 2; j++) { // Indre loop
        //System.out.println("i = " + i + ", j = " + j);

        for (int i = 3; i >= 0; i--) { // Ydre loop
        for (int j = 0; j <= 2; j++) { // Indre loop
            System.out.println("i = " + i + ", j = " + j);
            }
        // a. i stiger med 1 hver anden gang og j stiger med en og falder med en hver gang.
        // b. Den bliver printet 6 gange i konsollen.
        // c. Kig i a.
        // d. Den er lavet
}
    }}

