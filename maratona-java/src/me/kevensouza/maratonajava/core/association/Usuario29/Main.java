package me.kevensouza.maratonajava.core.association.Usuario29;

import me.kevensouza.maratonajava.core.association.Usuario29.domain.Conta;
import me.kevensouza.maratonajava.core.association.Usuario29.domain.Usuario;

public class Main {
    public static void main(String[] args) {
        Usuario castiel = new Usuario("Castiel", "castiel@anjo.com", "senha enoqueana");
        Usuario bob = new Usuario("Robert Singer", "bob@winchester.com", "malditos demônios");
        Usuario lucifer = new Usuario("Lúcifer", "lucifer@arcanjo.com", "o papai foi comprar cigarro");
        Usuario cain = new Usuario("Caín", "cain@escuridao.com", "devolva a marca");

        Conta ceu = new Conta("Céu", "proteção divina", 'A', castiel, bob);
        Conta inferno = new Conta("Inferno", "proteção demoníaca", 'Z', lucifer, cain);

        Usuario crowley = new Usuario("Crowley", "crowley@encruzilhada.com", "olá rapazes:|", ceu, inferno);
        Usuario ruina = new Usuario("Ruína", "ruina@bruxaria.com", "Ooi Sam", inferno, ceu);
        Usuario mrcat = new Usuario("Mr. Cat", "Cat@homensbritanicosdeletras.com", "olá rapazes:)", ceu);

        castiel.setContas(ceu);
        bob.setContas(ceu);
        lucifer.setContas(inferno);
        cain.setContas(inferno);
        crowley.setContas(ceu, inferno);
        ruina.setContas(inferno, ceu);

        ceu.setUsuarios(castiel, bob, crowley, ruina, mrcat);
        inferno.setUsuarios(lucifer, cain, crowley, ruina);

        for (Usuario usuario: ceu.getUsuarios()) {
            System.out.println(usuario.getNome());
            System.out.println(usuario.getEmail());
            System.out.println(usuario.getSenha());
        }

        System.out.println();

        for (Usuario usuario: inferno.getUsuarios()) {
            System.out.println(usuario.getNome());
            System.out.println(usuario.getEmail());
            System.out.println(usuario.getSenha());
        }
    }
}
