package day7;

public class Player {
    private int stamina;
    private static final int MAX_STAMINA = 100;
    private static final int MIN_STAMINA = 0;
    private static int countPlayers;

    public Player(int stamina) {
        this.stamina = stamina;
        countPlayers++;
    }

    public void run() {
        stamina--;
        if (stamina == MIN_STAMINA) {
            countPlayers--;
        }
    }

    public static void info() {
        if (countPlayers == 6) {
            System.out.println("Мест в командах больше нет");
        } else if (countPlayers < 6 && 1 < countPlayers) {
            int c = 6 - countPlayers;
            System.out.println("Команды неполные, есть еще " + c + " свободных мест");
        } else if (countPlayers <= 1) {
            System.out.println("Всё, наигрались");
        } else if (countPlayers > 6) {
            System.out.println("Количество игроков ожидающих своей очереди: " + (countPlayers - 6));
        }
    }
}
