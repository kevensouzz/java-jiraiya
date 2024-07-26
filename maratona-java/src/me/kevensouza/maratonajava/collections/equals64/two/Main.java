package me.kevensouza.maratonajava.collections.equals64.two;

import me.kevensouza.maratonajava.collections.equals64.two.domain.User;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("User1", "123");
        User user2 = new User("User1", "123");

        System.out.println(user1.equals(user2));
    }
}
