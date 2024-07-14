package me.kevensouza.maratonajava.utilitaries.simpleDateFormat55;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss EE dd/MMM/yyyy ");

        Calendar calendar = Calendar.getInstance();

        System.out.println(sdf.format(calendar.getTime()));
    }
}
