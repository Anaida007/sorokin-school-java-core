package school.sorokin.javacore.basics;

import java.util.Scanner;

public class StringsLesson {

    /**
     * 1. Считывает строку с клавиатуры (например, "Hello, Java World!").
     * 2. Выводит длину этой строки.
     * 3. Выводит её в верхнем регистре.
     * 4. Проверяет, содержится ли в строке слово "Java". Если да — выводит индекс первого вхождения,
     * если нет — пишет, что не найдено.
     * 5. Делит строку на слова (разделитель — пробел) и выводит все слова по одному в консоль.
     * <p>
     * Подсказка: используйте Scanner для считывания пользовательского ввода, методы
     * .contains() или .indexOf() для поиска подстроки и .split(" ") для разбиения на слова.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите любую строку: ");
        String s = scanner.nextLine();
        System.out.println("Длина строки: " + s.length());
        System.out.println("Строка в верхнем регистре: " + s.toUpperCase());
        int indexOfSubstring = s.indexOf("Java");
        System.out.println(indexOfSubstring == -1
                ? "Подстрока не найдена"
                : "Индекс первого вхождения слова 'Java': " + indexOfSubstring);
        String[] separateWords = s.split(" ");
        System.out.println("Слова по одному: ");
        for (String word: separateWords) {
            System.out.println(word);
        }
    }
}
