package me.kevensouza.maratonajava.BJDBC.A;

import io.github.cdimascio.dotenv.Dotenv;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        try {
            DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/anime_store",
                    "kev",
                    Dotenv.load().get("DB_PASSWORD")
            );
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
