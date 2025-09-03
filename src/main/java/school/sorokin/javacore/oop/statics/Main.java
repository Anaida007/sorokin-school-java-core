package school.sorokin.javacore.oop.statics;

public class Main {

    public static void main(String[] args) {
        Player player1 = new Player("Сергей Горох", 10);
        Player player2 = new Player("Сергей Шевелев", 15);
        Player player3 = new Player("Артем Гаус", 14);
        Player player4 = new Player("Максий Заяц", 7);

        System.out.println(GameScore.totalScore);

    }
}
