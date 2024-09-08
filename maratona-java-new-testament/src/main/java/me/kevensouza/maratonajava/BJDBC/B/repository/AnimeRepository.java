package me.kevensouza.maratonajava.BJDBC.B.repository;

import lombok.extern.log4j.Log4j2;
import me.kevensouza.maratonajava.BJDBC.B.config.Database;
import me.kevensouza.maratonajava.BJDBC.B.model.Anime;
import me.kevensouza.maratonajava.BJDBC.B.model.Producer;

import java.sql.*;
import java.util.HashSet;
import java.util.Set;

@Log4j2
public class AnimeRepository {
    public static Anime create(Anime anime) {
        String query = "INSERT INTO anime (name, episodes) VALUES (?, ?);";

        try (Connection connection = Database.getConnection();
             PreparedStatement statement = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
        ) {
            statement.setString(1, anime.getName());
            statement.setShort(2, anime.getEpisodes());

            int affectedRows = statement.executeUpdate();

            if (affectedRows == 0) {
                throw new SQLException("Saving anime failed, no rows affected.");
            }

            try (ResultSet generatedKeys = statement.getGeneratedKeys()) {
                if (generatedKeys.next()) {
                    long generatedId = generatedKeys.getLong(1);
                    anime.setId(generatedId);
                } else {
                    throw new SQLException("Saving producer failed, no ID obtained.");
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return anime;
    }

    public static void addProducer(Long animeId, Set<Long> producersId) {
        String query = "INSERT INTO producer_anime (producer_id, anime_id) VALUES (?, ?);";

        try (Connection connection = Database.getConnection();
             PreparedStatement relationStatement = connection.prepareStatement(query)
        ) {
            for (Long producerId : producersId) {
                relationStatement.setLong(1, producerId);
                relationStatement.setLong(2, animeId);
                relationStatement.addBatch();
                log.info("Producer with ID: '{}' was added to anime with ID: '{}'!", producerId, animeId);
            }
            relationStatement.executeBatch();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static Set<Anime> readAll() {
        String AnimesQuery = "SELECT * FROM anime;";

        String relatedProducersQuery = """
                 SELECT p.* FROM producer p 
                 JOIN producer_anime pa ON p.id = pa.producer_id 
                WHERE pa.anime_id = ?;""";

        Set<Anime> animes = new HashSet<>();

        try (Connection connection = Database.getConnection();
             PreparedStatement animeStatement = connection.prepareStatement(AnimesQuery);
             ResultSet animesResultSet = animeStatement.executeQuery()
        ) {
            while (animesResultSet.next()) {
                Anime anime = new Anime(
                        animesResultSet.getLong("id"),
                        animesResultSet.getString("name"),
                        animesResultSet.getShort("episodes"),
                        new HashSet<>()
                );
                animes.add(anime);
            }

            for (Anime anime : animes) {
                try (PreparedStatement producersStatement = connection.prepareStatement(relatedProducersQuery)) {
                    producersStatement.setLong(1, anime.getId());
                    try (ResultSet producersResultSet = producersStatement.executeQuery()) {
                        while (producersResultSet.next()) {
                            Producer producer = new Producer(
                                    producersResultSet.getLong("id"),
                                    producersResultSet.getString("name"),
                                    producersResultSet.getShort("age")
                            );
                            anime.getProducers().add(producer);
                        }
                    }
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return animes;
    }

    public static Anime readById(Long id) {
        String animeQuery = "SELECT * FROM anime WHERE id = ?;";

        String relatedProducersQuery = """
                 SELECT p.* FROM producer p 
                 JOIN producer_anime pa ON p.id = pa.producer_id 
                WHERE pa.anime_id = ?;""";

        Anime anime = null;

        try (Connection connection = Database.getConnection();
             PreparedStatement animeStatement = connection.prepareStatement(animeQuery);
        ) {
            animeStatement.setLong(1, id);
            try (ResultSet animeResultSet = animeStatement.executeQuery()) {
                if (animeResultSet.next()) {
                    anime = new Anime(
                            animeResultSet.getLong("id"),
                            animeResultSet.getString("name"),
                            animeResultSet.getShort("episodes"),
                            new HashSet<>()
                    );
                }
            }

            if (anime != null) {
                try (PreparedStatement producersStatement = connection.prepareStatement(relatedProducersQuery)) {
                    producersStatement.setLong(1, id);
                    try (ResultSet producersResultSet = producersStatement.executeQuery()) {
                        while (producersResultSet.next()) {
                            Producer producer = new Producer(
                                    producersResultSet.getLong("id"),
                                    producersResultSet.getString("name"),
                                    producersResultSet.getShort("age")
                            );
                            anime.getProducers().add(producer);
                        }
                    }
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return anime;
    }

    public static Anime update(Long id, Anime anime) {
        String query = "UPDATE anime SET name = ?, episodes = ? WHERE id = ?;";

        try (Connection connection = Database.getConnection();
             PreparedStatement statement = connection.prepareStatement(query)
        ) {
            statement.setString(1, anime.getName());
            statement.setShort(2, anime.getEpisodes());
            statement.setLong(3, id);

            int rowsAffected = statement.executeUpdate();

            if (rowsAffected > 0) {
                log.info("Update successful: {} row(s) updated!", rowsAffected);
                anime.setId(id);
            } else {
                log.warn("No rows found with the given ID: {}!", id);
                return null;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return anime;
    }

    public static void removeProducer(Long animeId, Set<Long> producersId) {
        String query = "DELETE FROM producer_anime WHERE anime_id = ? AND producer_id = ?;";

        try (Connection conn = Database.getConnection();
             PreparedStatement statement = conn.prepareStatement(query);
        ) {
            for (Long producerId : producersId) {
                statement.setLong(1, animeId);
                statement.setLong(2, producerId);

                int rowsAffected = statement.executeUpdate();

                if (rowsAffected > 0) {
                    log.info("Producer with ID: '{}' was removed from anime with ID: '{}'.", producerId, animeId);
                } else {
                    log.info("No relationship found between this anime and producer.");
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static boolean delete(Long id) {
        String query = "DELETE FROM anime WHERE id = ?;";

        try (Connection connection = Database.getConnection();
             PreparedStatement statement = connection.prepareStatement(query)
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
