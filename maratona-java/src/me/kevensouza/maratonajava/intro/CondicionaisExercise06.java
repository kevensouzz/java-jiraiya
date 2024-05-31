package me.kevensouza.maratonajava.intro;

public class CondicionaisExercise06 {
    public static void main(String[] args) {
        float taxableincome = 40.000F;
        float taxPerBracket;
        float taxValue;

        if (taxableincome < 34.713F) {
            taxPerBracket = 9.70F;
        } else if (taxableincome < 68.508F) {
            taxPerBracket = 37.35F;
        } else {
            taxPerBracket = 49.50F;
        }

        taxValue = (taxPerBracket / 100) * taxableincome;

        System.out.printf("Taxable Income: €%.3f\nTax Per Bracket: %.2f%%\nTax Value: €%.3f", taxableincome, taxPerBracket, taxValue);
    }
}
