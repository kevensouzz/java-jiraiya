# Arrays

[Arrays11.java](../maratona-java/src/me/kevensouza/maratonajava/intro/Arrays11.java)

Um Array é um `tipo/estrutura` de dados, **diferente** dos tipos `int, char, boolean, etc` **não** é um `tipo primitivo`; mas, um `tipo de referência`, como a `String` que faz referência á uma `cadeia/array de` **`char`** na memória.

É assim que se declara um array:

1. define o tipo de dados que vai ser alocado Ex: int.
2. um par de colchete para informar que é um array. (Recomendado usar depois de tipar os dados qu serão alocados)

```java
int[] arrayExemplo;
```

Desta forma ainda **não** foi declarado, o array só é declarado quando informado quantas posições ele terá que armazenar...
<br />
desta forma:

```java
int[] arrayExemplo = new int[3]
```

No exemplo acima estou declarando que o array terá 3 posições na memória.

Também podemos fazer isso setando os dados diretamente:

```java
int[] idades = {10, 20, 30, 40, 50, 60, 70, 80, 90};
```

### setar um valor

Pra seta um valor a uma posição no array, teremos que pegar seu `Índice`, dessa forma:

```java
int[] idades = {10, 20, 30, 40, 50, 60, 70, 80, 90};

idades[0] = 100
```

Assim é setado o valor `100` à primeira posição do array, podemos ver isso exibindo os valores com um `laço for`:

```java
        int[] idades = {10, 20, 30, 40, 50, 60, 70, 80, 90};

        idades[0] = 100;

        for (int idade : idades) {
            System.out.println(idade);
        }
```

```console
100
20
30
40
50
60
70
80
90
```

----------

### Padrão de valores na inicialização de novas variáveis de tipos primitivos dentro de arrays

[Arrays12.java](../maratona-java/src/me/kevensouza/maratonajava/intro/Arrays12.java)

Quando você declara uma variável sem definir seu valor, ela ainda não estará ocupando nenhum lugar na memória.

Por isso, você recebe um erro e nem se quer consegue compilar o programa quando faz algo parecido com isso:

```java
int example;
System.out.printl(age);
```

Mas quando você declara/instancía novo um array sem definir seus valores, automáticamente é setado valores às posições/variáveis que compõe o vetor, veja:

```java
int[] array = new int[3]

System.out.printl(array[0]);
System.out.printl(array[1]);
System.out.printl(array[2]);
```

automáticamente é setado um valor aos inteiros desse array, e torna possível compilar e rodar normalmente, saída:

```console
0
0
0
```

Para arrays de tipo `byte, short, int, long` são setados **0** por padrão. para `float e double` **0.0**. Para `char` **'\u0000'** que seria representado por um espaço em branco, segundo o padrão ASCII. Para `boolean` **false** e para todos os `tipos reference`, como `String` será **null**.