package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setYear(2020);
        car.setColor("Green");
        car.setModel("Honda");
        System.out.println(car.getYear() + " " + car.getColor() + " " + car.getModel());
    }
}
