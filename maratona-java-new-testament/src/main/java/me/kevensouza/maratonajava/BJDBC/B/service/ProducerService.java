package me.kevensouza.maratonajava.BJDBC.B.service;

import lombok.extern.log4j.Log4j2;
import me.kevensouza.maratonajava.BJDBC.B.model.Producer;
import me.kevensouza.maratonajava.BJDBC.B.repository.ProducerRepository;

import java.util.Set;

@Log4j2
public class ProducerService {
    public static Producer save(Producer producer) {
        Producer savedProducer = ProducerRepository.save(producer);
        log.info("A new producer was sucessfully saved with ID: '{}'!", savedProducer.getId());

        return savedProducer;
    }

    public static Set<Producer> listAll() {
        return ProducerRepository.listAll();
    }

    public static Producer listById(Long id) {
        if (id == null || id <= 0) {
            throw new IllegalArgumentException();
        }

        return ProducerRepository.listById(id);
    }

    public static Producer update(Long id, Producer producer) {
        if (producer.getId() == null || producer.getId() <= 0) {
            throw new IllegalArgumentException();
        }

        Producer updatedProducer = ProducerRepository.update(id, producer);
        log.info("Producer with ID '{}' was updated.", id);

        return updatedProducer;
    }

    public static void delete(Long id) {
        if (id == null || id <= 0) {
            throw new IllegalArgumentException();
        }

        if (ProducerRepository.delete(id)) {
            log.info("Producer with ID {} successfully deleted.", id);
        } else {
            log.warn("Failed to delete Producer with ID '{}'. It may not exist.", id);
        }
    }
}
