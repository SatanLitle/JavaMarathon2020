package day12;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 31; i = i + 2) {
            numbers.add(i);
        }
        System.out.println(numbers);

        for (int i = 300; i < 351; i = i + 2) {
            numbers.add(i);
        }
        System.out.println(numbers);
    }
}
