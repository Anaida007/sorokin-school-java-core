package school.sorokin.javacore.exception;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class HandlingEx {

    private static final Logger logger = Logger.getLogger(HandlingEx.class.getName());
    private static final Scanner scanner = new Scanner(System.in);
    private static final List<String> history = new ArrayList<>();

    public static void main(String[] args) {
        String more = "да";
        boolean wrongInput = false;
        int i = 1;
        int first = 0;
        int second = 0;
        while (more.equals("да")) {
            try {
                System.out.print("Введите первое число: ");
                first = scanner.nextInt();
                System.out.print("Введите второе число: ");
                second = scanner.nextInt();
                double result = delenie(first, second);
                System.out.println("\nРезультат деления: " + result);
                history.add(i + ". Деление " + first + " / " + second + " = " + result);
                logger.log(Level.INFO, "Деление прошло успешно.");
            } catch (ArithmeticException ex) {
                System.out.println("\nОшибка: деление на ноль.");
                logger.log(Level.SEVERE, "Ошибка деления на ноль.");
                history.add(i + ". Деление " + first + " / " + second + " завершилось ошибкой: деление на ноль.");
            } catch (InputMismatchException ex) {
                System.out.println("\nОшибка: неверный ввод. ");
                scanner.nextLine();
                logger.log(Level.SEVERE, "Ошибка неверного ввода.");
                history.add(i + ". Деление завершилось ошибкой: неверный ввод.");
            } finally {
                System.out.println("Хотите выполнить ещё одно деление? (да/нет): ");
                more = scanner.next();
                scanner.nextLine();
                i++;
            }
        }

        System.out.println("\nИстория операций:");
        history.forEach(System.out::println);

    }

    private static double delenie(int first, int second) throws ArithmeticException {
        return first / second;
    }
}
