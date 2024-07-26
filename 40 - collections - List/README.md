# Lista

Lista é uma coleção `ordenada` que se torna altamente coêso pelo fato de ser orientado a interface.
<br>
Pra declarar uma lista, é necessário definir um tipo... existem vários tipos, mas um dos mais simples e famosos é o ArrayList. Que basicamente é um Array que pode ser dinâmicamente imcrementado. Ou seja, você pode adicionar novos itens nesse array sem precisar recriá-lo, pois o Java faz isso por de baixo dos panos.

```java
// até o java 1.4 era feito dessa forma
// declarando a lista e definindo um tipo
List nomes = new ArrayList();
// adicionando novos elementos à lista
nomes.add("Keven");
nomes.add("Souza");

// percorrendo os itens da lista
// note que nome é de tipo object pq o java não sabe que armazenamos Strings no array pq não falamos nada.
for (Object nome : nomes) {
    System.out.print(nome);
    System.out.print(" ");
}
```

Você deve imaginar... "mas isso é bom, pq podemos adiconar itens de qualquer tipo no Array"... na verdade isso é um problema porquê impossibilita o Array de trabalhar com alguns métodos, como o `replace()`.

Hoje em dia com a introdução do `Genrics<>` tornaram a definição do tipo obrigatório em tempo de compilação...

```java
List<String> nomes = new ArrayList<>();
nomes.add("Keven");
nomes.add("Souza");

for (String nome : nomes) {
    System.out.print(nome);
    System.out.print(" ");
}
```

Outro detalhe é que não se itera sobre um ArrayList da mesma forma que um array, pois o ArrayList não tem um `length()`; mas sim um `size()`...

```java
    List nomes = new ArrayList<>();
    nomes.add("Keven");
    nomes.add("Souza");

    for (int i = 0; i < nomes.size(); i++) {
        System.out.print(nomes.get(i));
        System.out.print(" ");
    }
```

Podemos também definir um `Size()` "estático/padrão" ao ArrayList, levando em consideração o seguinte...

- o size padrão é `16`.
- se você definir new ArrayList<>(17) ele não vai ser 17, mas sim 32
- se você definir new ArrayList<>(33) ele não vai ser 33, mas sim 64

E assim vai... é uma prática performaticamente interessante definir um size inicial ao ArrayList quando já tem uma estimativa/ciência precisa de quantos elementos vão ser guardados nele, pois evitará a recriação do ArrayList ao adicionar um novo elemento e a dobra do sizer ao adicionar um elemento que estoure o limite do tamanho.