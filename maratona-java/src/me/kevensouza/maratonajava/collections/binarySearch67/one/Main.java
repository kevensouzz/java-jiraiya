package me.kevensouza.maratonajava.collections.binarySearch67.one;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(0);
        nums.add(2);
        nums.add(4);
        nums.add(6);

        Collections.sort(nums);

        System.out.println(Collections.binarySearch(nums, 1));
    }
}
