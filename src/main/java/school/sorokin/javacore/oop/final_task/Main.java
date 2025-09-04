package school.sorokin.javacore.oop.final_task;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static final Scanner scanner = new Scanner(System.in);

    private static final Library library = new Library();

    public static void main(String[] args) {
        int menuItem = 1;
        System.out.println("Приветствую вас в нашей электронной библиотеке!");
        while (menuItem > 0) {
            System.out.println("Пожалуйста, выберите пункт меню:");
            System.out.println("1. Добавить новую публикацию" +
                    "\n2. Вывести список всех публикаций" +
                    "\n3. Поиск публикации по автору" +
                    "\n4. Вывести общее количество публикаций" +
                    "\n5. Удалить публикацию" +
                    "\n0. Выход");
            try {
                menuItem = scanner.nextInt();
                scanner.nextLine();
                switch (menuItem) {
                    case 1:
                        addNewPublication();
                        break;
                    case 2:
                        showAllPublications();
                        break;
                    case 3:
                        findPublicationFromAuthor();
                        break;
                    case 4:
                        printTotalPublicationNumber();
                        break;
                    case 5:
                        deletePublication();
                        break;
                    case 0:
                        break;
                    default:
                        System.out.println("К сожалению такого пункта меню не существует. Попробуйте ещё раз.");
                }
            } catch (InputMismatchException ex) {
                System.out.println("К сожалению такого пункта меню не существует. Попробуйте ввести число ещё раз.");
            }

        }
    }

    /**
     * Добавляет новую публикацию
     */
    private static void addNewPublication() {
        System.out.println("Для добавления новой публикации выберите вид публикации:");
        System.out.println("1. Книга" +
                "\n2. Журнал" +
                "\n3. Газета" +
                "\n0. Возврат в главное меню");

        Publication newPublication = null;
        boolean typeIsCorrect = false;
        while (!typeIsCorrect) {
            try {
                int menu = scanner.nextInt();
                scanner.nextLine();
                switch (menu) {
                    case 1:
                        newPublication = new Book();
                        initBasicPublication(newPublication);
                        System.out.println("Введите номер ISBN:");
                        String isbn = scanner.nextLine();
                        ((Book) newPublication).setISBN(isbn);
                        typeIsCorrect = true;
                        break;
                    case 2:
                        newPublication = new Magazine();
                        initBasicPublication(newPublication);
                        System.out.println("Введите номер выпуска:");
                        int issueNumber = scanner.nextInt();
                        scanner.nextLine();
                        ((Magazine) newPublication).setIssueNumber(issueNumber);
                        typeIsCorrect = true;
                        break;
                    case 3:
                        newPublication = new Newspaper();
                        initBasicPublication(newPublication);
                        System.out.println("Введите день публикации");
                        String publicationDay = scanner.nextLine();
                        ((Newspaper) newPublication).setPublicationDay(publicationDay);
                        typeIsCorrect = true;
                        break;
                    case 0:
                        return;
                    default:
                        System.out.println("К сожалению такого вида публикации не существует. Попробуй ещё раз.");

                }
            } catch (InputMismatchException ex) {
                System.out.println("К сожалению такого вида публикации не существует. Попробуйте ввести число ещё раз.");
            }
        }
        library.addPublication(newPublication);
    }

    /**
     * Инициализирует общие для всех видов публикаций поля
     *
     * @param publication инициализируемая публикация
     */
    private static void initBasicPublication(Publication publication) {
        System.out.println("Введите название публикации:");
        String title = scanner.nextLine();
        System.out.println("Введите автора публикации:");
        String author = scanner.nextLine();
        System.out.println("Введите год публикации:");
        boolean getYear = false;
        int publicationYear = 0;
        while (!getYear) {
            try {
                publicationYear = scanner.nextInt();
                getYear = true;
            } catch (InputMismatchException ex) {
                System.out.println("Введённая строка не является числом, попробуйте ещё раз.");
            }
        }
        scanner.nextLine();
        publication.setTitle(title);
        publication.setAuthor(author);
        publication.setPublicationYear(publicationYear);
    }

    /**
     * Выводит на экран все публикации
     */
    private static void showAllPublications() {
        System.out.println("Сейчас в библиотеке " + Publication.getPublicationCount() + " публикаций. Вот они:");
        library.listPublications();
    }

    /**
     * Находит все публикации данного автора
     */
    private static void findPublicationFromAuthor() {
        System.out.println("Введите имя автора, чьи публикации вы хотите найти:");
        String author = scanner.nextLine();
        library.searchByAuthor(author);
    }

    /**
     * Выводит общее количество публикаций
     */
    private static void printTotalPublicationNumber() {
        System.out.println("Всего публикаций в нашей библиотеке: " + Publication.getPublicationCount());
    }

    /**
     * Удаляет выбранную публикацию
     */
    private static void deletePublication() {
        System.out.println("Выберите порядковый номер публикации, которую хотите удалить " +
                "(введите 0, если хотите прервать удаление): ");
        library.listPublications();

        boolean isNumberRight = false;
        while (!isNumberRight) {
            try {
                int deleteNumber = scanner.nextInt();
                if (deleteNumber == 0) {
                    scanner.nextLine();
                    return;
                }
                if (0 < deleteNumber - 1 && deleteNumber - 1 < Publication.getPublicationCount()) {
                    library.removePublication(deleteNumber - 1);
                    isNumberRight = true;
                } else {
                    System.out.println("Публикации с таким номером не существует, попробуйте ещё раз.");
                }
            } catch (InputMismatchException ex) {
                System.out.println("Введенная строка не является числом, попробуйте ещё раз.");
            }
        }
        scanner.nextLine();
    }
}
