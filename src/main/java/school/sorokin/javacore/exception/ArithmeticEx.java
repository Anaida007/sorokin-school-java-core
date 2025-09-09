package school.sorokin.javacore.exception;

import java.util.Scanner;

public class ArithmeticEx {

    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите первое число:");
        int first = scanner.nextInt();
        System.out.println("Введите второе число:");
        int second = scanner.nextInt();

        try {
            System.out.println(first / second);
        } catch (ArithmeticException ex) {
            System.out.println("Деление на ноль! Попробуйте другое число");
        } finally {
            System.out.println("Спасибо за использование программы");
        }
    }
}
