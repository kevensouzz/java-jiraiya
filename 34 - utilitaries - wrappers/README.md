# Wrappers

Wrappers nada mais são do que *Referência* aos `tipos primitivos`, é um encapsulamento de um tipo primitivo em uma classe.

### Como Criar

Basta criar um atributo com um tipo primitivo, mas, com a primeira letra maiúscula. com exceção aos inteiros e chars, que se tornam `Integer` e `Character`.

```java
    // tipos primitivos
        byte byteP = 1;
        short shortP = 1;
        int intP = 1;
        long longP = 1;
        float floatP = 1;
        double doubleP = 1;
        char charP = 'P';
        boolean booleanP = true;

    // wrappers
        Byte byteW = 1;
        Short shortW = 1;
        Integer intW = 1;
        Long longW = 1L;
        Float floatW = 1F;
        Double doubleW = 1D;
        Character charW = 'W';
        Boolean booleanW = true;
```

### Observação

Wrappers se comportam um pouco diferente dos tipos primitivos, afinal são classes.
<br>
Com tipos primitvos, é possível armazenar valores `int` em variáveis `long` e `float` em `double`, afinal, cabe.
<br>
Com Wrappers, não. pois as classes vão identificar um `Long` por ter um `L` no final, e não pelo seu valor, assim se repete aos demais tipos, `float` e `double`.
<br>
Ou seja... pra armazenar valores em `Long` deve ter o indicador `L` no final, com `Float`... `F`, `Double`... `D`.

### Porquê foram criados

1. Passar argumentos de valores numéricos por referência
2. Algumas estruturas do pacote de coleções, como `ArrayList`, `Vetores`, `Collections` não aceitam Tipos primitivos, pois guardam referências.

### Boas Práticas

As boas práticas do java dizem que, se for possível usar os tipos primitivos, melhor. Os Wrappers estão pra caso não seja possível usar tipos primitivos.

### Autoboxing e Unboxing

Basicamente, `autoboxing` é quando o java é encarregado de transformar um tipo primitivo em uma Wrapper class.

```java
Byte byteW = 1; // boxing ou autoboxing
```

`Unboxing` é o contrário... quando é transformado de wrapper class para um tipo primitivo.

```java
Byte byteW = 1; 

byte byteP = byteW; // unboxing
```

----------

No exemplo acima, estamos desencapsulando a wrapper classe dentro de uma variável `byte` logo o valor será automáticamente convertido para byte, Mas a partir dos métodos das classes wrapper, é possível obter/converter o valor da variável em tipos diferentes, como int, long, float, double, etc.

Isso pode ser útil em casos de parametrização.

### Métodos de classes Wrapper

Todos as classes Wrappers tem métodos úteis respectivos aos tipos primitivos que representam, aqui vão alguns métodos da classe`Character`, por exemplo:

```java
        Character charW = 'W';

        // é uma letra alfabética?
        Character.isAlphabetic(charW);

        // é um número?
        Character.isDigit(charW);

        // é número ou letra?
        Character.isLetterOrDigit(charW);

        // é caixa alta?
        Character.isUpperCase(charW);

        // é caixa baixa?
        Character.isLowerCase(charW);

        // transforma em caixa alta
        Character.toUpperCase(charW);

        // transforma em caixa baixa
        Character.toLowerCase(charW);
```