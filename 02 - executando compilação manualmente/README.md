# Executando compilação manualmente

Classes no java seguem padrão Upper CamelCase.

- primeira letra sempre maiúscula
- caso seja um nome composto se remove o espaço entre as palavras e torna a primeira letra de cada palavra maiúscula

----------
***exemplo:***

Upper Camel Case >>> UpperCamelCase

```java
  public class UpperCamelCase {}
```

tecnicamente é possivel começar os nomes das classes com uma letra minúscula, mas isso estaria fugindo das boas práticas do java.

### Convenções

Como o java é orientado a objetos, se costuma utilizar classe, atributos, métodos, etc.

para simplificar um pouco... em relação à programação funcional

- métodos - funções
- atributos - variáveis

classes e métodos abragem blocos de código que costuma se chamar de escopo.
É o que fica entre chaves `{}`.

**System.out.println** é método nativo do java usado para printar um valor que é passado como argumento dentre parênteses `()`.

exemplo:

```java
  System.out.println("KA-ME HA-ME HAAA!");
```

declaração de atributos ou chamada de métodos não criam novos blocos de código, logo não é necessário o uso das chaves `{}`, ao invés disso, se usa o semicolon, famoso "ponto e vírgula" `;`.

### Mão na massa

Para nosso exemplo de compilação criaremos uma classe java chamada `KameKameHa` dentro de um arquivo `KameKameHa.java`.

Observação: o arquivo **DEVE** ser nomeado letra por letra idênticamente igual ao nome da classe.

```java
  public class KameKameHa {}
```

Dentro da classe teremos nosso método `main` que simplesmente printará `KA-ME HA-ME HAAA!`.

```java
  public class KameKameHa {

    public static void main(String[] args) {
      System.out.println("KA-ME HA-ME HAAA!");
    }
  }
```

Ok! feito isso, nosso exemplo está pronto, agora só resta:
- usar o JAVAC para compilar nosso arquivo .java para bytecode ou (código binário), que terá a extensão .class
- usar a JVM para rodar o arquivo com o bytecode gerado pelo compilador


### compilando

Precisamos abrir o terminal no diretório que está localizado o arquivo, e executar o comando:

```sh
  javac KameKameHa.java
```

Dessa forma, o compilador deve gerar um arquivo com o mesmo nome, mas com a extensão class. `KameKameHa.class`.

### executando

Com o Código compilado para bytecodes, a JVM já pode ler o conteúdo deste arquivo.
para isso, usamos o comando `java` no console do terminal:

```sh
  java code.KameKameHa
```

`Note que não se deve especificar a extensão .class!`

`E o nome do arquivo deve ser seguido pelo nome do diretório onde ele se localiza + .` No meu caso o diretório foi nomeado `code`.