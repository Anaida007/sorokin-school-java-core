package school.sorokin.javacore.exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExemplEx {

    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Введите путь к файлу:");
        try {
            String path = scanner.next();
            File file = new File(path);
            Scanner fileScanner = new Scanner(file);
            String line = fileScanner.nextLine();
            var words = line.split("\\s+");
            if (words[0].isEmpty()) {
                System.out.println("Первая строка содержит 0 слов.");
            } else {
                System.out.println("Первая строка содержит " + words.length + " слов.");
            }
        } catch (InputMismatchException ex) {
            System.out.println("Неверный формат ввода!");
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден!");;
        } catch (IOException ex) {
            System.out.println("Ошибка чтения файла!");
        } finally {
            System.out.println("Спасибо за использование!");
        }
    }
}
