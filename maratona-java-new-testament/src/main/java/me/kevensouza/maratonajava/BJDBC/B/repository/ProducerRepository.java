package me.kevensouza.maratonajava.BJDBC.B.repository;

import lombok.extern.log4j.Log4j2;
import me.kevensouza.maratonajava.BJDBC.B.config.Database;
import me.kevensouza.maratonajava.BJDBC.B.model.Producer;

import java.sql.*;
import java.util.HashSet;
import java.util.Set;

@Log4j2
public class ProducerRepository {
    public static Producer save(Producer producer) {
        String query = "INSERT INTO producer (name, age) VALUES (?, ?);";

        try (Connection conn = Database.getConnection();
             PreparedStatement statement = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
        ) {
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

    public static Set<Producer> listAll() {
        String query = "SELECT id, name, age FROM producer;";

        Set<Producer> producers = new HashSet<>();

        try (Connection conn = Database.getConnection();
             PreparedStatement statement = conn.prepareStatement(query);
        ) {
            try (ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    producers.add(new Producer(resultSet.getLong("id"),
                            resultSet.getString("name"),
                            resultSet.getInt("age")));
                }
            }
        } catch (
                SQLException e) {
            throw new RuntimeException(e);
        }

        return producers;
    }

    public static Producer listById(Long id) {
        String query = "SELECT id, name, age FROM producer WHERE id = ?";

        try (Connection conn = Database.getConnection();
             PreparedStatement statement = conn.prepareStatement(query);
        ) {
            statement.setLong(1, id);

            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    log.info("Producer found with ID: {}", id);
                    return new Producer(
                            resultSet.getLong("id"),
                            resultSet.getString("name"),
                            resultSet.getInt("age")
                    );
                } else {
                    log.warn("No Producer found with ID: {}", id);
                    return null;
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static Producer update(Long id, Producer producer) {
        String query = "UPDATE producer SET name = ?, age = ? WHERE id = ?;";

        try (Connection conn = Database.getConnection();
             PreparedStatement statement = conn.prepareStatement(query);
        ) {
            statement.setString(1, producer.getName());
            statement.setInt(2, producer.getAge());
            statement.setLong(3, id);

            int rowsAffected = statement.executeUpdate();

            if (rowsAffected > 0) {
                log.info("Update successful: {} row(s) updated.", rowsAffected);
                producer.setId(id);
            } else {
                log.warn("No rows found with the given ID: {}", id);
                return null;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return producer;
    }

    public static boolean delete(Long id) {
        String query = "DELETE FROM producer WHERE (id = ?);";

        try (Connection conn = Database.getConnection();
             PreparedStatement statement = conn.prepareStatement(query);
        ) {
            statement.setLong(1, id);

            int rowsAffected = statement.executeUpdate();

            if (rowsAffected > 0) {
                log.info("Deletion successful: {} row(s) deleted.", rowsAffected);
                return true;
            } else {
                log.error("No rows found with the given ID: {}", id);
                return false;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
