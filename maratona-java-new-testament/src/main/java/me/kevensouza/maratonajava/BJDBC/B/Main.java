package me.kevensouza.maratonajava.BJDBC.B;

import me.kevensouza.maratonajava.BJDBC.B.model.Producer;
import me.kevensouza.maratonajava.BJDBC.B.repository.ProducerRepository;

public class Main {
    public static void main(String[] args) {
        System.out.println(ProducerRepository.save(new Producer("Yoshihiro Togashi", 58)));
    }
}
