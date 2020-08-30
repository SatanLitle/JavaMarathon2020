package day7;

public class Task2 {
    public static void main(String[] args) {
        Player p1 = new Player(100);
        Player p2 = new Player(91);
        Player p3 = new Player(97);
        Player p4 = new Player(98);
        Player p5 = new Player(90);
        Player p6 = new Player(95);
        Player p7 = new Player(95);
        Player p8 = new Player(98);


        Player.info();

        for (int i = 0; i < 100; i++){
            p1.run();
        }
        for (int i = 0; i < 100; i++){
            p2.run();
        }

        Player.info();

    }
}
