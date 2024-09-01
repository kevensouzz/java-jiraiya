package me.kevensouza.maratonajava.BJDBC.B.repository;

import me.kevensouza.maratonajava.BJDBC.B.config.Database;
import me.kevensouza.maratonajava.BJDBC.B.model.Producer;

import java.sql.*;

public class ProducerRepository {
    public static Producer save(Producer producer) {
        String query = "INSERT INTO producer (name, age) VALUES (?, ?);";

        try (Connection conn = Database.getConnection()) {
            PreparedStatement statement = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);

            statement.setString(1, producer.getName());
            statement.setInt(2, producer.getAge());

            int affectedRows = statement.executeUpdate();

            if (affectedRows == 0) {
                throw new SQLException("Saving producer failed, no rows affected.");
            }

            try (ResultSet generatedKeys = statement.getGeneratedKeys()) {
                if (generatedKeys.next()) {
                    long generatedId = generatedKeys.getInt(1);
                    producer.setId(generatedId);
                } else {
                    throw new SQLException("Saving producer failed, no ID obtained.");
                }
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return producer;
    }
}
