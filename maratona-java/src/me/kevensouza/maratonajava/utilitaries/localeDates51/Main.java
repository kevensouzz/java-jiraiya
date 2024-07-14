package me.kevensouza.maratonajava.utilitaries.localeDates51;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale brazilLocale = new Locale("pt", "BR");

//        System.out.println(brazilLocale.getDisplayLanguage());
//        System.out.println(brazilLocale.getDisplayCountry());

        Calendar calendar = Calendar.getInstance();

        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.LONG, brazilLocale);

        System.out.println(dateFormat.format(calendar.getTime()));
    }
}
