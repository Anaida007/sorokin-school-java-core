package school.sorokin.javacore.oop.final_task;

import java.util.Objects;

public abstract class Publication implements Printable {

    private static int publicationCount = 0;

    private String title;
    private String author;
    private int publicationYear;

    public abstract String getType();

    @Override
    public String toString() {
        return "Это " + getType() + ". '" + title + "', автор " + author + ", опубликовано в " + publicationYear + " году";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Publication publication = (Publication) obj;
        return title.equals(publication.title)
                && author.equals(publication.author)
                && publicationYear == publication.publicationYear;
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, publicationYear);
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

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public static int getPublicationCount() {
        return publicationCount;
    }

    public static void setPublicationCount(int publicationCount) {
        Publication.publicationCount = publicationCount;
    }

}
