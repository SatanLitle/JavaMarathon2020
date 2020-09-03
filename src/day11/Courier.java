package day11;

public class Courier implements Worker {
    private Warehouse warehouse;
    public int salary;

    public Courier(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public void doWork() {
        salary = salary + 100;
        warehouse.getBalance();
    }

    public void bonus() {
        salary = salary * 2;

    }
}
