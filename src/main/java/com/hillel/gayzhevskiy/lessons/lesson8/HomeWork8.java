package com.hillel.gayzhevskiy.lessons.lesson8;

/* ������� ���, � ��� ������� �������� ���� �����, ��� "�������" ����'���� � ������� �� 0 �� 10
���������� ������� ���� ��������� ��������� � ����� ����� (����� 3). */


import java.util.Random;
import java.util.Scanner;

public class HomeWork8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberUgaday = 1;
        int numberProg = (int) (Math.random() * 10);
        while (true) {
            System.out.println("������� ����� �� 1 �� 10");
            if (scanner.hasNextInt()) {
                numberUgaday = scanner.nextInt();
                if (numberProg == numberUgaday) {
                    System.out.println("�� �������");
                    break;
                }

            } else {
                if (numberProg < numberUgaday) {
                    System.out.println("�� ����� ������.");
                } else {
                    System.out.println("�� ����� ������.");
                }
            }


        } else{
            System.out.println("���� ����� �� ������ � ������ �� 1 �� 10");
            scanner.next();
        }
    }
}






