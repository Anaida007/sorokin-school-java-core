package school.sorokin.javacore.oop.object;

public class Book {

    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Книга '" + title + "', автор " + author;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }
        return this.title.equals(((Book) obj).title) && this.author.equals(((Book) obj).author);
    }

    @Override
    public int hashCode() {
        return title.hashCode()*7 + author.hashCode()*3;
    }
}
