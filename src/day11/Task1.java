package day11;

public class Task1 {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        Picker p1 = new Picker(warehouse);
        Courier c1 = new Courier(warehouse);
        for (int i = 0; i < 1500; i++) {
            p1.doWork();
        }
        for (int i = 0; i < 1000; i++) {
            c1.doWork();
        }

        if (warehouse.countOrder == 1500) {
            p1.bonus();
        }
        if (warehouse.balance == 1000000) {
            c1.bonus();
        }

        System.out.println(p1.salary);
        System.out.println(c1.salary);
        System.out.println(warehouse);


    }
}
