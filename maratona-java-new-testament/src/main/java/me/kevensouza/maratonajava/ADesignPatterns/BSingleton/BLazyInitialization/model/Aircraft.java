package me.kevensouza.maratonajava.ADesignPatterns.BSingleton.BLazyInitialization.model;

import java.util.HashSet;
import java.util.Set;

public final class Aircraft {
    private static Aircraft INSTANCE;
    private final Set<String> availableSeats = new HashSet<>();
    private final String name;

    private Aircraft(String name) {
        this.name = name;
    }

    {
        availableSeats.add("A1");
        availableSeats.add("B1");
        availableSeats.add("C1");
    }

    public boolean bookSeat(String seat) {
        return availableSeats.remove(seat);
    }

    public static Aircraft getInstance() {

        if (INSTANCE == null) {
            synchronized (Aircraft.class) {
                if (INSTANCE == null) {
                    INSTANCE = new Aircraft("737-900");
                }
            }
        }

        return INSTANCE;
    }

    public Set<String> getAvailableSeats() {
        return availableSeats;
    }

    public String getName() {
        return name;
    }
}
