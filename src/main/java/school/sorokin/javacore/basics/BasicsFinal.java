package school.sorokin.javacore.basics;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BasicsFinal {

    // максимальное количество контактов
    public static final int N = 3;
    public static final String BLANK_STRING = "";

    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] names = new String[N];
        String[] phoneNumbers = new String[N];
        int lastContactAt = -1;
        int menuItem;

        System.out.println("Вас приветствует приложение записной телефонной книжки. Добро пожаловать!");

        boolean exit = false;
        while (!exit) {
            System.out.println();
            System.out.println("Пожалуйста, выберите нужный пункт меню:");
            System.out.println("1. Добавить контакты");
            System.out.println("2. Просмотреть контакты");
            System.out.println("3. Найти контакт");
            System.out.println("4. Удалить контакт");
            System.out.println("5. Выйти");
            try {
                menuItem = scanner.nextInt();
                switch (menuItem) {
                    case 1:
                        lastContactAt = addContact(names, phoneNumbers, lastContactAt);
                        break;
                    case 2:
                        showAllContacts(names, phoneNumbers, lastContactAt);
                        break;
                    case 3:
                        findContact(names, phoneNumbers);
                        break;
                    case 4:
                        lastContactAt = removeContact(names, phoneNumbers, lastContactAt);
                        break;
                    case 5:
                        exit = true;
                        break;
                    default:
                        System.out.println("К сожалению такого пункта меню не существует. Попробуйте ещё раз.");

                }
            } catch (InputMismatchException ex) {
                System.out.println("К сожалению такого пункта меню не существует. Попробуйте ещё раз.");
                scanner.next();
            }
        }
    }

    /**
     * Добавляет новый контакт.
     *
     * @param names         список имен контактов
     * @param phoneNumbers  список номеров вконтактов
     * @param lastContactAt индекс, под которым хранится последний добавленный контакт
     * @return обновленный индекс, под которым хранится последний добавленный контактё
     */
    public static int addContact(String[] names, String[] phoneNumbers, int lastContactAt) {
        if (lastContactAt == N - 1) {
            System.out.println("К сожалению место в телефонной книге закончилось. " +
                    "Для добавления нового контакта удалите один из существующих");
            return lastContactAt;
        }
        lastContactAt++;
        System.out.println("Введите имя нового контакта: ");
        names[lastContactAt] = scanner.next();
        System.out.println("Введите телефонный номер нового контакта: ");
        phoneNumbers[lastContactAt] = scanner.next();
        return lastContactAt;
    }

    /**
     * Выводит на экран все записанные контакты.
     *
     * @param names         список имен контактов
     * @param phoneNumbers  список номеров вконтактов
     * @param lastContactAt индекс, под которым хранится последний добавленный контакт
     */
    public static void showAllContacts(String[] names, String[] phoneNumbers, int lastContactAt) {
        System.out.println("Ваша телефонная книга: ");
        for (int i = 0; i <= lastContactAt; i++) {
            System.out.println("Имя: " + names[i] + ", Телефон: " + phoneNumbers[i]);
        }
    }

    /**
     * Находит и выводит контакт по имени
     *
     * @param names        список имен контактов
     * @param phoneNumbers список номеров вконтактов
     */
    public static void findContact(String[] names, String[] phoneNumbers) {
        System.out.print("Введите имя для поиска: ");
        String name = scanner.next();
        for (int i = 0; i < names.length; i++) {
            if (names[i].equals(name)) {
                System.out.println("Телефон " + name + ": " + phoneNumbers[i]);
                return;
            }
        }
        System.out.println("К сожалению контакт с именем " + name + " не найден");
    }

    /**
     * Находит и удаляет контакт по имени
     *
     * @param names         список имен контактов
     * @param phoneNumbers  список номеров вконтактов
     * @param lastContactAt индекс, под которым хранится последний добавленный контакт
     * @return обновленный индекс, под которым хранится последний добавленный контактё
     */
    public static int removeContact(String[] names, String[] phoneNumbers, int lastContactAt) {
        System.out.print("Введите имя для удаления: ");
        String name = scanner.next();
        for (int i = 0; i < lastContactAt + 1; i++) {
            if (names[i].equals(name)) {
                for (int j = i; j < lastContactAt; j++) {
                    names[j] = names[j + 1];
                    phoneNumbers[j] = phoneNumbers[j + 1];
                }
                System.out.println("Контакт с именем " + name + " успешно удалён.");
                names[lastContactAt] = BLANK_STRING;
                phoneNumbers[lastContactAt] = BLANK_STRING;
                lastContactAt--;
                return lastContactAt;
            }
        }
        System.out.println("Контакта " + name + " не существует.");
        return lastContactAt;
    }
}
