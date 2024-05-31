package me.kevensouza.maratonajava.intro;

public class condicionaisExercise07 {
    public static void main(String[] args) {
        byte day = 4;

        switch (day) {
            default:
                System.out.println("esse dia não existe");
                break;

            case 1:
            case 7:
                System.out.println("Dia Inútil");
                break;

            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia Útil");
                break;
        }
    }
}
