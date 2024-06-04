package me.kevensouza.maratonajava.core.classes.student15.test;

import me.kevensouza.maratonajava.core.classes.student15.domain.Student;

public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student();

        student.idade = 18;
        student.nome = "Keven";
        student.sexo = 'M';

        System.out.println(student.nome);
        System.out.println(student.idade);
        System.out.println(student.sexo);
    }
}
