package com.hillel.gayzhevskiy.lessons.lesson8;

/* ������� ���, � ��� ������� �������� ���� �����, ��� "�������" ����'���� � ������� �� 0 �� 10
���������� ������� ���� ��������� ��������� � ����� ����� (����� 3). */


import java.util.Scanner;

public class HomeWork8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberUgaday = 10;
        int numberProg = (int) (Math.random() * numberUgaday);
        while (true) {
            System.out.println("������� ����� �� 1 �� 10");
            if (scanner.hasNextInt()) {
                numberUgaday = scanner.nextInt();
                if (numberUgaday > 10 || numberUgaday < 1) {
                    System.out.println("���� ����� �� ������ � �������� �� 1 �� 10");
                    break;
                }
                if (numberProg < numberUgaday) {
                    System.out.println("�� ����� ������.");
                } else if (numberProg > numberUgaday) {
                    System.out.println("�� ����� ������.");
                } else {
                    System.out.println("�� �������! ����������!");
                    break;

                }
            }
        }
    }
}