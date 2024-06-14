# Herança

[Herança](../maratona-java/src/me/kevensouza/maratonajava/core/heranca/)

Herança é um funcionalidade da Orientação a Objetos que permite que uma classe faça proveito de métodos e atribútos de outra classe.
<br />
Exemplo:

Temos uma classe `Pessoa` e uma classe `Funcionário`. Um funcionário é uma Pessoa, logo, convém extender a classe Pessoa...

```java
public class Pessoa {
    protected String nome;
    protected String cpf;
    protected Endereco endereco;
```

```java
public class Funcionario extends Pessoa {
```

Agora, a classe `Funcionário` pode acessar os atributos e métodos da classe `Pessoa`, repare que, os modificadores de acesso dos atributos de Pessoa, agora, são `protected`.

A diferença de atributos `protected` para  os `private` é que dessa forma, as *sub classes/classes filhas* podem acessar esses atributos da classe pai com o this, como se fossem seus próprios atributos.

## Construtores

Quando temos ao menos um construtor com atributos na classe pai, precisamos ter/chamar esses mesmo construtor em todas as sub classes. Exemplo:

```java
// Pessoa
    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public Pessoa(String nome, String cpf, Endereco endereco) {
        this(nome, cpf);
        this.endereco = endereco;
    }

// Funcionário
    public Funcionario(String nome, String cpf, float salario) {
        super(nome, cpf);
        this.salario = salario;
    }

    public Funcionario(String nome, String cpf, Endereco endereco, float salario) {
        super(nome, cpf, endereco);
        this.salario = salario;
    }
```

Da forma escrtia acima não podemos instanciar a classe Funcionário ou Pessoa sem passar nada, caso queira ter a liberdade de instanciar a classe Funcionário sem passar nada no construtor, é necessário ter um construtor vazio na classe Pai também...

```java
// pessoa
    public Pessoa() {
    }

// funcionario
    public Funcionario() {
    }
```

## Sobrescrevendo Métodos

Na classe Pessoa, temos um método que imprime os valores atribuidos a instância dos objetos, também podemos usar esse método sendo chamado de uma instância da classe Funcionário, mas, e se quisermos imprimir os valores dos atributos da classe filho?

```java
    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.cpf);
        System.out.println(this.endereco.getRua());
        System.out.println(this.endereco.getCep());
    }
```

Caso seja desejável imprimir algum atributo da classe filho, temos que sobresecrever o método...
<br>
Pra isso devemos criar um método idêntico, com o mesmo nome, e mesmos parâmetros, costuma-se usar a anotação `@Override` para garantir que realmente é uma sobrescrição de método,.

```java
    @Override
    public void imprime() {
        super.imprime();
        System.out.println(this.salario);
    }
```

Note que na primeira linha, estamos chamando o próprio método, mas vindo da classe pai, usando o `super`.
<br>
Se tirassemos isso, ao chamar esse método, seria impresso somente o `this.salario`.

## O pai de todas as classes Java

Por mais que ao criarmos um classe java, não aparente, todas as classes são sub classes de uma outra.

A classe `Object` é a super classe de todas as outras. esse é o motivo pelo qual temos acesso aos seguintes métodos:

![métodos da classe Object](images/métodos%20da%20classe%20Object.png)

Para usar os métodos públicos da classe Object é necessário sobrescrever os métodos na classe que deseja usar, nesse caso, o intellij já ajuda fazer isso usando o comando `alt + ins` e selecionando o método que deseja.
<br>
Exemplo: [sobrescrição do método toString](../maratona-java/src/me/kevensouza/maratonajava/core/heranca/anime33/)

Contudo, as heranças também modifica a ordem de inicialização que conhecemos até agora...

1. Blocos de inicialização estáticos da(s) super classes
2. Blocos de inicialização estáticos da(s) sub classes
3. Blocos de inicialização normal da(s) super classes
4. Construtores das Super classes
5. blocos de inicialização das subclasses
6. Construtores das Sub classes

![ordem de inicialização](images/ordem%20de%20inicialização.png)