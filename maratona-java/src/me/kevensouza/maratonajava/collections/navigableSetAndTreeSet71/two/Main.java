package me.kevensouza.maratonajava.collections.navigableSetAndTreeSet71.two;

import me.kevensouza.maratonajava.collections.navigableSetAndTreeSet71.one.model.Person;

import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person(1L, "Kev", (short) 21);
        Person p2 = new Person(2L, "Rub", (short) 23);
        Person p3 = new Person(3L, "Cabeça", (short) 20);
        Person p4 = new Person(4L, "Cabecinha", (short) 25);

        NavigableSet<Person> people = new TreeSet<>(Set.of(p1, p2, p3, p4));

        // methods

        // lower() get the element before
        // Person{id=2, name='Rub', age=23}
        System.out.println(people.lower(p3));

        // floor() get the element before or equal
        // Person{id=3, name='Cabeça', age=20}
        System.out.println(people.floor(p3));

        // higher() get the element after
        // Person{id=4, name='Cabecinha', age=25}
        System.out.println(people.higher(p3));

        // ceiling() get the element after or equal
        // Person{id=3, name='Cabeça', age=20}
        System.out.println(people.ceiling(p3));
    }
}
