package me.kevensouza.maratonajava.collections.iterator69.one.model;

import me.kevensouza.maratonajava.collections.iterator69.one.model.enums.Brand;
import me.kevensouza.maratonajava.collections.iterator69.one.model.enums.ClothingType;
import me.kevensouza.maratonajava.collections.iterator69.one.model.enums.Sizes;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class Clothing implements Comparator<Clothing> {
    private ClothingType clothingType;
    private Brand brand;
    private Double price;
    private Short quantity;
    private List<Sizes> availableSizes;

    public Clothing(ClothingType clothingType, Brand brand, Double price, Short quantity, Sizes... availableSizes) {
        this.clothingType = clothingType;
        this.brand = brand;
        this.price = price;
        this.quantity = quantity;
        this.availableSizes = List.of(availableSizes);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Clothing)) return false;
        Clothing clothing = (Clothing) o;
        return getClothingType() == clothing.getClothingType() && getBrand() == clothing.getBrand() && Objects.equals(getPrice(), clothing.getPrice()) && Objects.equals(getQuantity(), clothing.getQuantity()) && Objects.equals(getAvailableSizes(), clothing.getAvailableSizes());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getClothingType(), getBrand(), getPrice(), getQuantity(), getAvailableSizes());
    }

    @Override
    public String toString() {
        return "Clothing{" +
                "clothingType=" + clothingType +
                ", brand=" + brand +
                ", price=" + price +
                ", quantity=" + quantity +
                ", availableSizes=" + availableSizes +
                '}';
    }

    @Override
    public int compare(Clothing o1, Clothing o2) {
        return o1.getPrice().compareTo(o2.getPrice());
    }

    public ClothingType getClothingType() {
        return clothingType;
    }

    public void setClothingType(ClothingType clothingType) {
        this.clothingType = clothingType;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Short getQuantity() {
        return quantity;
    }

    public void setQuantity(Short quantity) {
        this.quantity = quantity;
    }

    public List<Sizes> getAvailableSizes() {
        return availableSizes;
    }

    public void setAvailableSizes(Sizes... availableSizes) {
        this.availableSizes = List.of(availableSizes);
    }
}
