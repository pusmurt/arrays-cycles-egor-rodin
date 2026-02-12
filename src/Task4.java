//4. Вывести в консоль все числа от 1 до 100, которые делятся на 5 без остатка. Используем цикл do-while.

public class Task4 {
    public static void main(String[] args) {

        int a = 5;

        System.out.println("Задача #4");

        do {
            if (a % 5 == 0) {
                System.out.println(a);
            }
            a++;
        } while (a <= 100);

    }
}