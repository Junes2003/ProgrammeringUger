package Uge7;

import java.util.Random;
public class Terningkast {
    public static int getDieRoll() {
        Random random = new Random();
        return random.nextInt(6) + 1;
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            int roll = getDieRoll();
            System.out.println("Terningkast " + i + ": " + roll);
        }
    }







}
