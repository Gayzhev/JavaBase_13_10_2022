package com.hillel.gayzhevskiy.lessons.lesson8;

/* Зробити гру, в якій потрібно відгадати ціле число, яке "загадав" комп'ютер у діапазоні від 0 до 10
Користувач повинен мати можливість вгадувати в кілька спроб (мінімум 3). */


import java.util.Scanner;

public class HomeWork8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberUgaday = 10;
        int numberProg = (int) (Math.random() * numberUgaday);
        while (true) {
            System.out.println("Введите число от 1 до 10");
            if (scanner.hasNextInt()) {
                numberUgaday = scanner.nextInt();
                if (numberUgaday > 10 || numberUgaday < 1) {
                    System.out.println("Ваше число не входит в диапазон от 1 до 10");
                    break;
                }
                if (numberProg < numberUgaday) {
                    System.out.println("Моё число меньше.");
                } else if (numberProg > numberUgaday) {
                    System.out.println("Моё число больше.");
                } else {
                    System.out.println("Вы угадали! Поздравляю!");
                    break;

                }
            }
        }
    }
}