package me.kevensouza.maratonajava.BJDBC.B.model;

import java.util.Objects;

public class Producer {
    private Long id;
    private String name;
    private Integer age;

    public Producer(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Producer(Long id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Producer producer)) return false;
        return Objects.equals(id, producer.id) && Objects.equals(name, producer.name) && Objects.equals(age, producer.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age);
    }

    @Override
    public String toString() {
        return "{" +
                "id: " + id +
                ", name: \"" + name + '\"' +
                ", age: " + age +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
