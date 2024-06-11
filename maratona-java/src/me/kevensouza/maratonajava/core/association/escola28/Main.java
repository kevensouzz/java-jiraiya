package me.kevensouza.maratonajava.core.association.escola28;

import me.kevensouza.maratonajava.core.association.escola28.domain.Aluno;
import me.kevensouza.maratonajava.core.association.escola28.domain.Escola;
import me.kevensouza.maratonajava.core.association.escola28.domain.Professor;

public class Main {
    public static void main(String[] args) {
        Escola ETE = new Escola("ETE");

        Professor geraldo = new Professor("Geraldo", "Matemática", "Geografia");
        Aluno keven = new Aluno("Keven", (byte) 3, 'D', ETE);

        ETE.setAlunos(keven);
        ETE.setProfessores(geraldo);
        keven.setEscola(ETE);
        geraldo.setEscolas(ETE);

        System.out.println(ETE.getNome());
        System.out.println();

        for (Professor professor: ETE.getProfessores()) {
            System.out.println("<=- Professor -=>");
            System.out.print(professor.getNome() + " | (");

            for (String disciplina: professor.getDisciplinas()) {
                System.out.print(" " + disciplina);
            }
            System.out.print(" )\n");
        }

        for (Aluno aluno: ETE.getAlunos()) {
            System.out.println();
            System.out.println("<=- Aluno -=>");
            System.out.println("nome: " + aluno.getNome());
            System.out.println("Série: " + aluno.getSerie());
            System.out.println("Turma: " + aluno.getTurma());
        }
    }
}
