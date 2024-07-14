package me.kevensouza.maratonajava.utilitaries.strings47;

public class Main {
    public static void main(String[] args) {
        long init = System.currentTimeMillis();
        concatStrings(50_000);
        long end = System.currentTimeMillis();
        System.out.println((end - init) + "ms");

        init = System.currentTimeMillis();
        concatStringsWithBuilder(100_000);
        end = System.currentTimeMillis();
        System.out.println((end - init) + "ms");

        init = System.currentTimeMillis();
        concatStringsWithBuffer(100_000);
        end = System.currentTimeMillis();
        System.out.println((end - init) + "ms");
    }

    public static void concatStrings(int length) {
        String text = "";
        for (int i = 0; i < length; i++) {
            text += i;
        }
    }

    public static void concatStringsWithBuilder(int length) {
        StringBuilder text = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            text.append(i);
        }
    }

    public static void concatStringsWithBuffer(int length) {
        StringBuffer text = new StringBuffer(length);
        for (int i = 0; i < length; i++) {
            text.append(i);
        }
    }
}
