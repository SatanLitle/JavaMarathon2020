package day2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Введите 2 числа");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        for (a = a + 1; a <= b - 1; a++) {
            if (a % 10 == 5) {
                System.out.println(a);
            }
        }
    }
}
