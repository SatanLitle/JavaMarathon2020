package day6;

import java.util.Scanner;

 public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setYear(2015);
        Motorbike motorbike = new Motorbike(2010, "Green", "Honda");
        car.sayName();
        motorbike.sayName();
        Scanner sc = new Scanner(System.in);
        car.input = sc.nextInt();
        car.sayDifference();
        motorbike.input = sc.nextInt();
        motorbike.sayDifference();

    }
}
