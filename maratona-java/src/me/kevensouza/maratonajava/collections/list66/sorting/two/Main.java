package me.kevensouza.maratonajava.collections.list66.sorting.two;

import me.kevensouza.maratonajava.collections.list66.sorting.two.model.User;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User(2L, "Junior", "23456789"));
        users.add(new User(1L, "Keven", "12345678"));

        users.sort(new CompareUserByUsername());
        users.forEach(System.out::println);
    }
}

class CompareUserByUsername implements Comparator<User> {
    @Override
    public int compare(User o1, User o2) {
        return o1.getUsername().compareTo(o2.getUsername());
    }
}
