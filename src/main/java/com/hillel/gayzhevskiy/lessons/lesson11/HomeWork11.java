package com.hillel.gayzhevskiy.lessons.lesson11;

/*Транспонуйте матрицю M x N. Розміри M та N задаються з консолі.
Після введення повинні автоматично створюватися два масиви розміром M x N перший та N x M другий.
 */

import java.util.Scanner;

public class HomeWork11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        int m = 0;
        System.out.println("Enter number of rows future array: ");
        if (sc.hasNextInt()) {
            n = sc.nextInt();
        } else {
            System.out.println("Please enter an integer!");
        }
        System.out.println("Enter number of columnes future array: ");
        if (sc.hasNextInt()) {
            m = sc.nextInt();
        } else {
            System.out.println("Please enter an integer!");
        }
        sc.close();
        int[][] array = new int[n][];
        int[][] transpArray = new int[m][];
        for (int i = 0; i < transpArray.length; i++) transpArray[i] = new int[n];
        System.out.println("Matrix: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = new int[n];
            transpArray[i] = new int[m];
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 101);
                System.out.println(array[i][j] + "    ");
            }
            System.out.println();
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                transpArray[i][j] = array[j][i];
            }
        }
        System.out.println("Transposition: ");
        for (int i = 0; i < transpArray.length; i++) {
            for (int j = 0; j < transpArray[i].length; j++) {
                System.out.println(transpArray[i][j] + "     ");
            }
        }
    }
}

