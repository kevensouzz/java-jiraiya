package me.kevensouza.maratonajava.ADesignPatterns.ABuilder.A;

import me.kevensouza.maratonajava.ADesignPatterns.ABuilder.A.model.Person;

public class Main {
    public static void main(String[] args) {
        Person killua_zoldyck = new Person.Builder()
                .name("Killua Zoldyck")
                .email("killuadelas2012@hotmail.com")
                .age((short) 12)
                .build();
    }
}
