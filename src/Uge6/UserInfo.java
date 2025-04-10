package Uge6;

import java.util.Scanner;
public class UserInfo {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        System.out.println("Skriv dit navn");
        String sentence = scanner.nextLine();

        System.out.println("Skriv din yndlingsfarve");
        String color = scanner.next();

        System.out.println("Det her er: " + sentence + " " + "Din yndlingsfarve er: " + color);



    }

}
