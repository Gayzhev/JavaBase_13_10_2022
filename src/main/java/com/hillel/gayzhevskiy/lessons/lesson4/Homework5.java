package com.hillel.gayzhevskiy.lessons.lesson4;
/*За владу в стародавньому Китаї боролися дві династії: Лі та Мінь.
З кожного боку боролися 3 типи воїнів з такими показниками атаки:
Лі:
    воїн - 13
    лучник - 24
    вершник - 46
Мінь:
    воїн - 9
    лучник - 35
    вершник - 12
Розрахувати: загальний показник атаки для обох династій, якщо відомо, що воїнів династії Лі кожного типу було 860,
а кількість воїнів династії Мінь кожного типу в півтора рази більша.
Вивести в консоль значення загальної атаки кожної армії; */
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