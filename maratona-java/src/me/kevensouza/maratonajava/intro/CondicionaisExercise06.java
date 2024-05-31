package me.kevensouza.maratonajava.intro;

public class CondicionaisExercise06 {
    public static void main(String[] args) {
        float taxableincome = 60.000F;
        float taxPerBracket;

        if (taxableincome < 34.713F) {
            taxPerBracket = 9.70F;
        } else if (taxableincome > 34.712F && taxableincome < 68.508F) {
            taxPerBracket = 37.35F;
        } else {
            taxPerBracket = 49.50F;
        }

        System.out.printf("Taxable Income: %.2f\nTax Per Bracket: %.2f%", taxableincome, taxPerBracket);
    }
}
