package control;

import java.util.Scanner;

public class IfElse1 {

    public static void main(String[] args) {

        System.out.println("Игра в вопросы и ответы.");
        System.out.println();

        Scanner input = new Scanner(System.in);

        System.out.println("Назовите столицу Испании:");
        System.out.println("1. Валенсия.");
        System.out.println("2. Мадрид.");
        System.out.println("3. Барселона.");
        System.out.println("4. Лиссабон.");
        System.out.println();
        System.out.println("Ваш ответ:");
        int a = input.nextInt();

        if (a == 2) {
            System.out.println("Правильно! Вы заработали 1000 баллов.");
            System.out.println();
            System.out.println("Следующий вопрос. В каком году состоялась Курская битва?");
            System.out.println("1. 1916.");
            System.out.println("2. 1942.");
            System.out.println("3. 1943.");
            System.out.println("4. 1944.");
            System.out.println();
            System.out.println("Ваш ответ:");
            int b = input.nextInt();

            if (b == 3)
                System.out.println("Правильно! Вы заработали 2000 баллов.");
            else
                System.out.println("К сожалению, ответ неправильный.");
        }
        else
            System.out.println("К сожалению, ответ неправильный.");

    }

}
