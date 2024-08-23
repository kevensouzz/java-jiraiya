package me.kevensouza.maratonajava.streams.grouping83.model;

import me.kevensouza.maratonajava.streams.collectors82.two.model.enums.Category;

import java.util.Objects;

public class LightNovel {
    private String title;
    private double price;
    private Category category;

    public LightNovel(String title, double price, Category category) {
        this.title = title;
        this.price = price;
        this.category = category;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LightNovel)) return false;
        LightNovel that = (LightNovel) o;
        return Double.compare(getPrice(), that.getPrice()) == 0 && Objects.equals(getTitle(), that.getTitle()) && getCategory() == that.getCategory();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTitle(), getPrice(), getCategory());
    }

    @Override
    public String toString() {
        return "LightNovel{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", category=" + category +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public Category getCategory() {
        return category;
    }
}
