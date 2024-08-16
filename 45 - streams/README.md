# Streams

[Streams](../maratona-java/src/me/kevensouza/maratonajava/streams/)

Uma das melhores, senão a melhor funcionalidade implementada ao Java desde a versão 8.
<br>
Stream basicamente é uma forma de processamento de dados que ajuda você a fazer as funcionalidade que você precisa em uma coleção de forma mais funcional/declarativa. É muito parecido com a forma que se faz com banco de dados... filtrar uma coleção de mangas por nome, pegar os mangas que tem mais de x letras...

Pra exemplificar seu uso, vamos usar este pequeno Exemplo:

Imagine que você tem uma classe chamada LightNovel (são chamados assim os livros que dão origem aos animes), onde temos os seguintes atributos:

```java
    public class LightNovel {
        private String title;
        private Double price;
    }
```

Temos as seguintes tarefas pra fazer em cima dessa classe...

1. Ordenar os objetos por título.
2. retornar os 3 primeiros objetos onde o preço seja menor que 5.00.

vamos ver como podemos fazer isso com e sem o uso de `Streams`:

### Sem Streams

[Sem Streams](../maratona-java/src/me/kevensouza/maratonajava/streams/LightNovel80/semStream/Main.java)

```java
        // 1 - order by alphabetical
        lightNovels.sort((a, b) -> a.getTitle().compareTo(b.getTitle()));

        // 2 - retrieve the first three light novels with price less or equal than 70
        List<LightNovel> filteredLightNovel = new ArrayList<>();
        lightNovels.forEach((lightNovel) -> {
            if (lightNovel.getPrice() <= 70 && filteredLightNovel.size() < 3) {
                filteredLightNovel.add(lightNovel);
            }
        });

        filteredLightNovel.forEach(System.out::println);
```

### Com Streams

[Sem Streams](../maratona-java/src/me/kevensouza/maratonajava/streams/LightNovel80/comStream/Main.java)

```java
        lightNovels.stream()
                // 1 - order by alphabetical
                .sorted((a, b) -> a.getTitle().compareTo(b.getTitle()))
                // 2 - retrieve the first three light novels with price less or equal than 70
                .filter(lightNovel -> lightNovel.getPrice() <= 70)
                .limit(3)
                .forEach(System.out::println);
```