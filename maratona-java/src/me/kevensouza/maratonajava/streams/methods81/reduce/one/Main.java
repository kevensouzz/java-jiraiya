package me.kevensouza.maratonajava.streams.methods81.reduce.one;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(1, 1, 1, 1, 1));

        numbers.stream()
                .reduce(Integer::sum)
                .ifPresent(System.out::println);
    }
}
