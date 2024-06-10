# Construtores

[Exemplo de classe usando contrutores](../maratona-java/src/me/kevensouza/maratonajava/core/construtores/pessoa23/)

O construtor é um `método mágico` que é executado antes de qualquer outro método, está presente em todas e quaisquer classes e necessáriamente, todas as classes tem um construtor, por mais que não seja escrita manualmente na classe. O compilador adiciona um construtor vazio automáticamente quando a classe não tem um contrutor no código fonte.

Um construtor de uma classe tem o mesmo nome da classe e não retorna absolutamente nada, nem mesmo o tipo `void`.
<br />
Se você setar um tipo de retorno a um método com o mesmo nome da classe, não será um construtor, veja:

```java
public class Pessoa() {
  //...
  // construtor
  public Pessoa() {

  }

  // método
  public void() {

  }
}
```

## Como é usado?

Um construtor é usado para setar valor aos atributos de uma classe assim que instanciada. Exemplo:

```java
  public class Pessoa {
    //...
    public Pessoa(String nome, int idade) {
      this.nome = nome;
      this.idade = idade;
    }
    //...
  }
```
```java
public class Main {
  public static void main(String[] args) {
    Pessoa pessoa = new Pessoa("Keven, 18");
  }
}
```

No exemplo acima, a instância da classe Pessoa necessariamente deve setar o nome e a idade.

Assim como os métodos `init()`, os construtores também tem `sobrecarga de métodos`, segue um exemplo de classe com um construtor que permite que a instância...

- não atribua nenhum valor a algum atributo
- atribua valor a um atributo
- atribua valor a dois atributos

```java
public class Pessoa {
  private String nome;
  private int idade;

  public Pessoa() {}

  public Pessoa(String nome) {
    this.nome = nome;
  }

    public Pessoa(String nome, int idade) {
    this(nome);
    this.idade = idade;
  }
}
```

Repare que, diferente dos métodos init(), pra usar a sobrecarga de métodos basta usar `this()` e passar como o parâmetro os argumentos requiridos de algum outro construtor, o java fará o trabalho de identificar o contrutor referente.

## Bloco de Inicialização

Até onde sabemos no momento, só há uma coisa executada antes dos construtores e depois da alocação da classe na memória e da atribuição default dos atributos... são esses os Blocos de inicializaçao.

que nada mais é que um bloco de código escrito entre um par de chaves `{}`. è recomendado em caso de necessidade de executar algum bloco de código independete de qual construtor será executado na instância.

No exemplo abaixo, será atribuído 100 posições com valores sequenciais e printará o valor de cada posição sempre que a classe for instanciada.

```java
  public class Anime {
    private String nome;
    private short[] episodios;

    // costumam ser declarados depois dos atributos e antes do resto...
    // mas o lugar onde é declarado não vai mudar a ordem de execução.
    {
        this.episodios = new short[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = (short) (i + 1);
            System.out.println(episodios[i]);
        }
    }

    public Anime() {
    }

    public Anime(String nome) {
        this.nome = nome;
    }
}
```