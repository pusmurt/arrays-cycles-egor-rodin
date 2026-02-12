//2. Создайте массив из всех чётных чисел от 2 до 25 и выведите элементы массива на экран сначала в строку, отделяя один элемент
//от другого пробелом, а затем в столбик (отделяя один элемент от другого началом новой строки). Перед созданием массива подумайте,
//какого он будет размера.

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int EvenNumberCount = 0; // Количество чётных чисел в заданном диапазоне, необходимо будет для дальнейшего решения задачи
        int givenArrayLengthStart = 2; // Заданный диапазон, начало
        int givenArrayLengthEnd = 25; // Заданный диапазон, конец диапазона
        int j = 0; // Переменная, которая понадобится в одном из циклов

        for (int i = givenArrayLengthStart; i <= givenArrayLengthEnd; i++) {
            if (i % 2 == 0) {
                EvenNumberCount++;
            }
        } // Схожий цикл из первой задачи, только в этот раз поменялся диапазон и мы проверяем на чётность, а не на нечётность при вычислении
        // длины массива

        int[] Array2 = new int[EvenNumberCount];
        for (int i = givenArrayLengthStart; i <= givenArrayLengthEnd; i++) {
            if (i % 2 == 0) {
                Array2[j] = i;
                j++;
            } // В полученный массив записываем сами значения нечётных чисел.
        }

        System.out.println("Задача #2");
        System.out.print("Вывод массива с записью в строку с отделением пробелом: ");
        for (int i = 0; i < EvenNumberCount; i++) {
            System.out.print(Array2 [i]+ " ");
        }

        System.out.println (" ");
        System.out.println (" ");
        System.out.println("Вывод массива с записью в столбик: ");
        for (int i = 0; i < EvenNumberCount; i++) {
            System.out.println(Array2 [i]+ " ");
        } // Два вывода под два условия задачи: вывод в строку и в столбик
    }
}
