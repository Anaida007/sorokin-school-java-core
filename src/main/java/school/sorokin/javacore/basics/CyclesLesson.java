package school.sorokin.javacore.basics;

public class CyclesLesson {

    /**
     * 1. С помощью цикла for выводит на экран все числа от 1 до 100, которые делятся на 3.
     * 2. Затем с помощью цикла while выводит обратный отсчёт от 10 до 1 (10, 9, 8, ...).
     * 3. Использует вложенные циклы, чтобы вывести на экран таблицу умножения (формата 1*1=1, 1*2=2, и т. д., до 9*9=81).
     * 4. (Дополнительно) Остановите вложенный цикл, когда произведение станет больше 30, используя break.
     * <p>
     * Подсказка: в таблице умножения внешний цикл отвечает за число от 1 до 9, а внутренний — за второе число от 1 до 9.
     */

    public static void main(String[] args) {
        System.out.println("Все числа от 1 до 100, которые делятся на 3:");
        for (int i = 1; i < 101; i++) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println('\n');

        int i = 10;
        System.out.println("Обратный отсчёт от 10 до 1:");
        while (i > 0) {
            System.out.print(i + " ");
            i--;
        }
        System.out.println('\n');

        System.out.println("Таблица умножения:");
        for (i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.print(i + "*" + j + "=" + i * j + " ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Таблица умножения, но внутренний цикл остановлен как только произведение становится больше 30:");
        for (i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                int multiplication = i * j;
                if (multiplication > 30) {
                    break;
                }
                System.out.print(i + "*" + j + "=" + multiplication + " ");
            }
            System.out.println();
        }
    }
}
