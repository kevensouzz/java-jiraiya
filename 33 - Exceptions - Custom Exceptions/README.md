# Custom Exceptions

[Custom Exception](../maratona-java/src/me/kevensouza/maratonajava/exceptions/customException44/)

É possível e muito simples criar uma exceção customizada, Embora o java já tenha exceções pra muito tipo de coisa, as vezes são necessáras exceções customizadas.

Basta seguir esses passos:

- Criar uma classe com o nome da exceção desejada, `InvalidLoginExceptions` por exemplo
- Extender uma exceção baseado no seu interesse
    - `Exception` caso queira criar uma Checked Exception
    - `RuntimeException` caso queria uma Unchecked Exception
- Sobrecarregar o construtor baseado no que você costumizar

Exemplo:

```java
                                               // Checked Exception
    public class InvalidLoginException extends Exception {
    public InvalidLoginException() {
              // Custom Message
        super("Invalid username or password");
    }
}
```

Dessa forma a exceção já tá pronta pra uso, como no exemplo acima a exceção é checada é necessário que ela seja capturada ou tenha a responsabilidade repassada para outro método, dessa forma:

```java
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your username: ");
        String username = scanner.nextLine();

        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        try {
            System.out.println(login(username, password));
        } catch (InvalidLoginException e) {
            throw new RuntimeException(e);
        }
    }

    public static String login(String username, String password) throws InvalidLoginException {
        User[] users = {new User("Keven", "keven123"), new User("John", "john123"), new User("Junior", "junior123")};

        for (User user : users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                return "Logged in successfully!";
            }
        }

        throw new InvalidLoginException();
    }
}
```