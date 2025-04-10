package Uge8;

import java.util.Arrays;

public class ArrayClassExercise {
    public static void main(String[] args) {
        int x = 0;
        int[] arr1 = {9, 5, 1, 8, 3, 2, 7, 4, 6};
        System.out.println("Før sortering" + Arrays.toString(arr1));

        Arrays.sort(arr1);
        System.out.println("Efter sortering" + Arrays.toString(arr1));

        int[] arr2 = {1, 2, 3, 4, 5, 6, 7 , 8 , 9};
        boolean erEns = Arrays.equals(arr1, arr2);
        System.out.println("Er de to ens?" + erEns);


    }
}
