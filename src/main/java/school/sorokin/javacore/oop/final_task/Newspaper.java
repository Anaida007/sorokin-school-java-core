package school.sorokin.javacore.oop.final_task;

public class Newspaper extends Publication {

    private String publicationDay;
    @Override
    public String getType() {
        return "Газета";
    }

    @Override
    public void printDetails() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return super.toString() + ", день публикации: " + publicationDay;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj) && (obj instanceof Newspaper)
                && publicationDay.equals(((Newspaper) obj).getPublicationDay());
    }

    @Override
    public int hashCode() {
        return super.hashCode() + publicationDay.hashCode();
    }

    public String getPublicationDay() {
        return publicationDay;
    }

    public void setPublicationDay(String publicationDay) {
        this.publicationDay = publicationDay;
    }
}
