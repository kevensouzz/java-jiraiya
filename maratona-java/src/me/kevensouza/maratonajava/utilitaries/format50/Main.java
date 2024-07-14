package me.kevensouza.maratonajava.utilitaries.format50;

import java.text.DateFormat;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        DateFormat[] df = new DateFormat[7];

        df[0] = DateFormat.getInstance();
        df[1] = DateFormat.getDateInstance();
//        df[0] = new SimpleDateFormat("dd/MM/yyyy");
//        df[1] = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        df[2] = DateFormat.getDateTimeInstance();
        df[4] = DateFormat.getDateInstance(DateFormat.SHORT);
        df[5] = DateFormat.getDateInstance(DateFormat.MEDIUM);
        df[6] = DateFormat.getDateInstance(DateFormat.LONG);
        df[3] = DateFormat.getDateInstance(DateFormat.FULL);

        for (DateFormat dateFormat : df) {
            System.out.println(dateFormat.format(calendar.getTime()));
        }
    }
}
