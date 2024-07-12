package me.kevensouza.maratonajava.utilitaries.localeCountries51;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        System.out.print("Countries: ");
        for (String isoCountry : Locale.getISOCountries()) {
            System.out.print(isoCountry + " ");
        }

        System.out.println();


        System.out.print("Languages: ");
        for (String isoLanguage : Locale.getISOLanguages()) {
            System.out.print(isoLanguage + " ");
        }
    }
}
