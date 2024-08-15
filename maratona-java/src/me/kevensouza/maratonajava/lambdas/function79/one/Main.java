package me.kevensouza.maratonajava.lambdas.function79.one;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>(List.of("Keven", "João Lima", "Rubem", "João Nascimento", "Carlos", "Willy"));

        System.out.println(map(lista, String::length));
    }

    private static <T, R> List<R> map(List<T> list, Function<T, R> function) {
        List<R> result = new ArrayList<>();

        for (T e : list) {
            R r = function.apply(e);
            result.add(r);
        }

        return result;
    }
}
