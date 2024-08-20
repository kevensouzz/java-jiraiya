package me.kevensouza.maratonajava.streams.collectors82.one;

import me.kevensouza.maratonajava.streams.LightNovel80.model.LightNovel;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

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
        DoubleSummaryStatistics summaryStatistics = lightNovels.stream().collect(Collectors.summarizingDouble(LightNovel::getPrice));
        System.out.println(summaryStatistics);

        String titlesJoining = lightNovels.stream().map(LightNovel::getTitle).collect(Collectors.joining(", "));
        System.out.println(titlesJoining);
    }
}
