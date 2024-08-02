package me.kevensouza.maratonajava.collections.navigableSetAndTreeSet71.one;

import me.kevensouza.maratonajava.collections.navigableSetAndTreeSet71.one.model.Person;
import me.kevensouza.maratonajava.collections.navigableSetAndTreeSet71.one.model.Comparator.*;

import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person(1L, "Kev", (short) 21);
        Person p2 = new Person(2L, "Rub", (short) 23);
        Person p3 = new Person(3L, "Cabeça", (short) 20);
        Person p4 = new Person(4L, "Cabecinha", (short) 25);

        // by default, is used id to sort the elements
        NavigableSet<Person> people = new TreeSet<>(new PersonAgeComparator());
        people.addAll(Set.of(p1, p2, p3, p4));

        // descendingSet() returns a NavigableSet with the elements in descending order
        people.forEach(System.out::println);
    }
}
