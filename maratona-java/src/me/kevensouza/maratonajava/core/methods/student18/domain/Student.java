package me.kevensouza.maratonajava.core.methods.student18.domain;

public class Student {
    public String name;
    public short age;
    public String grade;
    public byte serie;
    public char serieClass;
    public char gender;

    public void print() {
        String data = "name: " + this.name + "\nage: " + this.age + " years\ngrade: " + this.grade + "\nserie: " + this.serie + "ª\nclass: " + this.serieClass + "\ngender: " + this.gender;
        System.out.println(data);
    }
}
