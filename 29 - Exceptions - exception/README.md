# Exception

[Exception](../maratona-java/src/me/kevensouza/maratonajava/exceptions/exception42/Main.java)

Vamo ver como funciona o lançamento de uma exceção, usando como exemplo a `IOException`, que é uma Unchecked/RuntimeException.

importando as classes `java.io.file` e `java.io.IOException` e chamando o método **createFile()** no método main.

```java
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        createFile();
    }
}
```

agora, observamos no código abaixo uma tratativa de exceção com Try Catch:

```java
    private static void createFile() {
        // cria uma nova instância da classe File, passando o caminho e o nome do arquivo como argumento do construtor
        File file = new File("pasta/file.txt");

        try {
            // guarda um valor booleano quanto à criação do arquivo
            boolean isCreatedFile = file.createNewFile();
            // printa "is created file: True" caso o arquivo tenha sido criado com êxito
            System.out.println("is created file: " + isCreatedFile);
        } catch (IOException e) {
            // retorna informações da IOException caso o arquivo não possa ser cria do ela seja lançada
            e.printStackTrace();
        }
    }
```

### O que acontece no bloco Try Catch acima?

1. o método createNewFile() é executado para a criação do arquivo
2. caso o arquivo não seja criado o bloco de código pula a linha do `SOUT` e em seguida executa o método printStackTrace() da variável `e` que corresponde à IOException

----------

Pra usar o IOException dentro do Catch, é necessário ter um método no Try que permite lançar essa exceção.
<br>
Como por exemplo o método `createNewFile()`


```java
public boolean createNewFile() throws IOException {
    //...
}
```

----------

Um detalhe importante é não deixar o bloco Catch vazio, pois não faz o mínimo sentido usar o Try Catch e não lançar a exceção caso ela aconteça.