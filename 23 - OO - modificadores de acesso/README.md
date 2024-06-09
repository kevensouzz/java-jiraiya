# Modificadores de acesso

Até aqui, todos os atributos declarados foram usando o `modificador de acesso Público` onde toda e qualquer instância da classe podem pegar ou atribuir valores ao atributo...
<br />
Exemplo:

```java
  public class Pessoa {
    public String nome;
  }
```
```java
  public Class Main {
    public static void main(String[] args) {
      Pessoa pessoa = new Pessoa();
      pessoa.nome = "Keven";
      System.out.println(pessoa.nome);
    }
  }
```

exlporando outros modificadores de acesso, mais especificamente o `privado`, que é disparadamente o mais ultilizado para declaração de atribútos nas aplicações java, automáticamente, é aberto um grande leque de possibilidades de desenvolver...

## Modificador de acesso `Privado`

Declarando atributos privados, anula as possibilidades de setar e pegar os valores das variáveis diretamente, o que acaba melhorando a experiência de desenvolvimento e dando mais "segurança" aos atributos.

### Getters & Setters

Já que atributos privados não podem ser diretamente acessados, existem os `métodos de acesso` que permitem setar **(setters)**, e pegar **(getters)** valores de atributos.
<br />
Observe o código abaixo e os comentários:

```java
public class Pessoa {
  private String nome;

  // métodos de acessos são sempre publicos.
  public void setNome(String nome) {
    // quando existem dois métodos com o mesmo nome dentro de um escopo local, deve se usar o "this" para referenciar o atributo global/da classe.
    this.nome = nome;
  }

  public String getNome() {
    // quando não tem outro atrbuto local com o mesmo nome, não é necessário usar o "this". Usamos por convenção.
    return this.nome;
  }
}
```
```java
  public class Main {
    public static void Main(String[] args) {
      Pessoa pessoa = new Pessoa();
      pessoa.setNome("Keven");
      System.out.println(pessoa.getNome());
    }
  }
```

### Sobrecarga de Métodos e método Init

Em uma classe onde se tem muitos atributos, consquentemente, terá muitos métodos de acesso.
<br />
Pra esses casos, pode ser útil o `método init` que pode mesclar todos os `métodos de setters` para um só método, desta forma:

```java
public class Pessoa {
  private String nome;
  private short idade;
  private char sexo;

  public void init(String nome, short idade, char sexo) {
    this.nome = nome;
    this.idade = idade;
    this.sexo = sexo;
  }

  //...Getters
}
```

Isso pode ocasionar em alguns problemas, pois funciona como um contrato, se voce quiser adicionar um novo atributo à classe, terá obregação que implementá-lá também, em todas as instâncias dessa classe, logo, em um projeto muito grande, com muitas instâncias, pode acabar atrapalhando.
<br />
É aqui que entra a `sobrecarga de métodos`...

dentro de uma única classe, é possível ter mais de um `método init`. Desta forma podemos ter métodos que recebem **quantos** e **quais** parâmetros nós quisermos...
<br />
Observe:

No exemplo abaixo foi usado vários métodos init um dentro do outro, dando a opção de setar somente o atributo desejado.

[Exemplo de classe usando sobrecarga de métodos](../maratona-java/src/me/kevensouza/maratonajava/core/classes/pessoa22/)

```java
  public class Pessoa {
    private String nome;
    private short idade;
    private char sexo;
    private float altura;
    private float peso;

    public void init(String nome) {
        this.nome = nome;
    }

    public void init(String nome, short idade) {
        this.init(nome);
        this.idade = idade;
    }

    public void init(String nome, short idade, char sexo) {
        this.init(nome, idade);
        this.sexo = sexo;
    }

    public void init(String nome, short idade, char sexo, float altura) {
        this.init(nome, idade, sexo);
        this.altura = altura;
    }

    public void init(String nome, short idade, char sexo, float altura, float peso) {
        this.init(nome, idade, sexo, altura);
        this.peso = peso;
    }

//...getters
}
```