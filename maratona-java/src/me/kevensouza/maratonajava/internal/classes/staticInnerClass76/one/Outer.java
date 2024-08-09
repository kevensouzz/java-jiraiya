package me.kevensouza.maratonajava.internal.classes.staticInnerClass76.one;

public class Outer {
    private String name = "Keven";

    static class Inner {
        public void printOuterClassAttribute() {
            System.out.println(new Outer().name);
        }
    }

    public static void main(String[] args) {
        Inner inner = new Inner();
        inner.printOuterClassAttribute();
    }
}
