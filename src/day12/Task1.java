package day12;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> car = new ArrayList<>();
        car.add("Honda");
        car.add("Suzuki");
        car.add("Audi");
        car.add("BMW");
        car.add("Ford");

        System.out.println(car);

        car.add(3, "Lexus");
        car.remove(0);

        System.out.println(car);
    }
}
