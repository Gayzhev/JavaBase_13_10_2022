package com.hillel.gayzhevskiy.lessons.lesson11;

/*������������ ������� M x N. ������ M �� N ��������� � ������.
ϳ��� �������� ������ ����������� ������������ ��� ������ ������� M x N ������ �� N x M ������.
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
