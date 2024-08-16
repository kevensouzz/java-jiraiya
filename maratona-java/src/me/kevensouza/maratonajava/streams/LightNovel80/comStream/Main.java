package me.kevensouza.maratonajava.streams.LightNovel80.comStream;

import me.kevensouza.maratonajava.streams.LightNovel80.model.LightNovel;

import java.util.ArrayList;
import java.util.List;

// 1 - order by alphabetical
// 2 - retrieve the first three light novels with price less than 70
public class Main {
    public static void main(String[] args) {
        List<LightNovel> lightNovels = new ArrayList<>(List.of(
                new LightNovel("The Mirror Legacy", 80.0),
                new LightNovel("My Longevity Simulataion", 60.0),
                new LightNovel("The First Legendary Beast Master", 100.0),
                new LightNovel("A Soldier's Life", 50.0),
                new LightNovel("Adopting Disaster", 65.0),
                new LightNovel("Genius Wizard Takes Medicine", 70.0)
        ));

        lightNovels.stream()
                // 1 - order by alphabetical
                .sorted((a, b) -> a.getTitle().compareTo(b.getTitle()))
                // 2 - retrieve the first three light novels with price less or equal than 70
                .filter(lightNovel -> lightNovel.getPrice() <= 70)
                .limit(3)
                .forEach(System.out::println);
    }
}
