package me.kevensouza.maratonajava.optional.two.repositoy;

import me.kevensouza.maratonajava.optional.two.model.Manga;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class MangaRepository {
    private final List<Manga> mangas = new ArrayList<>();

    public Manga save(Manga manga) {
        findByTitle(manga.getTitle()).ifPresent(m -> {
            throw new IllegalArgumentException(manga.getTitle() + " already exists.");
        });

        mangas.add(manga);
        return manga;
    }

    public List<Manga> findAll() {
        return mangas;
    }

    private Optional<Manga> findBy(Predicate<Manga> predicate) {
        return mangas.stream().filter(predicate).findFirst();
    }

    public Optional<Manga> findById(Long id) {
        return findBy(m -> m.getId().equals(id));
    }

    public Optional<Manga> findByTitle(String title) {
        return findBy(m -> m.getTitle().equals(title));
    }

    public Manga update(Long id, String title, int pages, Boolean colored) {
        if (findByTitle(title).isPresent() && !findByTitle(title).get().getId().equals(id)) {
            throw new IllegalArgumentException(title + " already exists.");
        }

        return findById(id).map(m -> {
            m.setTitle(title);
            m.setPages(pages);
            m.setColored(colored);
            return m;
        }).orElse(null);

    }

    public void deleteAll() {
        mangas.clear();
    }

    public void delete(Manga manga) {
        mangas.remove(manga);
    }

    public void deleteById(Long id) {
        findById(id).ifPresent(this::delete);
    }
}
