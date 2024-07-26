package me.kevensouza.maratonajava.collections.list66.two;

import me.kevensouza.maratonajava.collections.list66.two.domain.Smartphone;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Smartphone smartphone1 = new Smartphone("1A2B3C", "Samsung");
        Smartphone smartphone3 = new Smartphone("2B4C6D", "Xiaomi");
        Smartphone smartphone2 = new Smartphone("3B6C9D", "Iphone");

        List<Smartphone> smartphones = new ArrayList<>();
        smartphones.add(smartphone1);
        smartphones.add(smartphone2);
        smartphones.add(smartphone3);

        for (Smartphone smartphone : smartphones) {
            System.out.println(smartphone);
        }
    }
}
