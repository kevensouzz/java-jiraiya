package me.kevensouza.maratonajava.exceptions.runtimeexception41;

public class Main {
    public static void main(String[] args) {
        // unchecked | RuntimeException

        // ArrayIndexOutOfBoundsException
        int[] nums = {1, 2};
        System.out.println(nums[2]);

        // NullPointerException
        Object obj = null;
        System.out.println(obj.toString());
    }
}
