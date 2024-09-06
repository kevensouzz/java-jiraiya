package me.kevensouza.maratonajava.BJDBC.B.service;

import lombok.extern.log4j.Log4j2;
import me.kevensouza.maratonajava.BJDBC.B.model.Producer;
import me.kevensouza.maratonajava.BJDBC.B.repository.AnimeRepository;
import me.kevensouza.maratonajava.BJDBC.B.repository.ProducerRepository;

import java.util.Set;

@Log4j2
public class ProducerService {
    public static Producer create(Producer producer) {
        Producer savedProducer = ProducerRepository.create(producer);

        log.info("A new producer was sucessfully saved with ID: '{}'!", savedProducer.getId());

        return savedProducer;
    }

    public static Set<Producer> readAll() {
        Set<Producer> producers = ProducerRepository.readAll();

        if (producers.isEmpty()) {
            log.info("No producers found!");
        }

        return producers;
    }

    public static void addAnime(Long producerId, Set<Long> animesId) {
        ProducerRepository.addAnime(producerId, animesId);
    }

    public static Producer readById(Long id) {
        if (id == null || id <= 0) {
            throw new IllegalArgumentException();
        }

        Producer producer = ProducerRepository.readById(id);

        if (producer == null) {
            log.info("Producer with ID: '{}' wasn't found!", id);
        }

        return producer;
    }

    public static Producer update(Long id, Producer producer) {
        if (id == null || id <= 0) {
            throw new IllegalArgumentException();
        }

        Producer updatedProducer = ProducerRepository.update(id, producer);
        log.info("Producer with ID '{}' was updated!", id);

        return updatedProducer;
    }

    public static void removeAnime(Long producerId, Set<Long> animesId) {
        AnimeRepository.removeProducer(producerId, animesId);
    }

    public static void delete(Long id) {
        if (id == null || id <= 0) {
            throw new IllegalArgumentException();
        }

        if (ProducerRepository.delete(id)) {
            log.info("Producer with ID '{}' successfully deleted!", id);
        } else {
            log.warn("Failed to delete producer with ID '{}'. It may not exist!", id);
        }
    }
}
