package me.kevensouza.maratonajava.collections.hashcode65.one;

import me.kevensouza.maratonajava.collections.hashcode65.one.domain.Car;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Gol");
        Car car2 = new Car("Uno");
        Car car3 = new Car("Celta");
        Car car4 = new Car("Astra");
        Car car5 = new Car("Lancer");

        Car[] Cars = {car1, car2, car3, car4, car5};

        for (Car car: Cars) {
            System.out.println(car.getName() + ": " +car.hashCode());
            if (car.getName().equals("Lancer")) {
                System.out.println("Lancer encontrado!");
            }
        }
    }
}