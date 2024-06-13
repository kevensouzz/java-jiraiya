package me.kevensouza.maratonajava.core.association.seminario31;

import me.kevensouza.maratonajava.core.association.seminario31.domain.Aluno;
import me.kevensouza.maratonajava.core.association.seminario31.domain.Local;
import me.kevensouza.maratonajava.core.association.seminario31.domain.Professor;
import me.kevensouza.maratonajava.core.association.seminario31.domain.Seminario;

public class Main {
    public static void main(String[] args) {
        Local localDoSeminarioDeEngSoftware = new Local("Sala 12, 3ºano 'D'");

        Seminario seminarioDeEngSoftware = new Seminario("Tipos de testes", localDoSeminarioDeEngSoftware);

        Professor manoelCabral = new Professor("Manoel Cabral", "Engenharia de Software", seminarioDeEngSoftware);

        Aluno kev = new Aluno("Keven", (short) 18, seminarioDeEngSoftware);
        Aluno negoBill = new Aluno("Willy", (short) 18, seminarioDeEngSoftware);
        Aluno rubs = new Aluno("Rubem", (short) 19, seminarioDeEngSoftware);
        Aluno leo = new Aluno("Lehonny", (short) 17, seminarioDeEngSoftware);
        Aluno mago = new Aluno("João Lima", (short) 18, seminarioDeEngSoftware);
        Aluno nego = new Aluno("João Nascmiento", (short) 19, seminarioDeEngSoftware);
        Aluno cabeza = new Aluno("Byanky", (short) 18, seminarioDeEngSoftware);

        seminarioDeEngSoftware.setAlunos(kev, negoBill, rubs, leo, mago, nego, cabeza);
    }
}
