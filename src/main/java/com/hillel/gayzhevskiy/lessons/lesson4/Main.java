package com.hillel.gayzhevskiy.lessons.lesson4;
/* ������������:
�������� � ������ ���� main-�����;
�������� ��� ���� ��� ��������� ����� �������������;
���������� ����� � ����� volume;
������� �� ����� ����� volume � ������:
System.out.println("��'�� ������������� = " + volume);
���������� ������� ������� ��� ����� � ����� length �� ������� �� �� �����;
 */
public class Main {
    public static void main(String[] args) {
        double sideX = 2.0;
        double sideY = 3.0;
        double sideZ = 5.0;
        double volume = sideX * sideY * sideZ;
        double length = 4 * (sideX + sideZ + sideY);
        System.out.println("���� ����i� ������������� = " + length);
        System.out.println("��'�� ������������� = " + volume);
    }
}