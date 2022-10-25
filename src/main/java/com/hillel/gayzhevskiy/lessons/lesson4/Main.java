package com.hillel.gayzhevskiy.lessons.lesson4;
/* Паралелепіпед:
Створити у новому класі main-метод;
Створити три змінні для зберігання сторін паралелепіпеда;
Порахувати обсяг у змінній volume;
Вивести на екран змінну volume у вигляді:
System.out.println("Об'єм паралелепіпеда = " + volume);
Порахувати сумарну довжину всіх сторін у змінній length та вивести її на екран;
 */
public class Main {
    public static void main(String[] args) {
        double sideX = 2.0;
        double sideY = 3.0;
        double sideZ = 5.0;
        double volume = sideX * sideY * sideZ;
        double length = 4 * (sideX + sideZ + sideY);
        System.out.println("Сума сторiн паралелепіпеда = " + length);
        System.out.println("Об'єм паралелепіпеда = " + volume);
    }
}