# Casting

De forma simplificada, `Casting` é forçar uma variável de um determinado tipo armazenar um valor que corresponse ou deveria corresponder a outro tipo.

Dependedo do contexto, pode ser útil, vejamos como isso funciona:

```java

int valor = (int) 1000L;

```

No exemplo acima, usamos a letra `L` no final do valor, isso serve para indicar que o valor é de tipo `Long`, e `(int)` é a sintaxe do Casting, indica que eu quero que indenpendente do valor, quero que seja armazenado na variavel de tipo `int`.

Neste caso, o valor é `1000`, que pode ser armazenado como `int` sem grandes problemas, mas e se usassemos `10000000000`?

Desta forma, independente se o valor seja explicitamente de tipo `Long`, o java converterá para `int`.
<br/>
E como esse valor não pode ser armazenado dentro de um `int` o java simplismente vai ignorar alguns bytes e retornar um valor cortado.

Esse mesmo comportamento também se aplica a `float` e `Double`.
<br/>
Por padrão, números decimais são `double`. E são usadas as letras `f` e `d` ao final do valor para explicitar o tipo, igual ao `long`.