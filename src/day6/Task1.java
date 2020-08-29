package day6;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setYear(2015);
        Motorbike motorbike = new Motorbike(2010, "Green", "Honda");
        car.sayName();
        motorbike.sayName();
        car.sayDifference(2020);
        motorbike.sayDifference(2020);

    }
}
