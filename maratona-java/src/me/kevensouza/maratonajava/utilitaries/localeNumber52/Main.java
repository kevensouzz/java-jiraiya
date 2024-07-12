package me.kevensouza.maratonajava.utilitaries.localeNumber52;

import java.text.NumberFormat;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale BrazilLocale = new Locale("pt", "BR");
        Locale JapanLocale = Locale.JAPAN;

        NumberFormat[] nfa = new NumberFormat[3];

        nfa[0] = NumberFormat.getInstance();
        nfa[1] = NumberFormat.getInstance(BrazilLocale);
        nfa[2] = NumberFormat.getInstance(JapanLocale);

        double value = 10_000.680;

        for (NumberFormat numberFormat : nfa) {
            System.out.println(numberFormat.format(value));
        }
    }
}
