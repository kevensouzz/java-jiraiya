# Equals

[Equals](../maratona-java/src/me/kevensouza/maratonajava/collections/equals64/)

Pra entender o funcionamento do método equals() é interessante voltar na parte das strings... Onde foi visto sobre `Hill` que serio o espaço em memória que são armazenados os objetos e `String constant poll` onde são armazenadas as strings, que pos sinal, são imutáveis.

Contudo, sabemos que ambas as comparações abaixo retonam `true`...

```java
    String s1 = "Keven";
    String s2 = "Keven";

    // retorna true pq aponta pra mesma string na memória
    System.out.println(s1 == s2);

    // retorna true pq a classe String sobrescreve o método equals() fazendo com que seja comparado o valor de duas strings
    System.out.println(s1.equals(s2));
```

Mas e se compararmos objetos? dessa forma:

```java
public class User {
    private String name;
    private String password;
    // ...
}

    public static void main(String[] args) {
        User user1 = new User("User1", "123");
        User user2 = new User("User1", "123");

        System.out.println(user1.equals(user2));
    }
```

Retorná false, embora o valor dos atributos dos dois objetos sejam o mesmo é necessário sobrescrever o método `equals()` na classe User para poder comparar objetos...

## Regras do Equals

- Deve ser reflexico: x.equals(x) tem que ser true para tudo que for diferente de null
- Deve ser simétrico: para x e y diferente de null, se x.equals(y) == true, y.equals(x) deve ser == true também.
- Deve ser transitivo: para x, y, z diferentes de null, se x.equals(y) == true logo, y.equals(x) deve ser == true e se x.equals(z) == true logo, z.equals(x) deve ser == true...
- Deve ser consistente: independente de quantas vezes for chamado x.equals(x) deve retornar true se != null.

## Como é implementado/sobrescrito método equals

```java
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return Objects.equals(getName(), user.getName()) && Objects.equals(getPassword(), user.getPassword());
    }
```