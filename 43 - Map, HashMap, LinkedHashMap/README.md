# Map, HashMap, LinkedHashMap

[Map](../maratona-java/src/me/kevensouza/maratonajava/collections/mapAndHashMapAndLinkedHashMap72/)

Técnicamente o Map não é uma coleção porque ele não faz parte da árvore hierarquica da interface `Collection`

Para criar um Map, indiferente das estruturas vistas anteriormente, é dessa forma:

```java
Map<K, V> map = new HashMap<>();
```

A única diferença seria na parte dos tipos genéricos passados `<K, V>`, onde `K` representa `Key` e `V` representa `Value`

```java
public interface Map<K, V> {
    //...
}
```

Pra adicionar um valor ao map, usamos o método `put()`:

```java
Map<String, Integer> playerAttribute = new HashMap<>();

playerAttribute.put("Velocidade", 1);
```

Existem várias opções para iterar sob um Map... mas essa é a mais "complexa", ao mesmo tempo que didática:

Levando em consideração que as chaves de um Map não podem ser repetidas, as mesmas são guardadas dentro de um `Set`, mais específicamente um `HashSet` caso esteja sendo usado um `HashMap`, o que significa que não vai ser ordenado...

Podemos iterar sob as chaves de um map com um simples Foreach, dessa forma:

```java
    // 1- map.keySet() retorna um set de chaves do mesmo valor definido na criaçao do map, no nosso caso, String
    for (string Key : map.keySet()) {
        // 2 -  agora podemos exibir a chave e o valor, pegando o valor com o método get(Key);
        System.out.println(Key + ": " + playerAttribute.get(Key));
    }
```

Tem formas mais simples de iterar sobre um Map, por exemplo:

```java
Map.forEach((key, value) -> {
    System.out.println(key + ": " + value);
})
```

Caso desejável ou necessário, é possível manter a ordem de inserção de um Map usando `LinkedHashMap<>();` ao invés de somente `HashMap<>();`.