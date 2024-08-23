package me.kevensouza.maratonajava.streams.grouping83.one;

import me.kevensouza.maratonajava.streams.collectors82.two.model.LightNovel;
import me.kevensouza.maratonajava.streams.collectors82.two.model.enums.Category;
import me.kevensouza.maratonajava.streams.grouping83.model.enums.Promotion;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.groupingBy;
import static me.kevensouza.maratonajava.streams.grouping83.model.enums.Promotion.*;

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

    private static Map<Category, Map<Promotion, List<LightNovel>>> groupingLightNovelsByCategoryAndPromotion(List<LightNovel> list) {
        return list.stream().collect(groupingBy(LightNovel::getCategory, groupingBy(lightNovel ->
                lightNovel.getPrice() > 60 ? NORMAL_PRICE : UNDER_PROMOTION
        )));
    }

    public static void main(String[] args) {
        Map<Category, Map<Promotion, List<LightNovel>>> groupingLightNovels = groupingLightNovelsByCategoryAndPromotion(lightNovels);
        System.out.println(groupingLightNovels);
    }
}
