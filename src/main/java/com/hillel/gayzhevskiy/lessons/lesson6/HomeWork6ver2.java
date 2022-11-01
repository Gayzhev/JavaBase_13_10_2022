package com.hillel.gayzhevskiy.lessons.lesson6;
import java.util.Scanner;

public class HomeWork6ver2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, input name of first team: ");
        String teamName1 = sc.nextLine();
        System.out.println("Please, input five frags for first team: ");
        int team1 = sc.nextInt();
        int team2 = sc.nextInt();
        int team3 = sc.nextInt();
        int team4 = sc.nextInt();
        int team5 = sc.nextInt();
        double averagePowerFirstTeam = (double) (team1 + team2 + team3 + team4 + team5) / 5;
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Please, input name of second team: ");
        String teamName2 = sc2.nextLine();
        System.out.println("Please, input five frags for second team: ");
        int team6 = sc2.nextInt();
        int team7 = sc2.nextInt();
        int team8 = sc2.nextInt();
        int team9 = sc2.nextInt();
        int team10 = sc2.nextInt();
        double averagePowerSecondTeam = (double) (team6 + team7 + team8 + team9 + team10) / 5;
        sc.close();
        sc2.close();
        if (averagePowerFirstTeam > averagePowerSecondTeam) {
            System.out.println("Winning team - " + teamName1 + ". Score: " + averagePowerFirstTeam + " frags");
        } else if (averagePowerSecondTeam > averagePowerFirstTeam) {
            System.out.println("Winning team - " + teamName2 + ". Score: " + averagePowerSecondTeam + " frags");
        } else {
            System.out.println("Result - tie points. Both average score: " + ((averagePowerFirstTeam + averagePowerSecondTeam) / 2) + " frags");
        }
    }
}