# finally

Assim como já vimos o tratamento de exceções com Try Catch , o Finally também pode ser adicionado a esse conjunto, o comportamento do `Bloco Finally` é o seguinte:

Indenpendente se for lançada uma exceção, seja lá que tipo for, o bloco Finally será executado.
<br>
Um bom caso de uso do bloco finally é uma conexão com banco de dados para fazer uma consulta:

```java
    db.init();

    try {
        // ... database query
    } catch (Exception e) {
        e.printStackTrace();
    } finally {
        db.quit();
    }
```