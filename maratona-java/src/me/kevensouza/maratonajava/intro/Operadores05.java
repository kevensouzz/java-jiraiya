package me.kevensouza.maratonajava.intro;

public class Operadores05 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;

        // + - / * % ||| <- operadores aritiméticos
        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num2 - num1);
        System.out.println(num2 / num1);
        System.out.println(num1 * num2);
        System.out.println(num2 % num1);

        // > >= < <=  == !=  ||| <- operadores relacionais
        System.out.println(num1 > num2);
        System.out.println(num1 >= num2);
        System.out.println(num1 < num2);
        System.out.println(num1 <= num2);
        System.out.println(num1 == num2);
        System.out.println(num1 != num2);

        // !(NOT) &&(AND) ||(OR) <- operadores l[ogico
        System.out.println(num1 > 10 || num2 < 30);
        System.out.println(num1 > 10 && num2 < 30);
        System.out.println(!(num1 > 10));

        //  = += -= *= <- operadores de atribuição
        System.out.println(num1 += 100);
        System.out.println(num1 -= 5);
        System.out.println(num1 *= 3);
    }
}