# interface

[Interfaces](../maratona-java/src/me/kevensouza/maratonajava/core/intefaces/)

A princípio Interfaces foram implementadas no java para substituir as classes abstratas e fazer o papel de template para as subclasses.
<br>
Características que diferenciam uma `Interface` de uma `Classe Abstrata`:

- É mais enxuta, pois não tem a possibilidade de usar algumas funcionalidades de uma classe. Ex: construtores
- Por padrão seus métodos são `Públicos` e `Abstratos`
- Ao invés de usar `extends` nas subclasses, é usado `implements`
- É possível implementar múltiplas interfaces a uma classe

### implementação de métodos concretos em interfaces

Como métodos abstratos exigem ser sobrescitos por todas as subclasses... pensando em contexto de aplicaçõs robustas, ou interfaces que são frequentemente implementadas nos projetos, como por exemplo a interface `Collection`, no Java 8 foram implementados os métodos concretos nas interfaces.
<br>
Dessa forma, novos métodos de uma classe, podem ter sua sobrescrita opcional.

```java
public interface DataLoader {
    // método abstrato
    void load();

    // método concreto
    default void checkPermission() {}
}
```

----------

Outro detalhe importante, os métodos declarados em uma interface não podem ser sobrescritos com um modificador de acesso com mais restrição.
<br>
Ordem de restriçao por modificador de acesso:

1. private
2. default
3. protected
4. public

```java
public interface ExampleInterface {
    default void findAll() {

    }
}

public class ExampleClass implements ExampleInterface {
    @override
    protected void findAll() {
        // pode ser sobrescrito default, protected ou public 
    }
}
```