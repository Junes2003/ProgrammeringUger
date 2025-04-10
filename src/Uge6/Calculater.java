package Uge6;
public class Calculater {

    // Metoden til at sætter jeg to tal sammen.
    public static int add(int a, int b) {
        return a + b;
    }

    // Metoden til at minus de to tal
    public static int subtract(int a, int b) {
        return a - b;
    }

    // Metoden til at gange to tal sammen
    public static int multiply(int a, int b) {
        return a * b;
    }

    // Metoden til at dividere de to tal
    public static int divide(int a, int b) {
        if (b == 0) {
            System.out.println("Fejl: Kan ikke dividere med 0!");
            return 0; // Returner 0 hvis divisionen ikke kan udføres
        }
        return a / b;
    }

    public static void main(String[] args) {
        // Sådan her tester man metoderne
        int num1 = 10;
        int num2 = 2;

        System.out.println("Addition: " + add(num1, num2));
        System.out.println("Subtraktion: " + subtract(num1, num2));
        System.out.println("Multiplikation: " + multiply(num1, num2));
        System.out.println("Division: " + divide(num1, num2));

        // Test af division med 0
        System.out.println("Division med 0: " + divide(num1, 0));
    }
}





