# Set, HashSet

Vamos começar com o uso de `LinkedList` ao invés de `ArrayList` e veremos qual a diferença entre essas duas **estrutura de dados/coleções**.

A diferença mais explícita em relação a uma `ArrayList` é que a lista encadeada sabe a posição do elemento anterior e a próxima. A vantagem disso é que a complexidade big-O de uma lista encadeada para remover e iterar um elemento é de `O(1)` enquanto uma array list é de `O(n)`. Em contra partida para acessar elementos é `O(n)` enquanto uma array list é de `O(1)`.
<br>
Em resumo, uma lista encadeada é mais interessante que uma array list em casos que exigem muitas remoções de elementos.

Um detalhe da LinkedList é que não podem receber um `initialSize` como parâmetro, diferente de uma arrayList.

```java
List<Integer> nums = new LinkedList<>();
```

## Set

Agora falando do `Set`... o diferencial do Set é que ao invés da lista ele não permite itens duplicados dentro da coleção e também não é indexado.

Podemos usar um Set instanciando um `HashSet`, que como já diz o nome, ele é organizado por hashCode.

```java
        Clothing nikeSportswearDownInsulated = new Clothing(ClothingType.JACKET, Brand.NIKE, 299.90, (short) 10, Sizes.SMALL, Sizes.MEDIUM);
        Clothing nikeShirtSW = new Clothing(ClothingType.SHIRT, Brand.NIKE, 90.0, (short) 13, Sizes.SMALL, Sizes.MEDIUM, Sizes.LARGE);
        Clothing pumaShirtSW = new Clothing(ClothingType.SHIRT, Brand.PUMA, 75.0, (short) 8, Sizes.MEDIUM, Sizes.LARGE, Sizes.EXTRA_LARGE);

        Set<Clothing> clothingSet = new HashSet<>(Set.of(nikeSportswearDownInsulated, nikeShirtSW, pumaShirtSW));
```

Ou podemos usar o `LinkedHashSet` no caso da necessidade de ordenar os itens por ordem de inserção

```java
        Set<Clothing> clothingSet = new LinkedHashSet<>(Set.of(nikeSportswearDownInsulated, nikeShirtSW, pumaShirtSW));
```