package me.kevensouza.maratonajava.internal.classes.anonimowsClass75.two;

import me.kevensouza.maratonajava.internal.classes.anonimowsClass75.two.model.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>(List.of(new Person("Kev", 25), new Person("Ana", 22), new Person("Bia", 30)));

        // compare with name using lambda
        people.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));

        people.forEach(System.out::println);

        System.out.println();

        // compare by age normally
        Collections.sort(people);

        people.forEach(System.out::println);

        System.out.println();

        // compare by name with anonymous class
        people.sort(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        people.forEach(System.out::println);
    }
}
