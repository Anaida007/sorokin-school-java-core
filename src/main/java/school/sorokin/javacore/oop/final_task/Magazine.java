package school.sorokin.javacore.oop.final_task;

public class Magazine extends Publication {

    private int issueNumber;
    @Override
    public String getType() {
        return "Журнал";
    }

    @Override
    public void printDetails() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return super.toString() + ", номер  журнала: " + issueNumber;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj) && (obj instanceof Magazine) && issueNumber == ((Magazine) obj).getIssueNumber();
    }

    @Override
    public int hashCode() {
        return super.hashCode() + issueNumber;
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }
}
