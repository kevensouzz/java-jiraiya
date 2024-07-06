# Multi Catch

É possível tratar um método para caso de mais de uma possibilidade de exceção, mas antes de usar multi catching, é interessante conhecer sobre a herança das classes de exceções, algumas exceções são mais genéricas, enquanto outras são mais específicas...

### Exemplo

![Hierarchy Of Exception](./images/hierarchy-of-exception.png)

- Exception
    - IOException
    - SQLException
    - ClassNotFoundException
    - RuntimeException
        - ArithmeticException
        - NullPointerException
        - NumberFormatException
        - IndexOutOfBoundException
            - ArrayIndexOutOfBoundException
            - StringIndexOutOfBoundException

### Importância de conhecer o mínimo da hierarquia de exceções

Quando usando multi catching, um fator muito importante do desempenho do tratamento é a ordem de captura...
<br>
**Como assim?**

No exemplo abaixo, estamos organizando a ordem de captura pela exceção mais genérica (Exception) até a mais específica (StringIndexOutOfBoundException). Dessa forma, se o Try lançar um exceção de tipo `StringIndexOutOfBoundException` será executado `System.out.println("Exception");` e não `System.out.println("StringIndexOutOfBoundException");`

```java
try {
// ...Exemplo
} catch (Exception e) {
    System.out.println("Exception");
} catch (RuntimeException e) {
    System.out.println("RuntimeException");
} catch (IndexOutOfBoundException e) {
    System.out.println("IndexOutOfBoundException");
} catch (StringIndexOutOfBoundException e) {
    System.out.println("StringIndexOutOfBoundException");
}
```

### Resumo

A ordem é importantíssima nesse caso, pois deve ser organizada da exceção mais específica até a mais genérica, e nunca o contrário.

## Inline Multi Catching

Também é possível fazer multiplas capturas em uma única linha, usando o pipe `|`. Essa forma de multi catching não anula a importancia do conhecimento hierarquico das esceções, pois `só é possível capturar mais de uma exceção em uma única linha se ambas exceções estiverem no mesmo nível hierárquico`. Exemplo:

```java
try {
// ...Exemplo
} catch (Exception | RuntimeException e) {
    System.out.println("Exception | RuntimeException");
    e.printStackTrace();
}
```

Não é possível compilar o exemplo acima, pois `Exception` é "pai" de `RuntimeException`; e não "irmão".

Exemplo Válido:

```java
public static void main(String[] args) {
    try {
        exampleMethod();
    } catch (ArrayIndexOutOfBoundException | StringIndexOutOfBoundException e) {
        System.out.println("ArrayIndexOutOfBoundException | StringIndexOutOfBoundException");
        e.printStackTrace();
    } catch (IndexOutOfBoundException e) {
        System.out.println("IndexOutOfBoundException");
        e.printStackTrace();
    }
}

public static void exampleMethod() throws ArrayIndexOutOfBoundException, StringIndexOutOfBoundException {
    //...
}
```