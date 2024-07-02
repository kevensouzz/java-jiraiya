package me.kevensouza.maratonajava.core.intefaces.database38.domain;

import me.kevensouza.maratonajava.core.intefaces.database38.domain.interfaces.DataLoader;
import me.kevensouza.maratonajava.core.intefaces.database38.domain.interfaces.DataRemover;

public class FileLoader implements DataLoader, DataRemover {
    @Override
    public void load() {
        System.out.println("carregando do arquivo");
    }

    @Override
    public void remove() {
        System.out.println("removendo do arquivo");
    }
}
