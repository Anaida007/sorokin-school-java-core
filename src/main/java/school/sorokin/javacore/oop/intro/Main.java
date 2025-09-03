package school.sorokin.javacore.oop.intro;

public class Main {
    public static void main(String[] args) {
        Book book = new Book();
        book.title = "Автостопом по галактике";
        book.author = "Дуглас Адамс";
        book.pages = 564;

        book.read();
    }
}
