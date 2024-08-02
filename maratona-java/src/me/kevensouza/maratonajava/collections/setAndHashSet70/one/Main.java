package me.kevensouza.maratonajava.collections.setAndHashSet70.one;

import me.kevensouza.maratonajava.collections.iterator69.one.model.Clothing;
import me.kevensouza.maratonajava.collections.iterator69.one.model.enums.Brand;
import me.kevensouza.maratonajava.collections.iterator69.one.model.enums.ClothingType;
import me.kevensouza.maratonajava.collections.iterator69.one.model.enums.Sizes;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Clothing nikeSportswearDownInsulated = new Clothing(ClothingType.JACKET, Brand.NIKE, 299.90, (short) 10, Sizes.SMALL, Sizes.MEDIUM);
        Clothing nikeShirtSW = new Clothing(ClothingType.SHIRT, Brand.NIKE, 90.0, (short) 13, Sizes.SMALL, Sizes.MEDIUM, Sizes.LARGE);
        Clothing pumaShirtSW = new Clothing(ClothingType.SHIRT, Brand.PUMA, 75.0, (short) 8, Sizes.MEDIUM, Sizes.LARGE, Sizes.EXTRA_LARGE);

        Set<Clothing> clothingSet = new LinkedHashSet<>(Set.of(nikeSportswearDownInsulated, nikeShirtSW, pumaShirtSW));

        clothingSet.forEach(System.out::println);
    }
}
