package me.kevensouza.maratonajava.core.methods.employees19;

import me.kevensouza.maratonajava.core.methods.employees19.domain.Employee;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();

        employee.nome = "Keven";
        employee.idade = 18;
        employee.salarios = new double[]{2200, 3400, 4800};

        employee.print();
    }
}
