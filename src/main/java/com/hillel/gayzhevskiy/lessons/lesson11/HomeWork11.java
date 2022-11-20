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



    }
}
