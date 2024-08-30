package me.kevensouza.maratonajava.ADesignPatterns.BSingleton.AEagerInitialization;

import me.kevensouza.maratonajava.ADesignPatterns.BSingleton.AEagerInitialization.model.Aircraft;

public class Main {
    public static void main(String[] args) {
        bookSeat("A1");
        bookSeat("A1");
    }

    private static void bookSeat(String seat) {
        Aircraft aircraft = Aircraft.getInstance();
        System.out.println(aircraft.bookSeat(seat));
    }
}
