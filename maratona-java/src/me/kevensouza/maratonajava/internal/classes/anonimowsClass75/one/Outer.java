package me.kevensouza.maratonajava.internal.classes.anonimowsClass75.one;

class Animal {
    public void walk() {
        System.out.println("Animal walking");
    }
}

class Dog extends Animal {
    public void walk() {
        System.out.println("Dog walking");
    }
}

public class Outer {
    public static void main(String[] args) {
        Animal animal = new Animal() {
            @Override
            public void walk() {
                System.out.println("Anonymous walking");
            }
        };
        animal.walk();
    }
}
