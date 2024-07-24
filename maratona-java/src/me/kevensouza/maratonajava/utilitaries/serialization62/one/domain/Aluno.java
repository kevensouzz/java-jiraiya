package me.kevensouza.maratonajava.utilitaries.serialization62.one.domain;

import java.io.Serializable;

public class Aluno implements Serializable {
    private static final long serialVersionUID = -7527236808924993394L;
    private long id;
    private String usernome;
    private transient String password;

    public Aluno(long id, String usernome, String password) {
        this.id = id;
        this.usernome = usernome;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "id=" + id +
                ", usernome='" + usernome + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsernome() {
        return usernome;
    }

    public void setUsernome(String usernome) {
        this.usernome = usernome;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
