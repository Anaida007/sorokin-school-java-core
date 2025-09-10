package school.sorokin.javacore.exception.final_task;

import java.util.Objects;

public class Book {

    private String title;
    private String author;
    private int availableCopies;

    public Book(String title, String author, int availableCopies) {
        this.title = title;
        this.author = author;
        this.availableCopies = availableCopies;
    }

    @Override
    public String toString() {
        return "\"" + title + "\", " + author + ", доступно копий: " + availableCopies;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        return obj instanceof Book
                && title.equals(((Book)obj).title)
                && author.equals(((Book)obj).author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author);
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getAvailableCopies() {
        return availableCopies;
    }

    public void setAvailableCopies(int availableCopies) {
        this.availableCopies = availableCopies;
    }
}
