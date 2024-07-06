package me.kevensouza.maratonajava.exceptions.TryWithResources43.model;

import java.io.*;

public class SecondReader implements Closeable {
    @Override
    public void close() throws IOException {
        System.out.println("SecondReader close");
    }
}
