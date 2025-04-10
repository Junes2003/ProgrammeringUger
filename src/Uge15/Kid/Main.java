package Uge15.Kid;
import Uge15.CarsSortetByPlate.Kids;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Kids> Kids = new ArrayList<>();

        Kids kids1 = new Kids("Alan 75");
        Kids kids2 = new Kids("Junes 11");
        Kids kids3 = new Kids("Tis 24");
        Kids kids4 = new Kids("Prut 54");

        Kids.add(kids1);
        Kids.add(kids2);
        Kids.add(kids3);
        Kids.add(kids4);

        ArrayList kids = null;
        kids.sort(new Comparator<Kid>() {
            @Override
            public int compare(Kid o1, Kid o2) {
                return Integer.compare(o1.getHeightInCm(), o2.getHeightInCm());
            }
        });

        Kid shortest = (Kid) kids.get(0);
        Kid tallest = (Kid) kids.get(kids.size() - 1);

        System.out.println("Laveste barn: " + shortest);
        System.out.println("Højeste barn: " + tallest);
    }
}

