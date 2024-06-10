# comentários no java

Não muito diferente das outras linguagens, o java tem 3 tipos de comentários:

- inline
- block
- javadoc

### inline

```java
  // System.out.println("Inline comment!")
```

### block

```java
/*
  public static void main(Strings[] args) {
    System.out.println("Block comment!")
  }
*/
```

### javadoc

```java
/**
 * essa função printa "Hello!" no console
 */
  public static void sayHello() {
    System.out.println("Hello!")
  }
```

Não é recomendado encher o código de comentários, segundo o livro Clean Code, pois o seu código deve ser legível o suficiente para não precisar de comentários, mas isso não é uma regra...

Já os comentários `Javadoc` são um pouco diferente... esses são os comentários de documentação, quando você passa o mouse ou presiona `ctrl + Q` na função println do java, por exemplo, é exibido na tela algumas instruções sobre essa função, navegando até o código dessa função por `ctrl + click`, se deparamos com os mesmos comentários javadoc que foram exibidos ao pressionar `ctrl + Q` na função. Logo, esse tipo de comentário é julgado até necessário para os métodos públicos do seu código.

----------
### CTRL + Q
![println javadoc](images/printl%20javadoc.png)

----------
### CTRL + CLICK
![javadoc in code](images/javadoc%20in%20code.png)