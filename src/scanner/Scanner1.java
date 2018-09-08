package scanner;

import java.util.Scanner;

// Задаются 2 числа. Найти их сумму в третьей степени.

public class Scanner1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Введите число a: ");
        double a = input.nextDouble();

        System.out.print("Введите число b: ");
        double b = input.nextDouble();

        double c;
        c = Math.pow((a + b), 3);

        System.out.println(c);

    }

}