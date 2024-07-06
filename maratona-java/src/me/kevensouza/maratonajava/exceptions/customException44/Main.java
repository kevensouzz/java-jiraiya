package me.kevensouza.maratonajava.exceptions.customException44;

import me.kevensouza.maratonajava.exceptions.customException44.exceptions.InvalidLoginException;
import me.kevensouza.maratonajava.exceptions.customException44.model.User;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your username: ");
        String username = scanner.nextLine();

        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        try {
            System.out.println(login(username, password));
        } catch (InvalidLoginException e) {
            throw new RuntimeException(e);
        }
    }

    public static String login(String username, String password) throws InvalidLoginException {
        User[] users = {new User("Keven", "keven123"), new User("John", "john123"), new User("Junior", "junior123")};

        for (User user : users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                return "Logged in successfully!";
            }
        }

        throw new InvalidLoginException();
    }
}
