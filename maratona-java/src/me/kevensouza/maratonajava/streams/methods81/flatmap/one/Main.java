package me.kevensouza.maratonajava.streams.methods81.flatmap.one;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<List<String>> stringsLists = new ArrayList<>(List.of(List.of("Keven Souza", "Roberto Souza"), List.of("Ana Santos", "Robertos Santos")));

        stringsLists.stream()
                .flatMap(Collection::stream)
                .forEach(s -> System.out.println(s.toLowerCase()));
    }
}
