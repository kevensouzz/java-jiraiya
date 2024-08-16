package me.kevensouza.maratonajava.streams.LightNovel80.semStream;

import me.kevensouza.maratonajava.streams.LightNovel80.model.LightNovel;

import java.util.ArrayList;
import java.util.List;

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

        // 1 - order by alphabetical
        lightNovels.sort((a, b) -> a.getTitle().compareTo(b.getTitle()));

        // 2 - retrieve the first three light novels with price less or equal than 70
        List<LightNovel> filteredLightNovel = new ArrayList<>();
        lightNovels.forEach((lightNovel) -> {
            if (lightNovel.getPrice() <= 70 && filteredLightNovel.size() < 3) {
                filteredLightNovel.add(lightNovel);
            }
        });

        filteredLightNovel.forEach(System.out::println);
    }
}
