package school.sorokin.javacore.exception.final_task;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static final Library library = new Library();

    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        boolean exit = false;

        System.out.println("Приветствуем вас в нашей библиотеке!");

        while(!exit) {
            System.out.println("Пожалуйста, выберете пункт меню: ");
            System.out.println("1. Вывести каталог\n" +
                    "2. Добавить книгу\n"+
                    "3. Выдать книгу\n" +
                    "4. Вернуть книгу\n" +
                    "5. Выйти из приложения");
            try {
                int menuItem = scanner.nextInt();
                scanner.nextLine();
                switch (menuItem) {
                    case 1:
                        showAllLibrary();
                        break;
                    case 2:
                        addBook();
                        break;
                    case 3:
                        giveBook();
                        break;
                    case 4:
                        returnBook();
                        break;
                    case 5:
                        exit = true;
                        System.out.println("Спасибо за пользование нашей библиотекой!");
                        break;
                    default:
                        System.out.println("Такого пункта меню не существует. Попробуйте ещё раз");
                        break;
                }
            } catch (InputMismatchException ex) {
                System.out.println("Ожидалось целое число, но было введено нечто иное. Пожалуйста, попробуйте ещё раз");
                scanner.nextLine();
            }
        }
    }

    /**
     * Показывает все книги в библиотеке
     */
    private static void showAllLibrary() {
        if (library.getAllBooks().isEmpty()) {
            System.out.println("В нашей библиотеке пока нет книг.");
            return;
        }
        System.out.println("Вот все наши книги:");
        int i = 1;
        for (Book book : library.getAllBooks()) {
            System.out.print(i + ". " + book.toString() + "\n");
        }
    }

    /**
     * Дообавляет книгу в библиотеку
     */
    private static void addBook() {
        System.out.println("Введите название книги:");
        String title = scanner.nextLine();
        System.out.println("Введите автора книги:");
        String author = scanner.nextLine();
        boolean numberIsRight = false;
        int availableCopies = 0;
        while (!numberIsRight) {
            System.out.println("Введите количество копий книги:");
            try {
                availableCopies = scanner.nextInt();
                if (availableCopies<1) {
                    throw new InputMismatchException();
                }
                numberIsRight = true;
            } catch (InputMismatchException ex) {
                System.out.println("Ожидается целое число больше нуля. Попробуйте ещё раз.");
            }
        }

        library.addNewBook(title, author, availableCopies);

    }

    /**
     * Выдает книгу
     */
    private static void giveBook() {
        System.out.println("Введите название книги:");
        String title = scanner.nextLine();
        System.out.println("Введите автора книги:");
        String author = scanner.nextLine();
        try {
            library.takeBook(title, author);
            System.out.println("Отлично, вот ваша книга!");
        } catch (ItemNotFoundException | NoAvailableCopiesException ex) {
            System.out.println(ex.getMessage());
        }
    }

    /**
     * Возвращает книгу в библиотеку
     */
    private static void returnBook() {
        System.out.println("Введите название книги:");
        String title = scanner.nextLine();
        System.out.println("Введите автора книги:");
        String author = scanner.nextLine();
        try {
            library.returnBook(title, author);
            System.out.println("Спасибо, что вернули книгу!");
        } catch (ItemNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
