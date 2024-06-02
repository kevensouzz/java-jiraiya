package me.kevensouza.maratonajava.intro;

public class ArraysMultidimensionais14 {
    public static void main(String[] args) {
        int[][] arrayInt = new int[3][];

        for (int i = 0; i < arrayInt.length; i++) {
            arrayInt[i] = new int[(int) (Math.random() * 10)];

            for (int j = 0; j < arrayInt[i].length; j++) {
                arrayInt[i][j] = (int) (Math.random() * 10);
            }
        }

        for (int[] arrayIntBase : arrayInt) {
            for (int inteiro : arrayIntBase) {
                System.out.println(inteiro);
            }
        }
    }
}
