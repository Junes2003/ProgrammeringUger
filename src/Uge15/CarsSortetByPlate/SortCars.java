package Uge15.CarsSortetByPlate;

import java.util.ArrayList;
import java.util.Collections;

public class SortCars {
    public static void main(String[] args) {
        ArrayList<Kids> numberplate = new ArrayList<>();
        Kids kids1 = new Kids("alan 99");
        Kids kids2 = new Kids("Junes 92");
        Kids kids3 = new Kids("Junes 92");

        numberplate.add(kids1);
        numberplate.add(kids2);
        numberplate.add(kids3);

        System.out.println("Før sortering: " + numberplate);

        Collections.sort(numberplate);
        System.out.println("Efter sortering: " + numberplate);

        Collections.reverse(numberplate);
        System.out.println("Efter reverse: " + numberplate);
    }
}