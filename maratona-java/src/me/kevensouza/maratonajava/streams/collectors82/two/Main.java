package me.kevensouza.maratonajava.streams.collectors82.two;

import me.kevensouza.maratonajava.streams.collectors82.two.model.LightNovel;
import me.kevensouza.maratonajava.streams.collectors82.two.model.enums.Category;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("The Mirror Legacy", 80.0, Category.FANTASY),
            new LightNovel("My Longevity Simulataion", 60.0, Category.DRAMA),
            new LightNovel("The First Legendary Beast Master", 100.0, Category.FANTASY),
            new LightNovel("A Soldier's Life", 50.0, Category.DRAMA),
            new LightNovel("Adopting Disaster", 65.0, Category.FANTASY),
            new LightNovel("Genius Wizard Takes Medicine", 70.0, Category.FANTASY),
            new LightNovel("Monogatari", 50.0, Category.ROMANCE)
    ));

    // without streams
    private static void groupWithoutStreams(Map<Category, List<LightNovel>> groupByCategory) {
        List<LightNovel> fantasyLightNovels = new ArrayList<>();
        List<LightNovel> dramaLightNovels = new ArrayList<>();
        List<LightNovel> romanceLightNovels = new ArrayList<>();

        for (LightNovel lightNovel : lightNovels) {
            switch (lightNovel.getCategory()) {
                case FANTASY:
                    fantasyLightNovels.add(lightNovel);
                    break;

                case DRAMA:
                    dramaLightNovels.add(lightNovel);
                    break;

                case ROMANCE:
                    romanceLightNovels.add(lightNovel);
                    break;
            }
        }

        groupByCategory.put(Category.FANTASY, fantasyLightNovels);
        groupByCategory.put(Category.DRAMA, dramaLightNovels);
        groupByCategory.put(Category.ROMANCE, romanceLightNovels);
    }

    private static void groupWithStreams(Map<Category, List<LightNovel>> groupByCategory) {
        groupByCategory = lightNovels.stream().collect(Collectors.groupingBy(LightNovel::getCategory));
    }

    public static void main(String[] args) {
        Map<Category, List<LightNovel>> groupByCategory = new HashMap<>();
//        groupWithoutStreams(groupByCategory);
        groupWithStreams(groupByCategory);
        System.out.println(groupByCategory);
    }
}
