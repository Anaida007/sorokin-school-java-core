package school.sorokin.javacore.oop.final_task;

public class Book extends Publication {

    private String ISBN;

    @Override
    public String getType() {
        return "Книга";
    }

    @Override
    public void printDetails() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return super.toString() + ", номер ISBN: " + ISBN;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj) && (obj instanceof Book) && ISBN.equals(((Book) obj).getISBN());
    }

    @Override
    public int hashCode() {
        return super.hashCode() + ISBN.hashCode();
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

}
