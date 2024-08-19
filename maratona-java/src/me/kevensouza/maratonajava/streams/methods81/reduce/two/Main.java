package me.kevensouza.maratonajava.streams.methods81.reduce.two;

import me.kevensouza.maratonajava.streams.LightNovel80.model.LightNovel;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Main {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("The Mirror Legacy", 80.0),
            new LightNovel("My Longevity Simulataion", 60.0),
            new LightNovel("The First Legendary Beast Master", 100.0),
            new LightNovel("A Soldier's Life", 50.0),
            new LightNovel("Adopting Disaster", 65.0),
            new LightNovel("Genius Wizard Takes Medicine", 70.0)
    ));

    public static void main(String[] args) {
        lightNovels.stream()
                .map(LightNovel::getPrice)
                .filter(price -> price > 70)
                .reduce(Double::sum)
                .ifPresent(System.out::println);

    }
}
