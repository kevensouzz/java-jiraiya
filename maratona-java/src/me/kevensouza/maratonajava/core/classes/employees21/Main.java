package me.kevensouza.maratonajava.core.classes.employees21;

import me.kevensouza.maratonajava.core.classes.employees21.domain.Employee;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();

        employee.setNome("Keven");
        employee.setIdade(18);
        employee.setSalarios(2800, 3400, 4800, 6400, 9000, 13000, 20000);

        System.out.println(employee.getNome());
        System.out.println(employee.getIdade());
        System.out.println(Arrays.toString(employee.getSalarios()));
        System.out.println(employee.getMediaSalarial());
    }
}
