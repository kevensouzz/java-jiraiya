package me.kevensouza.maratonajava.collections.listArrConversion68;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(10);
        integerList.add(20);
        integerList.add(30);

        System.out.println("integer list" + integerList);
        System.out.println();

        Integer[] integerListToArray = integerList.toArray(new Integer[integerList.size()]);
        System.out.println("integer list to array" + Arrays.toString(integerListToArray));
        System.out.println();

        integerList.add(40);

        System.out.println(integerList);
        System.out.println(Arrays.toString(integerListToArray));

        System.out.println("\n\n\n");

        Integer[] integerArray = new Integer[]{10, 20, 30};
        System.out.println("integer array" + Arrays.toString(integerArray));
        System.out.println();

        List<Integer> integerArrayToList = new ArrayList<>(Arrays.asList(integerArray));
        integerArrayToList.add(40);
        System.out.println("integer array to list" + integerArrayToList);
        integerArrayToList = List.of(integerArray);
        System.out.println("integer array to list" + integerArrayToList);
    }
}
