# operadores

[Operadores05](../maratona-java/src/me/kevensouza/maratonajava/intro/Operadores05.java)

São elementos que nos permitem executar operações dentro do código, os mais conhecidos são:

- aritiméticos
- relacionais
- lógicos

### aritiméticos

são esses os operadores aritiméticos:

- `+` para soma.
- `-` para subtração.
- `/` para divisão.
- `*` para multiplicação.
- `%` para retornar o resto de uma divisão

examples:
```java
public class Operadores05 {
    public static void main(String[] args) {
        // + - / * ||| <- operadores aritiméticos
        int num1 = 10;
        int num2 = 20;
        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num2 - num1);
        System.out.println(num2 / num1);
        System.out.println(num1 * num2);
        System.out.println(num2 % num1);
    }
}
```

return: 

```console
30
-10
10
2
200
```

----------

### relacionais

sempre retornam valores booleanos (true, false).

- 0 `>` 1 **0 maior que 1**
- 0 `>=` 1 **0 maior ou igual a 1**
- 0 `<` 1 **0 menor que 1**
- 0 `<=` 1 **0 menor ou igual a 1**
- 0 `==` 1 **0 igual a 1**
- 0 `!=` 1 **0 diferente de 1**

examples:
```java
            // > >= < <=  == !=  ||| <- operadores relacionais
        int num1 = 10;
        int num2 = 20;
        System.out.println(num1 > num2);
        System.out.println(num1 >= num2);
        System.out.println(num1 < num2);
        System.out.println(num1 <= num2);
        System.out.println(num1 == num2);
        System.out.println(num1 != num2);
```

return:
```console
false
false
true
true
false
true
```

----------

### lógicos

também retornam booleanos (true, false).

- `!` **sinal de negação**
- `&&` **AND**
- `||` **OR**

examples:
```java
            // !(NOT) &&(AND) ||(OR) <- operadores l[ogico
        int num1 = 10;
        int num2 = 20;
        System.out.println(num1 > 10 || num2 < 30);
        System.out.println(num1 > 10 && num2 < 30);
        System.out.println(!(num1 > 10));
```

return:
```console
true
false
true
```

----------

### atribuição

atibuem um valor a variávelo ou atualizam um valor.

- =
- +=
- -=
- *=

examples:
```java
        //  = += -= *= <- operadores de atribuição
        int num1 = 10;
        int num2 = 20;
        System.out.println(num1 += 100);
        System.out.println(num1 -= 5);
        System.out.println(num1 *= 3);
```

return:
```console
110
105
315
```