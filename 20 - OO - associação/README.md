# Associação

[exmplos de associação](../maratona-java/src/me/kevensouza/maratonajava/core/association/)

Associação/Relacionamento de classes é algo bastante comúm no dia a dia. De forma resumida, associação de classes é referênciar uma classe para tipar um atributo de outra classe.

Exemplo de uma associação bidirecional (onde duas classes tem por exemplo, um atributo coujo tipo seja um array de outra classe):

*classe Usuário*
```java
public class Usuario {
    private String nome;
    private String email;
    private String senha;
    private Conta[] contas;
    //...
}
```

*classe Conta*
```java
public class Conta {
    private String nome;
    private String senha;
    private char acesso;
    private Usuario[] usuarios;
    //...
}
```

Note que a classe `Usuario` tem um atributo contas de tipo `Conta[]`
<br />
E a classe `Conta` tem um atributo usuarios de tipo `Usuario[]`

Esse é um exemplo de associação bidirecional, acessando o link do topo, se encontra exemplos de associação unidirecional, que, diferente da bidirecional, consiste em uma classe que pode ter um array(muitos) de outra classe, enquanto a outra classe no máximo tem um atributo de tipo referencial á um único objeto da outra classe.

- bidirecional (**muitos para muitos**)
- unidirecional (**um para muitos** ou **muitos para um** ou **um para um**)