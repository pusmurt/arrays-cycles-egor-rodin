//3. Создайте массив из 100 элементов
//Заполните массив случайным числами и выведите максимальное, минимальное и среднее значение.
//Для генерации случайного числа используйте метод Math.random()

public class Task3 {
    public static void main(String[] args) {
        int length = 100;
        double [] Array3 = new double[length];
        double max = 0;
        double srznach = 0;
        double min = 10;

        for (int i = 0; i < length; i++) {
            Array3 [i] =  Math.random()*10;
        }

        for (int i = 0; i < length; i++) {
            if (Array3[i]>max) {
                max = Array3[i];
            }
        } // Ищем максимальное значение

        for (int i = 0; i < length; i++) {
            srznach = srznach + Array3[i];
        }
        srznach = srznach/length; // ищем среднее значение

        for (int i = 0; i < length; i++) {
            if (Array3[i]<min) {
                min = Array3[i];
            }
        } // Ищем минимальное значение

        System.out.println("Задача #3");
        System.out.println("Массив из случайных чисел: ");
        for (int i = 0; i < length; i++) {
            System.out.println(Array3[i]);
        }

        System.out.println(" ");
        System.out.println("Минимальное значение: " + min);
        System.out.println("Среднее значение: " + srznach);
        System.out.println("Максимальное значение: " + max);
    }
}
