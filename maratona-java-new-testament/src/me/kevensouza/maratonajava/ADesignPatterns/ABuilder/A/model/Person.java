package me.kevensouza.maratonajava.ADesignPatterns.ABuilder.A.model;

public class Person {
    private String name;
    private String email;
    private short age;

    public static final class Builder {
        private String name;
        private String email;
        private short age;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder age(short age) {
            this.age = age;
            return this;
        }

        public Person build() {
            Person person = new Person();
            person.email = this.email;
            person.age = this.age;
            person.name = this.name;
            return person;
        }
    }
}
