package me.kevensouza.maratonajava.lambdas.consumer78.one;

import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        List<String> names = List.of("Keven", "Souza");
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        printEachValue(names, System.out::println);
        printEachValue(numbers, System.out::println);

    }

    private static <T> void printEachValue(List<T> list, Consumer<T> consumer) {
        for (T e : list) {
            consumer.accept(e);
        }
    }
}

//@FunctionalInterface
//interface ListConsumer<T> {
//    void accept(T t);
//}
