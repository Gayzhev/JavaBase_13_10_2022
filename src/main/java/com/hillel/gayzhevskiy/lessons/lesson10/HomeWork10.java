package com.hillel.gayzhevskiy.lessons.lesson10;
import java.util.Arrays;
/* Зробити два масиви з 7 цифр, заповнених випадковими цифрами (від 0 до 9).
Перший масив - це числа, які загадані фірмою-організатором лотереї.
Другий масив - це числа, які вгадав гравець.
Після того, як обидва масиви заповнені цифрами, потрібно відсортувати їх за зростанням будь-яким способом.
У відсортованих масивах визначити кількість збігів, тобто чисел у двох масивах з однаковим індексом; Наприклад:
first[3] повинен дорівнювати second[3], як показано нижче.
Приклад виведення в консоль (збіглися 1й, 4й та 6й елементи):
[0, 1, 4, 5, 5, 8, 9]
[1, 1, 2, 3, 5, 6, 9]
Кількість збігів: 3   */

public class HomeWork10 {
    public static void main(String[] args) {

        int[] chance1 = new int[7];
        int[] chance2 = new int[7];
        for (int i = 0; i < chance1.length; i++) {
            chance1[i] = (int) (Math.random() * 10);
        }
        for (int i = 0; i < chance2.length; i++) {
            chance2[i] = (int) (Math.random() * 10);
        }
        Arrays.sort(chance1);
        Arrays.sort(chance2);
        System.out.println("Вариант организатора лотереи" + Arrays.toString(chance1));
        System.out.println("Вариант участника лотереи   " + Arrays.toString(chance2));

        int sovpalo = 0;
        for (int i = 0; i <= chance1.length - 1; i++) {
            if (chance1[i] == chance2[i]) {
                sovpalo++;
            }
        }
        System.out.println("Количество совпадений: " + sovpalo);
    }
}