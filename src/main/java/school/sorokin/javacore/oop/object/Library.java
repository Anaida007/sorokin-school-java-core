package school.sorokin.javacore.oop.object;

public class Library {

    public static void main(String[] args) {
        Book book1 = new Book("Lord of the Rings", "J.R.R. Tolkien");
        Book book2 = new Book("Harry Potter and the Goblet of Fire", "J.K.Rowling");
        Book book3 = new Book("Lord of the Rings", "J.R.R. Tolkien");
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);

        System.out.println("\n" + book1.equals(book2));
        System.out.println(book3.equals(book1));
        System.out.println(book1.hashCode() + " " + book2.hashCode() + " " + book3.hashCode());

        Number n = 10;
        int y = (int) n;

        Object x = 100;
        String s = (String) x;
    }
}
