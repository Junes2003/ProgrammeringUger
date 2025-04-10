package Uge5;
import java.util.Scanner;
public class WhileLoop {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int runAgain = 0;

        do{

            System.out.println("Enter the first number");
            double number1 = scanner.nextDouble();

            System.out.println("Enter the second number");
            double number2 = scanner.nextDouble();


            double sum = number1 + number2;
            System.out.println("The system is" + sum);

            System.out.println("Would you start over? Enter 1 for yes, 2 for no.");
            runAgain = scanner.nextInt();


        }while(runAgain ==1);





    }

}
