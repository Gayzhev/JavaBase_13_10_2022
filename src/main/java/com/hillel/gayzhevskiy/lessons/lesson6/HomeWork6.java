package com.hillel.gayzhevskiy.lessons.lesson6;
/*    ������ ��'� ����� �������
    ������ ������� ����� ��� 5-�� ������� ����� ������� (����� �� ���� 5 ������)
    ������ ��'� ����� �������
    ������ ������� ����� ��� 5-�� ������� ����� ������� (����� �� ���� 5 ������)
    ���������� ������ ����������� ���� ����� �������
    �������� ���������� ������ �� ��������� ���������
    ������� � �������:
"��������� �������" + teamName + "�������" + result + "����" */

public class HomeWork6 {
    public static void main(String[] args) {
        String team1 = "WarMade";
        int latHam = 4;
        int chatHam = 9;
        int flyRad = 3;
        int boyRod = 3;
        int gomMes = 4;
        int averagePowerWarMade = (latHam + chatHam + flyRad + boyRod + gomMes) / 2;
        String team2 = "MurDer";
        int latBam = 3;
        int chatFan = 1;
        int flyObj = 6;
        int boyTorn = 1;
        int goHome = 10;
        int averagePowerMurDer = (latBam + chatFan + flyObj + boyTorn + goHome) / 2;
        if (averagePowerMurDer > averagePowerWarMade) {
            System.out.println("Winning team - " + team1 + ". Score: " + averagePowerWarMade + " frags");
        } else if (averagePowerMurDer < averagePowerWarMade) {
            System.out.println("Winning team - " + team2 + ". Score: " + averagePowerMurDer + " frags");
        } else {
            System.out.println("Result - tie points. Score: " + ((int) (averagePowerMurDer + averagePowerWarMade) / 2) + " frags");
        }
    }
}



