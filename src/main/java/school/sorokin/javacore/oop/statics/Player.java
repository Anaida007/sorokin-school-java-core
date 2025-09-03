package school.sorokin.javacore.oop.statics;

public class Player {

    private String name;
    private int personalScore;

    public Player(String name, int personalScore) {
        this.name = name;
        this.personalScore = personalScore;
        GameScore.addPoints(personalScore);
    }

}
