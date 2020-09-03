package day11;

public class Warehouse {

    public int countOrder;
    public int balance;


    public int getCountOrder() {
        countOrder++;
        return countOrder;
    }

    public int getBalance() {
        balance = balance + 1000;
        return balance;
    }

    public String toString() {

        return "Количество заказов - " + countOrder + ". Доход от доставленных заказов -  " + balance;
    }
}
