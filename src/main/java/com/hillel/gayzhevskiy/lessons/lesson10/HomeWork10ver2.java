
package com.hillel.gayzhevskiy.lessons.lesson10;
import java.util.Arrays;
/* ������� ��� ������ � 7 ����, ���������� ����������� ������� (�� 0 �� 9).
������ ����� - �� �����, �� ������� ������-������������ ������.
������ ����� - �� �����, �� ������ �������.
ϳ��� ����, �� ������ ������ �������� �������, ������� ����������� �� �� ���������� ����-���� ��������.
� ������������ ������� ��������� ������� ����, ����� ����� � ���� ������� � ��������� ��������; ���������:
first[3] ������� ���������� second[3], �� �������� �����.
������� ��������� � ������� (������� 1�, 4� �� 6� ��������):
[0, 1, 4, 5, 5, 8, 9]
[1, 1, 2, 3, 5, 6, 9]
ʳ������ ����: 3   */

public class HomeWork10ver2 {
    public static void main(String[] args) {

        int[] chance1 = new int[7];
        int[] chance2 = new int[7];
        for (int i = 0; i < chance1.length; i++) {
            chance1[i] = (int) (Math.random() * 10);
        }
        for (int i = 0; i < chance2.length; i++) {
            chance2[i] = (int) (Math.random() * 10);
        }
        for (int i = 0; i < chance1.length; i++) {
            for (int j = i + 1; j < chance1.length; j++) {
                int tmp = 0;
                if (chance1[i] > chance1[j]) {
                    tmp = chance1[i];
                    chance1[i] = chance1[j];
                    chance1[j] = tmp;
                }
            }
        }
        for (int i = 0; i < chance2.length; i++) {
            for (int j = i + 1; j < chance2.length; j++) {
                int tmp = 0;
                if (chance2[i] > chance2[j]) {
                    tmp = chance2[i];
                    chance2[i] = chance2[j];
                    chance2[j] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(chance1));
        System.out.println(Arrays.toString(chance2));
        int sovpalo = 0;
        for (int i = 0; i <= chance1.length - 1; i++) {
            if (chance1[i] == chance2[i]) {
                sovpalo++;
                System.out.println("����� ��������� ������: " + i);
            }
        }
        System.out.println("���������� ����������: " + sovpalo);
    }
}