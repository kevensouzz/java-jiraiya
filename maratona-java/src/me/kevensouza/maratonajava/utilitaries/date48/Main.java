package me.kevensouza.maratonajava.utilitaries.date48;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date data = new Date();
        System.out.println(data.toInstant());
        System.out.println(data);
    }
}
