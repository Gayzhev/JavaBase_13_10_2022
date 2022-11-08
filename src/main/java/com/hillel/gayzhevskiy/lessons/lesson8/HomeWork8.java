package com.hillel.gayzhevskiy.lessons.lesson8;

/* Зробити гру, в якій потрібно відгадати ціле число, яке "загадав" комп'ютер у діапазоні від 0 до 10
Користувач повинен мати можливість вгадувати в кілька спроб (мінімум 3). */


import java.util.Random;
import java.util.Scanner;

public class HomeWork8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberUgaday = 1;
        int numberProg = (int) (Math.random() * 10);
        while (true) {
            System.out.println("Введите число от 1 до 10");
            if (scanner.hasNextInt()) {
                numberUgaday = scanner.nextInt();
                if (numberProg == numberUgaday) {
                    System.out.println("Вы угадали");
                    break;
                }

            } else {
                if (numberProg < numberUgaday) {
                    System.out.println("Моё число меньше.");
                } else {
                    System.out.println("Моё число больше.");
                }
            }


        } else{
            System.out.println("Ваше число не входит в массив от 1 до 10");
            scanner.next();
        }
    }
}






