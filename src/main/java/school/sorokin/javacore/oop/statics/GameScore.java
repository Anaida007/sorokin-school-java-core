package school.sorokin.javacore.oop.statics;

public class GameScore {

    public static int totalScore;

    public static void addPoints(int points) {
        totalScore += points;
    }
}
