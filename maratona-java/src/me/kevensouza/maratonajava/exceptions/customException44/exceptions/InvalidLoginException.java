package me.kevensouza.maratonajava.exceptions.customException44.exceptions;

public class InvalidLoginException extends Exception {
    public InvalidLoginException() {
        super("Invalid username or password");
    }
}
