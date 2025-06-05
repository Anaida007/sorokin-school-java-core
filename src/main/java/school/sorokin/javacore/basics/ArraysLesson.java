package school.sorokin.javacore.basics;

public class ArraysLesson {

    /**
     * 1. Создаёт массив из 10 целых чисел (заполните их случайными значениями или вводом с клавиатуры).
     * 2. Выводит все элементы массива на экран.
     * 3. Определяет и выводит индекс минимального и максимального элемента (или сами эти элементы).
     * 4. Сортирует массив по возрастанию (можно любым способом, например, «пузырьком») и выводит результат.
     * 5. (Опционально) Создаёт двумерный массив размером 2×5, заполняет его и выводит на экран в виде таблицы.
     * <p>
     * Подсказка: используйте циклы для заполнения и обхода массивов, методы для поиска и сортировки элементов.
     */

    public static void main(String[] args) {
        int[] array = {23, 3, 5, 25, 16, 6, 8, 2, 7, 11};

        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();

        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Минимальное значение в массиве: " + min);
        System.out.println("Максимальное значение в массиве: " + max);

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println("Отсортированный массив: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        int[][] biArray = {
                {2, 7},
                {4, 5},
                {8, 3},
                {0, 2},
                {4, 2}
        };

        System.out.println("\n Двумерный массив: ");
        for (int i = 0; i < biArray.length; i++) {
            for (int j = 0; j < biArray[i].length; j++) {
                System.out.print(biArray[i][j] + " ");
            }
            System.out.println();
        }

    }
}
