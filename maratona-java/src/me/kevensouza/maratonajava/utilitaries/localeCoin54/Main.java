package me.kevensouza.maratonajava.utilitaries.localeCoin54;

import java.text.NumberFormat;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale BrazilLocale = new Locale("pt", "BR");
        Locale JapanLocale = Locale.JAPAN;
        Locale CanadaLocale = Locale.CANADA;

        NumberFormat[] numberFormats = new NumberFormat[3];
        numberFormats[0] = NumberFormat.getCurrencyInstance(BrazilLocale);
        numberFormats[1] = NumberFormat.getCurrencyInstance(JapanLocale);
        numberFormats[2] = NumberFormat.getCurrencyInstance(CanadaLocale);

        double value = 10_000;

        for (NumberFormat numberFormat : numberFormats) {
            System.out.print(numberFormat.format(value) + " | ");
            System.out.println(numberFormat.getCurrency());
        }
    }
}
