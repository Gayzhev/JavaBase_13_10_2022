package com.hillel.gayzhevskiy.lessons.lesson4;
/*�� ����� � ������������� ���� �������� �� ������: ˳ �� ̳��.
� ������� ���� �������� 3 ���� ���� � ������ ����������� �����:
˳:
    ��� - 13
    ������ - 24
    ������� - 46
̳��:
    ��� - 9
    ������ - 35
    ������� - 12
�����������: ��������� �������� ����� ��� ���� �������, ���� �����, �� ���� ������ ˳ ������� ���� ���� 860,
� ������� ���� ������ ̳�� ������� ���� � ������ ���� �����.
������� � ������� �������� �������� ����� ����� ��쳿; */
public class Homework5 {
    public static void main(String[] args) {
        int VoinLi = 13;
        int LuchnikLi = 24;
        int VershnikLi = 46;
        int VoinMin = 9;
        int LuchnikMin = 35;
        int VershnikMin = 12;
        int NumberLi = 860;
        double ratioQuantity = 1.50;
        int NumberMin = (int) (NumberLi * ratioQuantity);
        int fullPowerLi = (VoinLi * LuchnikLi * VershnikLi) * NumberLi;
        int fullPowerMin = (VoinMin * LuchnikMin * VershnikMin) * NumberMin;
        System.out.println(fullPowerMin);
        System.out.println(fullPowerLi);
    }
}