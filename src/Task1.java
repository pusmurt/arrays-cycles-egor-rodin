import java.util.Arrays;

//1. Создайте массив из всех нечётных чисел от 1 до 30, выведите его на экран в строку, а затем этот же массив выведите на экран
//тоже в строку, но в обратном порядке (30 29 28 27 … 7 5 3 1).

public class Task1 {
    public static void main(String[] args) {
        int oddNumberCount = 0; // Количество нечётных чисел в заданном диапазоне, необходимо будет для дальнейшего решения задачи
        int givenArrayLengthStart = 1; // Заданный диапазон, начало
        int givenArrayLengthEnd = 30; // Заданный диапазон, конец
        int j = 0; // Переменная, которая понадобится в одном из циклов

        for (int i = givenArrayLengthStart; i <= givenArrayLengthEnd; i++) {
            if (i % 2 == 1) {
                oddNumberCount++;
            }
        } // Определяем длину массива, подсчитывая количество чисел в заданном диапазоне

        int[] Array1 = new int[oddNumberCount]; // Инициализируем массив, полученное количество нечётных чисел записываем как длину массива

        for (int i = givenArrayLengthStart; i <= givenArrayLengthEnd; i++) {
            if (i % 2 == 1) {
                Array1[j] = i;
                j++;
            } // В полученный массив записываем сами значения нечётных чисел.
        }

        System.out.println("Задача #1");
        System.out.print("Нечётные числа в заданном диапазоне: " + Arrays.toString(Array1));

        System.out.println(" ");

        System.out.print("Запись в обратном порядке: ");
        for (int i = oddNumberCount - 1; i > -1; i--) {
            System.out.print(Array1[i] + " ");
        }
    }
}

// Проинициализировал j снаружи цикла, так как внутри цикла он её не увидел.