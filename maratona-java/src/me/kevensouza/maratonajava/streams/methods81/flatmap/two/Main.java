package me.kevensouza.maratonajava.streams.methods81.flatmap.two;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>(List.of("Gomu", "Gomu", "No", "Mi"));

        List<String> collect = words.stream()
                .map(w -> w.split(""))
                .flatMap(Arrays::stream)
                .collect(Collectors.toList());

        System.out.println(collect);
    }
}
