# Padrões de projetos

[design patterns](../maratona-java-new-testament/src/me/kevensouza/maratonajava/ADesignPatterns/)

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

## Padrão Singleton

O "Problema" que o Singleton visa resolver é o seguinte: A projeção de uma classe, onde vai ter apenas uma instância que vai ser usada por quaisquer outras classes/threads ou o que for. Como por exemplo um objeto de conexão de banco de dados.

Pra simplificar, imagine uma classe que representa uma aeronave, dessa forma:

```java
public class Aircraft {
    private final Set<String> availableSeats = new HashSet<>();
    private final String name;

    public Aircraft(String name) {
        this.name = name;
    }

    {
        availableSeats.add("A1");
        availableSeats.add("B1");
        availableSeats.add("C1");
    }

    public boolean bookSeat(String seat) {
        return availableSeats.remove(seat);
    }
}
```

Repare que temos um HashSet de acentos disponíveis. O objetivo do Singleton é fazer com que todos objetos dessa classe tenham o mesmo valor. Mas repare o seguinte:

```java
public class Main {
    public static void main(String[] args) {
        bookSeat("1A");
        bookSeat("1A");
    }

    private static void bookSeat(String seat) {
        Aircraft aircraft = new Aircraft("slapo");
        System.out.println(aircraft.bookSeat(seat));
    }
}
```

esse código retorna `true | true`, mesmo que esteja usando o mesmo acento duas vezes. O motivo pelo qual isso acontece é por que está sendo criado dois objetos distintos.

### Como resolvemos isso?

#### Eager Initialization

Há algumas formas de resolver esse problemas, vamos começar pela `Eager Initialization`...

O motivo pelo qual chamamos de Eager Initialization é a criação de um atributo "INSTANCE" estático, que não é nada menos que uma instância da própria classe, assim que o código é executado:

```java
    private static final Aircraft INSTANCE = new Aircraft("787-900");
```

Portanto, deve ser manter o(s) construtor privado, para que não seja possível instânciar outros objetosm dessa forma:

```java
public final class Aircraft {
    private static final Aircraft INSTANCE = new Aircraft("787-900");
    private final Set<String> availableSeats = new HashSet<>();
    private final String name;

    private Aircraft(String name) {
        this.name = name;
    }

    {
        availableSeats.add("A1");
        availableSeats.add("B1");
        availableSeats.add("C1");
    }

    public boolean bookSeat(String seat) {
        return availableSeats.remove(seat);
    }

    public static Aircraft getINSTANCE() {
        return INSTANCE;
    }
}
```

Para acessar esse objeto fora da classe, basta usar o `getINSTANCE()` e sempre será referenciado o mesmo objeto:

```java
    public static void main(String[] args) {
        bookSeat("A1"); // true
        bookSeat("A1"); // false
    }

    private static void bookSeat(String seat) {
        Aircraft aircraft = Aircraft.getINSTANCE();
        System.out.println(aircraft.bookSeat(seat));
    }
```

#### Lazy Initialization

De forma resumida, `Lazy Initialization` é um pouco mais "seguro" que o `Eager Initialization`.

Já ciente que quando trabalhando com múltiplas threas, é possível que threads executem o mesmos métodos e também criem mais de uma instância de uma classe que só deve ter uma.

por as seguintes modificações em relação ao modo `Eager`:

```java
// atributo INSTANCE deixa de ser "final" e não cria uma instância assim que executado o programa.
private static Aircraft INSTANCE;

// ... mas sim no método getInstance, para que seja possível fazer uma sincronização das supostas threads. Tornando a classe Singleton masi ThreadSafe.
    public static Aircraft getInstance() {
        if (INSTANCE == null) {
            synchronized (Aircraft.class) {
                if (INSTANCE == null) {
                    INSTANCE = new Aircraft("737-900");
                }
            }
        }

        return INSTANCE;
    }
```

## Data Transfer Object (DTO)

Mais conhecido como DTO, se trata de um padrão arquitetural de aplicações corporativas.

Tecnicamente iria ser falado sobre `Strategy`, mas o strategy é usado com polimorfismo, então será abordado um padrão muito popular em aplicações web java.

Imagine que seja necessário enviar uma determinada quantidade de dados para uma API.
<br>
Exemplo: (nome da aeronave, país, moeda do país, nome de uma pessoa).`

Neste caso, repare que seria necessário dados de umas 3 entidades distintas. `(Pessoa, Currency, Aircraft)`

Os dados de todos os atributos dessas entidade resultaria numa quantidade massiva de informações desnecessárias. Por isso o DTO resolve esse problema.

Pois, basta criar uma classe somente com os atributos necessários, exemplo:

```java
// mesclou atributos de duas entidades. (Person, Aircraft)
public class ReportDto {
    private String AircraftName;
    private String PersonName;
    private short PersonAge;

    // podemos add um builder também...
}
```

Dessa forma, é posível formular objetos maleaveis para enviar dados de entidades diferentes por um endpoint de uma API, por exemplo...

```java
public class Main {
    public static void main(String[] args) {
        Aircraft aircraft = Aircraft.getInstance();

        Person person = Person.Builder.aPerson()
                .name("Ging Frecss")
                .email("gingfrecss@greedisland.com")
                .age((short) 24)
                .build();

        ReportDto.ReportDtoBuilder.aReportDto()
                .AircraftName(aircraft.getName())
                .PersonName(person.getName())
                .PersonAge(person.getAge());
    }
}
```