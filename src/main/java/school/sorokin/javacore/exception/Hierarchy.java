package school.sorokin.javacore.exception;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Hierarchy {

    public static void main(String[] args) {
        checkedEx();
    }

    private static void checkedEx() {
        var file = new File("text.txt");
        try {
            if (true) {
                throw new OutOfMemoryError();
            }
            Scanner scanner = new Scanner(file);
            scanner.nextLine();
        } catch (IOException ex) {
            System.out.println("Ошибка при чтении файла");
        } finally {
            if (false) {
                throw new NullPointerException();
            }
            System.out.println("блок ля финаль");
        }
    }

    private static void uncheckedEx() {
        int[] a = new int[5];
        try {
            a[8] = 23;
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Вышли за границу массива!");
        }
    }
}
