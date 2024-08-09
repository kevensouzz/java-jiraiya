package me.kevensouza.maratonajava.behavior.parameterization.one;

import me.kevensouza.maratonajava.behavior.parameterization.one.model.Car;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    private static List<Car> cars = new ArrayList<>(List.of(
            new Car("Mitsubishi", "Lancer", "Silver", (short) 2014),
            new Car("Honda", "Civic", "Black", (short) 2020)
    ));

    public static void main(String[] args) {
        Collections.sort(cars);
        System.out.println(filterCar(cars, "year", "2020"));
    }

    private static List<Car> filterCar(List<Car> cars, String param, String arg) {
        return cars.stream()
                .filter(car -> {
                    switch (param.toLowerCase()) {
                        case "mark":
                            return car.getMark().equalsIgnoreCase(arg);
                        case "model":
                            return car.getModel().equalsIgnoreCase(arg);
                        case "color":
                            return car.getColor().equalsIgnoreCase(arg);
                        case "year":
                            return Short.toString(car.getYear()).equals(arg);
                        default:
                            return false;
                    }
                }).collect(Collectors.toList());
    }
}
