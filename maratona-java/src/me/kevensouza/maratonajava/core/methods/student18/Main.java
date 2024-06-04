package me.kevensouza.maratonajava.core.methods.student18;

import me.kevensouza.maratonajava.core.methods.student18.domain.Student;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();

        student.name = "Keven";
        student.age = 18;
        student.grade = "fundamental";
        student.serie = 3;
        student.serieClass = 'd';
        student.gender = 'm';

        student.print();
    }
}
