//6. Создать квадратный двумерный целочисленный массив 3x3 , и с помощью цикла(-ов) заполнить его диагональные элементы единицами;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {
        int [][] Array6 = new int[3][3];

        System.out.println("Задача #6");

        System.out.println("Массив до изменения данных: ");

        for (int i = 0; i < Array6.length; i++) {
            for (int j = 0; j < Array6.length; j++) {
                System.out.print("[" + Array6[j][i] + "]");
                if (j == 2) {
                    System.out.println(" ");
                }
                }
            }

            for (int i = 0; i < Array6.length; i++) {
                for (int j = 0; j < Array6.length; j++) {
                    if ((i + j) % 2 != 0) {Array6[i][j] = 0;
                } else Array6 [i][j] = 1;
            }
        }
            System.out.println("Массив после изменения данных: ");

        for (int i = 0; i < Array6.length; i++) {
            for (int j = 0; j < Array6.length; j++) {
                System.out.print("[" + Array6[j][i] + "]");
                if (j == 2) {
                    System.out.println(" ");
                }
            }
        }
    }
}
