package com.hillel.gayzhevskiy.lessons.lesson8;

/*    У Японії числа 4 та 9 вважаються нещасливими. Вам потрібно пронумерувати 100
         космічних шатлів для перевезення людей на Марс так, щоб у номерах шатлів не траплялося
           нещасливих чисел. Напишіть функцію, яка виводить усі номери таких шатлів.  */

public class HomeWork7 {
    public static void main(String[] args) {
        int counter = 1;
        for (int i = 1; i < 200; i++) {
            if (i / 10 == 9 || i / 10 == 4 || i / 10 - 10 == 4 || i / 10 - 10 == 9 || i % 10 == 4 || i % 100 == 4 || i % 100 == 9 || i % 10 == 9) {
                continue;
            }
            if (counter <= 100) {
                System.out.println("shuttle       number: " + i);
                System.out.println("shuttle counter " + counter);
                counter++;
            }
        }
    }
}