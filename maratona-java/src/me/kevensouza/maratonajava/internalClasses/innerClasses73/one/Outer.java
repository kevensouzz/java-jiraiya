package me.kevensouza.maratonajava.internalClasses.innerClasses73.one;

public class Outer {
    private String nome = "Keven";

    class Inner {
        public void clbcKenga() {
            System.out.println(nome + " mandou calar a boca");
        }
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        Inner inner = outer.new Inner();
        inner.clbcKenga();
    }
}