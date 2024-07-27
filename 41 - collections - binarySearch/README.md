# Binary Search

Um pouco diferente do método `indexof()`, a `binarySearch()` de Collection mostra em qual posição você deve alocar o elemento, caso ele não exista na coleção...
<br>
E caso o item passado exista na coleção, ele simplesmente retorna a posição, `a partir do 0`.

Exemplo:

```java
List<Integer> nums = new ArrayList<>();
nums.add(2);
nums.add(4);
nums.add(6);
nums.add(8);

// o ideal pra buscas binárias é que a coleção esteja ordenada. Tanto que não é possível usar de buscas binárias em coleções não ordenadas.
Collections.sort(nums);

System.out.println(Collections.binarySearch(nums, 10));
```

## Ponto de inserção

Ponto de inserção seria onde um valor inexistente na coleção seria adicionada na própria. Vamos entender como funciona...

Baseado nessa lista, temos os seguintes índices e valores:

```java
List<Integer> nums = new ArrayList<>();
nums.add(2);
nums.add(4);
nums.add(6);
nums.add(8);
Collections.sort(nums);

// índices
// 0, 1, 2, 3
// valores
// 0, 2, 4, 6
```

O ponto de inserção funciona assim: supondo que passamos `5` como argumento...
<br>
O valor que nos retorna é `-4`. Podemos abstrair esse resultado assim:

- Sempre nos retornará um valor negativo
- Em seguida o (index que ele ocupará + 1)

Ou seja, como podemos ver, no nosso exemplo, o `5` ocuparia o índice `3`, pois ele é menor que `6`, que ocupará o índice `4`; e maior que `4` que ocupará `2`.
<br>
-(Índice + 1).