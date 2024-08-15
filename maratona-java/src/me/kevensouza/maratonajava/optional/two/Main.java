package me.kevensouza.maratonajava.optional.two;

import me.kevensouza.maratonajava.optional.two.model.Manga;
import me.kevensouza.maratonajava.optional.two.repositoy.MangaRepository;

public class Main {
    public static void main(String[] args) {
        MangaRepository mangaRepository = new MangaRepository();

        Manga onePiece = new Manga("One Piece", 1000, true);
        mangaRepository.save(onePiece);

        System.out.println(mangaRepository.findById(1L).orElseThrow(IllegalArgumentException::new));

        Manga naruto = new Manga("Naruto", 700, false);
        mangaRepository.save(naruto);

        System.out.println(mangaRepository.findAll());

        System.out.println(mangaRepository.findByTitle("Naruto").get());

        mangaRepository.update(2L, "Naruto", 700, true);

        System.out.println(mangaRepository.findAll());

        mangaRepository.delete(naruto);

        System.out.println(mangaRepository.findAll());

        mangaRepository.deleteAll();

        System.out.println(mangaRepository.findAll());
    }
}
