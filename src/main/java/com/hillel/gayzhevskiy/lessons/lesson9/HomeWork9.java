package com.hillel.gayzhevskiy.lessons.lesson9;

import java.util.Arrays;
/*Є дві команди регбі з 25 гравців різного віку у кожній.
Вік беремо випадковим чином в діапазоні від 18 до 40.
Виведіть у двох рядках вік гравців кожної команди.
Порахуйте середній вік гравців кожної команди та виведіть на екран.*/

public class HomeWork9 {
    public static void main(String[] args) {
        int[] arrayTeam1 = new int[25];
        int[] arrayTeam2 = new int[25];
        int maxAge = 40;
        int minAge = 18;
        int range = maxAge - minAge + 1;
        for (int i = 0; i < arrayTeam1.length; i++) {
            arrayTeam1[i] = (int) (Math.random() * range) + minAge;
        }
        for (int i = 0; i < arrayTeam2.length; i++) {
            arrayTeam2[i] = (int) (Math.random() * range) + minAge;
        }
        System.out.println("Age of first  team players :" + Arrays.toString(arrayTeam1));
        System.out.println("Age of second team players :" + Arrays.toString(arrayTeam2));

        int totalAge1 = 0;
        for (int i = 0; i < arrayTeam1.length; i++) {
            totalAge1 += arrayTeam1[i];
        }
        int totalAge2 = 0;
        for (int i = 0; i < arrayTeam2.length; i++) {
            totalAge2 += arrayTeam2[i];
        }
        int averageAge1 = totalAge1 / arrayTeam1.length;
        System.out.println("Average age of first  team is  " + averageAge1);
        int averageAge2 = totalAge2 / arrayTeam1.length;
        System.out.println("Average age of second team is  " + averageAge2);
    }
}
