package me.kevensouza.maratonajava.ADesignPatterns.ABuilder.A.model;

public class Person {
    private String name;
    private String email;
    private short age;

    public static final class Builder {
        private String name;
        private String email;
        private short age;

        private Builder() {
        }

        public static Builder aPerson() {
            return new Builder();
        }

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
            person.name = this.name;
            person.email = this.email;
            person.age = this.age;
            return person;
        }
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public short getAge() {
        return age;
    }
}
