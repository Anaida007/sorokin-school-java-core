package school.sorokin.javacore.exception.final_task;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private final List<Book> catalog = new ArrayList<>();

    /**
     * Добавляет новую книгу в библиотеку
     *
     * @param title           название книги
     * @param author          автор книги
     * @param availableCopies количество экземпляров книги
     */
    public void addNewBook(String title, String author, int availableCopies) {
        var newBook = new Book(title, author, availableCopies);
        try {
            var book = hasBook(newBook);
            book.setAvailableCopies(book.getAvailableCopies() + newBook.getAvailableCopies());
        } catch (ItemNotFoundException ex) {
            catalog.add(newBook);
        }
    }

    /**
     * Забирает книгу из библиотеки
     *
     * @param title  название книги
     * @param author автор книги
     * @throws ItemNotFoundException      если книга не найдена
     * @throws NoAvailableCopiesException если количество доступных экземпляров <1
     */
    public void takeBook(String title, String author) throws ItemNotFoundException, NoAvailableCopiesException {
        var book = hasBook(new Book(title, author, 0));
        int availableCopies = book.getAvailableCopies();
        if (availableCopies < 1) {
            throw new NoAvailableCopiesException("Нет доступных экземпляров книги");
        } else {
            book.setAvailableCopies(book.getAvailableCopies() - 1);
        }
    }

    /**
     * Возвращает книгу в библиотеку
     *
     * @param title  название книги
     * @param author автор книги
     * @throws ItemNotFoundException если такой книги никогда не было в библиотеке
     */
    public void returnBook(String title, String author) throws ItemNotFoundException {
        var book = hasBook(new Book(title, author, 0));
        book.setAvailableCopies(book.getAvailableCopies() + 1);
    }


    /**
     * Ищет книгу в каталоге
     *
     * @param book книга, которую надо найти
     * @return найденную книгу, если такая нашлась, либо в ином случае выбрасывает ItemNotFoundException
     */
    private Book hasBook(Book book) throws ItemNotFoundException {
        for (Book b : catalog) {
            if (b.equals(book)) {
                return b;
            }
        }
        throw new ItemNotFoundException("Данной книги нет в каталоге");
    }

    public List<Book> getAllBooks() {
        return catalog;
    }

}
