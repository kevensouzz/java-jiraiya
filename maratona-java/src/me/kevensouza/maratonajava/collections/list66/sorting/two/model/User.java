package me.kevensouza.maratonajava.collections.list66.sorting.two.model;

import java.util.Objects;

public class User implements Comparable<User> {
    private Long id;
    private String username;
    private String password;

    public User(Long id, String username, String password) {
        if (id == null || username == null || password == null) {
            throw new NullPointerException("Fields cannot be null");
        }

        if (username.isEmpty() || password.isEmpty()) {
            throw new IllegalArgumentException("Fields cannot be empty");
        }

        if (id < 0) {
            throw new IllegalArgumentException("Id cannot be negative");
        }

        if (username.length() < 3 || username.length() > 12) {
            throw new IllegalArgumentException("Username must be between 3 and 12 characters");
        }

        if (password.length() < 8 || password.length() > 32) {
            throw new IllegalArgumentException("Password must be between 8 and 32 characters");
        }

        this.id = id;
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return Objects.equals(getId(), user.getId()) && Objects.equals(getUsername(), user.getUsername()) && Objects.equals(getPassword(), user.getPassword());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getUsername(), getPassword());
    }

    @Override
    public int compareTo(User o) {
        return this.getId().compareTo(o.getId());
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
