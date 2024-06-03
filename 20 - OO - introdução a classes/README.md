# Introdução a classes

[Example Student Class](../maratona-java/src/me/kevensouza/maratonajava/core/intro/classes/student20/)

Um dos propósitos pelo qual foi criada a `Orientação a Objetos` é `mapear/abstrair` o mundo real dentro dos códigos.

Nessa aula foram introduziadas as Classes, um elemento muito usado na Orientação a Objetos.
<br />
Um dos problemas que as Classes resolvem é guardar um conjunto de informações corelacionadas em um único lugar na memória.
<br />
Exemplo:

Criando as seguintes variáveis, conseguimos logo associar que tem relação a informações de uma pessoa:
```java
  String name;
  int age;
  char gender;
```
Porém na prática essas variáveis pode não ter relação nenhuma no código.

Segue um exemplo de Classe de Pessoa:

```java
public class Person {
  public String name;
  public int age;
  public char gender;
} 
```
Repare que:

1. antes de cada variável tem `public`. é um `modificador de acesso`.
2. a partir de quando um variável tem um modificador de acesso, passam a ser chamadas de `atributo`.
3. se um atributo é `público`, pode ser acessado e alterado de qualquer parte do código.

----------

Executando o essa classe não aconteceria nada, mesmo se tivesse uma linha printando as variáveis. Por quê?
<br />
Pra um Programa Java ser executado, ele precisa ter um `método` `main`, que não é o caso dessa classe.

Mas podemos fazer isso em outro arquivo com uma classe que inclui o método main:

```java
public class RunPerson {
    public static void main(String[] args) {
        Person person = new Person();

        person.idade = 18;
        person.nome = "Keven";
        person.sexo = 'M';

        System.out.println(person.nome);
        System.out.println(person.idade);
        System.out.println(person.sexo);
    }
}
```