package me.kevensouza.maratonajava.collections.iterator69.one;

import me.kevensouza.maratonajava.collections.iterator69.one.model.Clothing;
import me.kevensouza.maratonajava.collections.iterator69.one.model.enums.Brand;
import me.kevensouza.maratonajava.collections.iterator69.one.model.enums.ClothingType;
import me.kevensouza.maratonajava.collections.iterator69.one.model.enums.Sizes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Clothing nikeShirtSW = new Clothing(ClothingType.SHIRT, Brand.NIKE, 90.0, (short) 13, Sizes.SMALL, Sizes.MEDIUM, Sizes.LARGE);
        Clothing pumaShirtSW = new Clothing(ClothingType.SHIRT, Brand.PUMA, 75.0, (short) 8, Sizes.MEDIUM, Sizes.LARGE, Sizes.EXTRA_LARGE);

        List<Clothing> clothingList = new ArrayList<>(List.of(nikeShirtSW, pumaShirtSW));

        Iterator<Clothing> iterator = clothingList.iterator();

        while (iterator.hasNext()) {
            Clothing clothing = iterator.next();
            clothingList.removeIf(c -> !c.getAvailableSizes().contains(Sizes.SMALL));
        }

//        for (Clothing clothing : clothingList) {
//            clothingList.removeIf(c -> !c.getAvailableSizes().contains(Sizes.SMALL));
//        }

        System.out.println(clothingList);
    }
}
