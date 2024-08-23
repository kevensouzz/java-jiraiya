package me.kevensouza.maratonajava.streams.grouping83.three;

import me.kevensouza.maratonajava.streams.collectors82.two.model.LightNovel;
import me.kevensouza.maratonajava.streams.collectors82.two.model.enums.Category;
import me.kevensouza.maratonajava.streams.grouping83.model.enums.Promotion;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

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

    private static Promotion getPromotion(LightNovel lightNovel) {
        return lightNovel.getPrice() > 60 ? Promotion.NORMAL_PRICE : Promotion.UNDER_PROMOTION;
    }

    public static void main(String[] args) {
        Map<Category, DoubleSummaryStatistics> collect1 = lightNovels.stream()
                .collect(groupingBy(LightNovel::getCategory, summarizingDouble(LightNovel::getPrice)));

        Map<Category, Set<Promotion>> collect2 = lightNovels.stream()
                .collect(groupingBy(LightNovel::getCategory, mapping(Main::getPromotion, toSet())));

        System.out.println(collect2);
    }
}