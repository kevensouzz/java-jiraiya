package me.kevensouza.maratonajava.BJDBC.B.repository;

import lombok.extern.log4j.Log4j2;
import me.kevensouza.maratonajava.BJDBC.B.config.Database;
import me.kevensouza.maratonajava.BJDBC.B.model.Anime;
import me.kevensouza.maratonajava.BJDBC.B.model.Producer;

import java.sql.*;
import java.util.HashSet;
import java.util.Set;

@Log4j2
public class ProducerRepository {
    public static Producer create(Producer producer) {
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
                    long generatedId = generatedKeys.getLong(1);
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

    public static void addAnime(Long producerId, Set<Long> animesId) {
        String query = "INSERT INTO producer_anime (producer_id, anime_id) VALUES (?, ?);";

        try (Connection connection = Database.getConnection();
             PreparedStatement relationStatement = connection.prepareStatement(query)
        ) {
            for (Long animeId : animesId) {
                relationStatement.setLong(1, producerId);
                relationStatement.setLong(2, animeId);
                relationStatement.addBatch();
                log.info("Anime with ID: '{}' was added to producer with ID: '{}'!", animeId, producerId);
            }
            relationStatement.executeBatch();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static Set<Producer> readAll() {
        String producersQuery = "SELECT * FROM producer;";

        String relatedAnimesQuery = "SELECT a.* FROM anime a " +
                "JOIN producer_anime pa ON a.id = pa.anime_id " +
                "WHERE pa.producer_id = ?;";

        Set<Producer> producers = new HashSet<>();

        try (Connection connection = Database.getConnection();
             PreparedStatement producersStatement = connection.prepareStatement(producersQuery);
             ResultSet producersResultSet = producersStatement.executeQuery()
        ) {
            while (producersResultSet.next()) {
                Producer producer = new Producer(
                        producersResultSet.getLong("id"),
                        producersResultSet.getString("name"),
                        producersResultSet.getShort("age"),
                        new HashSet<>()
                );
                producers.add(producer);
            }

            for (Producer producer : producers) {
                try (PreparedStatement animesStatement = connection.prepareStatement(relatedAnimesQuery)) {
                    animesStatement.setLong(1, producer.getId());
                    try (ResultSet animesResultSet = animesStatement.executeQuery()) {
                        while (animesResultSet.next()) {
                            Anime anime = new Anime(
                                    animesResultSet.getLong("id"),
                                    animesResultSet.getString("name"),
                                    animesResultSet.getShort("episodes")
                            );
                            producer.getAnimes().add(anime);
                        }
                    }
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return producers;
    }

    public static Producer readById(Long id) {
        String producerQuery = "SELECT * FROM producer WHERE id = ?;";

        String relatedAnimesQuery = "SELECT a.* FROM anime a " +
                "JOIN producer_anime pa ON a.id = pa.anime_id " +
                "WHERE pa.producer_id = ?;";

        Producer producer = null;

        try (Connection connection = Database.getConnection();
             PreparedStatement producerStatement = connection.prepareStatement(producerQuery);
        ) {
            producerStatement.setLong(1, id);
            try (ResultSet producerResultSet = producerStatement.executeQuery()) {
                if (producerResultSet.next()) {
                    producer = new Producer(
                            producerResultSet.getLong("id"),
                            producerResultSet.getString("name"),
                            producerResultSet.getShort("age"),
                            new HashSet<>()
                    );
                }
            }

            if (producer != null) {
                try (PreparedStatement animesStatement = connection.prepareStatement(relatedAnimesQuery)) {
                    animesStatement.setLong(1, id);
                    try (ResultSet animesResultSet = animesStatement.executeQuery()) {
                        while (animesResultSet.next()) {
                            Anime anime = new Anime(
                                    animesResultSet.getLong("id"),
                                    animesResultSet.getString("name"),
                                    animesResultSet.getShort("episodes")
                            );
                            producer.getAnimes().add(anime);
                        }
                    }
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return producer;
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
                log.info("Update successful: {} row(s) updated!", rowsAffected);
                producer.setId(id);
            } else {
                log.warn("No rows found with the given ID: {}!", id);
                return null;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return producer;
    }

    public static void removeAnime(Long producerId, Set<Long> animesId) {
        String query = "DELETE FROM producer_anime WHERE anime_id = ? AND producer_id = ?;";

        try (Connection conn = Database.getConnection();
             PreparedStatement statement = conn.prepareStatement(query);
        ) {
            for (Long animeId : animesId) {
                statement.setLong(1, animeId);
                statement.setLong(2, producerId);

                int rowsAffected = statement.executeUpdate();

                if (rowsAffected > 0) {
                    log.info("Anime with ID: '{}' was removed from producer with ID: '{}'.", animeId, producerId);
                } else {
                    log.info("No relationship found between this anime and producer.");
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static boolean delete(Long id) {
        String query = "DELETE FROM producer WHERE (id = ?);";

        try (Connection conn = Database.getConnection();
             PreparedStatement statement = conn.prepareStatement(query);
        ) {
            statement.setLong(1, id);

            int rowsAffected = statement.executeUpdate();

            if (rowsAffected > 0) {
                log.info("Deletion successful: {} row(s) deleted!", rowsAffected);
                return true;
            } else {
                log.error("No rows found with the given ID: {}!", id);
                return false;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
