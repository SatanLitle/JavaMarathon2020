package day11;

public class Picker extends Warehouse implements Worker {
    public int salary;
    private Warehouse warehouse;

    public Picker(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public void doWork() {

        salary = salary + 80;
        warehouse.getCountOrder();
    }

    public void bonus() {
        salary = salary * 3;
    }
}
