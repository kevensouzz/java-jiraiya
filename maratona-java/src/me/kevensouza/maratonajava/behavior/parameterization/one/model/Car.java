package me.kevensouza.maratonajava.behavior.parameterization.one.model;

public class Car implements Comparable<Car> {
    private static long counter = 0;
    private Long id;
    private String mark;
    private String model;
    private String color;
    private Short year;

    public Car(String mark, String model, String color, Short year) {
        this.id = ++counter;
        this.mark = mark;
        this.model = model;
        this.color = color;
        this.year = year;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", mark='" + mark + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                '}';
    }

    @Override
    public int compareTo(Car o) {
        return this.getId().compareTo(o.getId());
    }

    public Long getId() {
        return id;
    }

    public String getMark() {
        return mark;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public Short getYear() {
        return year;
    }
}
