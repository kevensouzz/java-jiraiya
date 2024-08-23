package me.kevensouza.maratonajava.streams.grouping83.two;

import me.kevensouza.maratonajava.streams.collectors82.two.model.LightNovel;
import me.kevensouza.maratonajava.streams.collectors82.two.model.enums.Category;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;

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

    public static void main(String[] args) {
        Map<Category, Long> collect1 = lightNovels.stream().collect(groupingBy(LightNovel::getCategory, counting()));

        Map<Category, LightNovel> collect2 = lightNovels.stream()
                .collect(
                        toMap(LightNovel::getCategory, Function.identity(), BinaryOperator.maxBy(Comparator.comparing(LightNovel::getPrice))));
    }
}