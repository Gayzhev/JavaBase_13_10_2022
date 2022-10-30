package com.hillel.gayzhevskiy.lessons.lesson6;
/*    ввести ім'я першої команди
    ввести кількість фрагів для 5-ти гравців першої команди (тобто має бути 5 змінних)
    ввести ім'я другої команди
    ввести кількість фрагів для 5-ти гравців другої команди (тобто має бути 5 змінних)
    підрахувати середнє арифметичне балів кожної команди
    порівняти результати команд та визначити переможця
    вивести у консоль:
"Перемогла команда" + teamName + "набрала" + result + "очків" */

public class HomeWork6 {
    public static void main(String[] args) {
        String team1 = "WarMade";
        int latHam = 5;
        int chatHam = 8;
        int flyRad = 2;
        int boyRod = 5;
        int gomMes = 2;
        double averagePowerWarMade = (double) (latHam + chatHam + flyRad + boyRod + gomMes) / 5;
        String team2 = "MurDer";
        int latBam = 6;
        int chatFan = 2;
        int flyObj = 7;
        int boyTorn = 2;
        int goHome = 2;
        double averagePowerMurDer = (double) (latBam + chatFan + flyObj + boyTorn + goHome) / 5;
        if (averagePowerMurDer < averagePowerWarMade) {
            System.out.println("Winning team - " + team1 + ". Score: " + averagePowerWarMade + " frags");
        } else if (averagePowerMurDer > averagePowerWarMade) {
            System.out.println("Winning team - " + team2 + ". Score: " + averagePowerMurDer + " frags");
        } else {
            System.out.println("Result - tie points. Both average score: " + ((averagePowerMurDer + averagePowerWarMade) / 2) + " frags");
        }
    }
}



