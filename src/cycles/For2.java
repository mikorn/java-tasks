package cycles;

import java.util.Scanner;

public class For2 {

    public static void main(String[] args) {

        System.out.println("Программа расчета таблицы умножения.");
        Scanner input = new Scanner(System.in);
        System.out.print("Введите число a: ");
        double a = input.nextDouble();

        for (int i = 1; i < 10; i++) {
            System.out.println(a + " * " + i + " = " + (a * i));
        }

    }

}
