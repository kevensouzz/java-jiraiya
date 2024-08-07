# Classes Internas

Classes internas, basicamente são classe(s) dentro de outra(s). Sem trabalhar com interfaces gráficas, é um pouco difícil entender a utilidade...

Mas podemos imaginar a interface de um Chat de bate-papo, onde temos as mensagens enviadas e botões que chamam funções, como, `enviar mensagem`, `editar mensagem`, `deletar mensagem`, etc.

Dependendo da arquitetura/design de projeto usado, não faz tanto sentido deixar o código da funcionalidade de um botão separado do código de sua interface...

Pensando nesses casos de uso, que foi começado o uso de classes internas...

## Exemplo

Vamos pra um exemplo:

```java
public class Outer {
    private String nome = "Keven";

    // como podemos ver, temos uma classe dentro de outra
    // a classe inner vai ser "como se fosse" um método
    // porém, mais poderoso. pois poderá ter seus próprios e acessar diretamente os da classe que o engloba, além dos atributos
    class inner {}

    public static void main(String[] args) {

    }
}
```

Talvez o propósito mais comúm para o uso de classes internas é de criar métodos em uma classe interna pra ser usada somente naquela classe qua a engloba.

Mais acima falei que uma classe interna é "como se fosse" um método, porque assim como métodos, as classes tem seus modificadores de acesso... `public`, `private`, `protected` e o default que seria o `package-private`, onde é acessível para classes do mesmo pacote.

Como o método `main` fica ao mesmo nível de uma classe interna, é necessário instanciar a classe *externa* para poder acessar os métodos da classe interna...

```java
public class Outer {

    class Inner {
        public void printaAlgo() {
            System.out.println("algo");
        }
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        Inner inner = outer.new Inner();
        inner.printAlgo();
    }
} 
```