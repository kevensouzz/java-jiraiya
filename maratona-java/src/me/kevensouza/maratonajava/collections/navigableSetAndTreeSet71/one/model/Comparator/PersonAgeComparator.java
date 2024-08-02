package me.kevensouza.maratonajava.collections.navigableSetAndTreeSet71.one.model.Comparator;

import me.kevensouza.maratonajava.collections.navigableSetAndTreeSet71.one.model.Person;

import java.util.Comparator;

public class PersonAgeComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return o1.getAge().compareTo(o2.getAge());
    }
}
