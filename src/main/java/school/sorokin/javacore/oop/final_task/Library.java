package school.sorokin.javacore.oop.final_task;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Library {

    private final List<Publication> publications = new ArrayList<>();

    public void addPublication(Publication publication) {
        publications.add(publication);
        Publication.setPublicationCount(Publication.getPublicationCount()+1);
    }

    public void removePublication(int index) {
        publications.remove(index);
        Publication.setPublicationCount(Publication.getPublicationCount()-1);
    }

    public void listPublications() {
        for (int i = 0; i < publications.size(); i++) {
            System.out.println((i+1) + ". " + publications.get(i));
        }
    }

    public void searchByAuthor(String author) {
        var pubs = publications.stream()
                .filter(pub-> pub.getAuthor().equals(author))
                .toList();
        if (pubs.isEmpty()) {
            System.out.println("К сожалению у нас нет публикаций этого автора");
        } else {
            pubs.forEach(System.out::println);
        }
    }

}
