package me.kevensouza.maratonajava.BJDBC.B.service;

import lombok.extern.log4j.Log4j2;
import me.kevensouza.maratonajava.BJDBC.B.model.Anime;
import me.kevensouza.maratonajava.BJDBC.B.repository.AnimeRepository;

import java.util.Set;

@Log4j2
public class AnimeService {
    public static Anime create(Anime anime) {
        Anime savedAnime = AnimeRepository.create(anime);

        log.info("A new anime was sucessfully saved with ID: '{}'!", savedAnime.getId());

        return savedAnime;
    }

    public static void addProducer(Long animeId, Set<Long> producersId) {
        AnimeRepository.addProducer(animeId, producersId);
    }

    public static Set<Anime> readAll() {
        Set<Anime> animes = AnimeRepository.readAll();

        if (animes.isEmpty()) {
            log.info("No animes found!");
        }

        return animes;
    }

    public static Anime readById(Long id) {
        if (id == null || id <= 0) {
            throw new IllegalArgumentException();
        }

        Anime anime = AnimeRepository.readById(id);

        if (anime == null) {
            log.info("Anime with ID: '{}' wasn't found!", id);
        }

        return anime;
    }

    public static Anime update(Long id, Anime anime) {
        if (id == null || id <= 0) {
            throw new IllegalArgumentException();
        }

        Anime updatedAnime = AnimeRepository.update(id, anime);
        log.info("Anime with ID '{}' was updated!", id);

        return updatedAnime;
    }

    public static void removeProducer(Long animeId, Set<Long> producersId) {
        AnimeRepository.removeProducer(animeId, producersId);
    }

    public static void delete(Long id) {
        if (id == null || id <= 0) {
            throw new IllegalArgumentException();
        }

        if (AnimeRepository.delete(id)) {
            log.info("Anime with ID '{}' successfully deleted!", id);
        } else {
            log.warn("Failed to delete anime with ID '{}'. It may not exist!", id);
        }
    }
}
