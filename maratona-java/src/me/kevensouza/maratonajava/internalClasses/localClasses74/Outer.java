package me.kevensouza.maratonajava.internalClasses.localClasses74;

public class Outer {
    private String name = "Keven";

    public void localClass() {
        String lastName = "Souza";

        class Inner {
            void print() {
                System.out.println("\"sfd man!\"\n- ass: " + name + " " + lastName);
            }
        }

        new Inner().print();
    }

    public static void main(String[] args) {
        new Outer().localClass();
    }
}
