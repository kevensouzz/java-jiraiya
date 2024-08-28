# Padrões de projetos

Padrões de projetos/Design Patterns tem como objetivo resolver problemas que geralmente estão relacionados a padronização de projeto(s).

## Padrão Builder

Que tipo de problema esse padrão visa resolver?

Vamos imaginar uma classe como essa:

```java
public class Pessoa {
    private String firstName;
    private String lastName;
    private String username;
    private String email;

    public Pessoa(String firstName, String lastName, String username, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.email = email;
    }

    // ...getters, settes, et.
}
```

E pra instanciar essa classe, fazemos dessa forma:

```java
    new Pessoa("Killua", "Zoldyck", "killua_delas", "killuadas9inha2014@hotmail.com");
```

O tipo de problema que o `builder` tenta resolver é relacionado a quantidade de argumentos que necessita ser passado para instanciar uma classe.

Repare na imagem abaixo, que o intellij ajuda a identificar os campos a qual são passados os argumentos, mas é importante saber que nem sempre essa funcionalidade vai estar disponível, e mesmo que sempre esteja, pode não ser sempre tão eficaz.

![killua da galera](./img/Killua%20instance.png)

Ou seja, é basicamente uma forma de organizar a criação do objeto de forma que fique mais legível.

### Builder na prática

É dessa forma que uma builder class é instanciada:

```java
        // .Builder é uma classe interna e os métodos abaixo são como se fosse Setters, com a diferença que retornam o próprio objeto ao invés de `void`, permitindo que os próximos métodos sejam executados consecutivamente.
        Person keven = new Person.Builder()
            .firstName("Keven")
            .lastName("Souza")
            .username("kevonrails")
            .email("keven@gmail.com")
            // o método builder() é o que vai ser responsável por criar a instância da classe com o valor dos atributos setados anteriormente
            .build();
```

```java
public class Person {
    private String firstName;
    private String lastName;
    private String username;
    private String email;

    public static class Builder {
        private String firstName;
        private String lastName;
        private String username;
        private String email;

        public Builder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder username(String username) {
            this.username = username;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Person build() {
            Person person = new Person();
            person.firstName
            person.lastName
            person.username
            person.email
            return person;
        }
    }
}
```

É possível criar "builder classes" de forma ágil usando extensões, uma delas muito utilisada é a **"Builder Generator"** do Intellij, que permite chegar ao mesmo resultado de forma rápida, usando o comando `alt + ins`.