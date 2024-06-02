package me.kevensouza.maratonajava.intro;

public class ArraysMultidimensionais13 {
    public static void main(String[] args) {
        int[][] yearDays = new int[12][];
        boolean isLeapYear = false;

        for (int i = 0; i < yearDays.length; i++) {
            switch (i) {
                case 0:
                    yearDays[i] = new int[31];
                    System.out.print("Janeiro");
                    break;

                case 1:

                    if (isLeapYear) {
                        yearDays[i] = new int[29];
                    } else {
                        yearDays[i] = new int[28];
                    }

                    System.out.print("Fevereiro");
                    break;

                case 2:
                    yearDays[i] = new int[31];
                    System.out.print("Março");
                    break;

                case 3:
                    yearDays[i] = new int[30];
                    System.out.print("Abril");
                    break;

                case 4:
                    yearDays[i] = new int[31];
                    System.out.print("Maio");
                    break;

                case 5:
                    yearDays[i] = new int[30];
                    System.out.print("Junho");
                    break;

                case 6:
                    yearDays[i] = new int[31];
                    System.out.print("Julho");
                    break;

                case 7:
                    yearDays[i] = new int[31];
                    System.out.print("Agosto");
                    break;

                case 8:
                    yearDays[i] = new int[30];
                    System.out.print("Setembro");
                    break;

                case 9:
                    yearDays[i] = new int[31];
                    System.out.print("Outubro");
                    break;

                case 10:
                    yearDays[i] = new int[30];
                    System.out.print("Novembro");
                    break;

                case 11:
                    yearDays[i] = new int[31];
                    System.out.print("Dezembro");
                    break;
            }

            for (int j = 0; j < yearDays[i].length; j++) {
                yearDays[i][j] = j + 1;

                if (yearDays[i][j] == yearDays[i].length) {
                    System.out.print(" tem " + yearDays[i][j] + " dias.");
                }
            }

            System.out.print("\n");
        }
    }
}
