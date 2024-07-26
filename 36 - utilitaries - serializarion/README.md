# Serialization

[Serialization](../maratona-java/src/me/kevensouza/maratonajava/utilitaries/serialization63/)

Serialização é a função de pegar um derminado objeto em memória e persistir ele, seja num banco de dadas, arquivo, ou seja lá o que for.
Nessa aula vamos persistir em um arquivo e em seguida ler o mesmo.

Pra isso criei uma classe Aluno implementando a Flag Interface `Implements` que serve apenas pra sinalizar ao java que é uma classe serializavel.

```java
    public class Aluno implements Serializable {
        // ...
    }
```

Na classe Principal criei um método estático onde recebe como argumento um Objeto `Aluno` e serializa o mesmo em um determinado Path/arquivo que deve ser passado de argumento como um newOutputStream para o método ObjectOutputStream, dessa forma:

```java
        private static void serialize(Aluno aluno) {
        Path path = Paths.get("pasta/aluno.ser");
        // note que a instância do ObjectOutputStream está sendo criado dentro de um Try With Resources pra aproveitar o fato de que ele pode lançar um IOException como também ele deve ser fechado no fim da execução, afinal, ele é um Stream.
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(Files.newOutputStream(path))) {
            objectOutputStream.writeObject(aluno);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
```

Podemos melhorar/deixar essa classe mais adepta a outros objetos, simplesmente trocando o parametro de `Aluno` pra `Object` e recebendo o Path pra serializar como argumento. Dessa forma:

```java
    public static void main(String[] args) {
        Path path = Paths.get("pasta/aluno.ser");
        Aluno aluno = new Aluno(1, "kev", "keven123");
       serialize(path, aluno);
    }

    private static void serialize(Path path, Object obj) {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(Files.newOutputStream(path))) {
            objectOutputStream.writeObject(obj);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
```

### Como podemos ignorar um atributo na serialização?

Em muitos casos uma classe contém um atributo cujo valor é sensível e não convém ser serializado, como por exemplo, uma senha.

À princípio, basta adicionar a flag `transient` na declaração do atributo.

```java
private transient String password;
```

É nesse momento que começa uma das complicações da (des)serialização kkkkk... quando serializado um objeto, o java fica responsável por gerar e atribuir um código/id tipo um hash baseado em sei lá o que pra identificar o objeto e dizer se ele pode ou não ser desserializado em algum momento.

Com isso, se por exemplo executarmos o método de serialização passando um objeto de tipo mais específico como `Aluno` ao invés de `Object` (o que é comúm e as vezes inevitável) o java lança uma exceção alegando que a classe é incompatível.

![alt](./img/serialize%20incompatible%20class%20exception%20.png)

Pra resolver esse pipino geralmente se ativa uma configuraçõa na IDE para serializar uma classe sem 'SerialVersionUID', no IntelliJ IDEA basta dar um `ctrl + shift + A` e pesquisar por Serializable Class Without 'SerialVersionUID' na aba `all` e ativar a configuração.

Dessa forma a JVM não mais será responsável por gerar o UID dos objetos serializados, e essa função foi passado para você kkkkk, mais especificamente para todas as classes que podem/vão em algum momento ser serializada...

pra definir esse fucking UID basta adicionar um `atributo estático e constante de tipo long chamado serialVersionUID com a anotação @Serial e definir qualquer valor aleatório pra ele`.

```java
    public class Aluno implements Serializable {
        @Serial
        private static final long serialVersionUID = 67821965589L;
        // ...
    }
```