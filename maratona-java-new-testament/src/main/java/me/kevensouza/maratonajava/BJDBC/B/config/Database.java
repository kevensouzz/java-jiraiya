package me.kevensouza.maratonajava.BJDBC.B.config;

import io.github.cdimascio.dotenv.Dotenv;
import lombok.SneakyThrows;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
    @SneakyThrows
    public static Connection getConnection() {
        return DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/anime_store",
                "kev",
                Dotenv.load().get("DB_PASSWORD")
        );
    }
}
