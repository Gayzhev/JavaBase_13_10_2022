package com.hillel.gayzhevskiy.lessons.lesson8;

/*    � ���� ����� 4 �� 9 ���������� �����������. ��� ������� ������������� 100
         �������� ����� ��� ����������� ����� �� ���� ���, ��� � ������� ����� �� ����������
           ���������� �����. �������� �������, ��� �������� �� ������ ����� �����.  */

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