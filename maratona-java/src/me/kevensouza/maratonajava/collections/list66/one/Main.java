package me.kevensouza.maratonajava.collections.list66.one;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("Keven");
        nomes.add("Souza");

        for (String nome : nomes) {
            System.out.print(nome);
            System.out.print(" ");
        }

        System.out.println();

        for (int i = 0; i < nomes.size(); i++) {
            System.out.print(nomes.get(i));
            System.out.print(" ");
        }
    }
}
