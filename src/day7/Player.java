package day7;

public class Player {
    private int stamina;
    private static final int MAX_STAMINA = 100;
    private static final int MIN_STAMINA = 0;
    private static int countPlayers;

    public Player(int stamina) {
        this.stamina = stamina;
        if (countPlayers < 6)
            countPlayers++;
    }

    public void run() {

        if (stamina == MIN_STAMINA)
            return;
        stamina--;
        if (stamina == MIN_STAMINA)
            countPlayers--;

    }


    public static void info() {

        if (countPlayers < 6 ) {
            int c = 6 - countPlayers;
            System.out.println("Команды неполные, есть еще " + c + " свободных мест");
        } else  {
            System.out.println("Мест в командах больше нет");
        }
    }
}
