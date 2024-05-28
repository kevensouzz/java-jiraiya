# String

String não é um tipo primitivo, é o que costumamos chamar de Reference Type (Tipo de refereência). Por quê?

No java, `String` é uma classe. Tanto é que se declararmos uma variável com tipo `string`, teremos erro, pois, como sabemos, classes no java, seguem o padrão `Upper Camel Case`.

Diferente do tipo `Char` que usamos `aspas simples` nos valores... com `String` se usa `aspas duplas`.

```java
  char letra = 'K';

  String nome = "Keven";
```

podemos dizer que Sting equivale a uma abstração de uma cadeia de caractéres...

```java
  char[] nome = {'K', 'E', 'V', 'E', 'N'};
```
