package me.kevensouza.maratonajava.optional.two.model;

import java.util.Objects;

public class Manga {
    private final Long id;
    private String title;
    private int pages;
    private boolean colored;
    private static long count = 0L;

    public Manga(String title, int pages, boolean colored) {
        this.id = ++Manga.count;
        this.title = title;
        this.pages = pages;
        this.colored = colored;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Manga)) return false;
        Manga manga = (Manga) o;
        return Objects.equals(getId(), manga.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "Manga{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", pages=" + pages +
                ", colored=" + colored +
                '}';
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public boolean getColored() {
        return colored;
    }

    public void setColored(boolean colored) {
        this.colored = colored;
    }
}
