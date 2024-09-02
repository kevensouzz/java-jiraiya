package me.kevensouza.maratonajava.BJDBC.B.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Producer {
    private Long id;
    private String name;
    private Integer age;

    public Producer(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}
