package me.kevensouza.maratonajava.optional.one;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner nameScan = new Scanner(System.in);

        System.out.print("Enter a name: ");
        String name = nameScan.nextLine();

        System.out.println("Name exists: " + findName(name).get());
    }

    private static Optional<Boolean> findName(String name) {
        List<String> names = List.of("Keven", "Souza", "Java");
        return Optional.of(names.contains(name));
    }
}
