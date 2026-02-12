//5. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
//С помощью цикла и условия заменить 0 на 1, 1 на 0;

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        int Array5 [] = new int [9];

        Array5 [0] = 0;
        Array5 [1] = 1;
        Array5 [2] = 1;
        Array5 [3] = 0;
        Array5 [4] = 0;
        Array5 [5] = 1;
        Array5 [6] = 0;
        Array5 [7] = 1;
        Array5 [8] = 0;

        System.out.println("Задача #5");
        System.out.println("   Массив до реверса: " + Arrays.toString(Array5));

        for (int i = 0; i < 9; i++) {
            if (Array5[i] == 0) {
                Array5[i] = 1;
            } else {
                Array5[i] = 0;
            }
        }

        System.out.println("Массив после реверса: " + Arrays.toString(Array5));
    }
}
