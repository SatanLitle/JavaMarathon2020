package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = 0;
        while (x < 5) {
            x++;
            double d1 = scan.nextDouble();
            double d2 = scan.nextDouble();
            if (d2 == 0) {
                System.out.println("Деление на 0");
                continue;
            }
            System.out.println(d1 / d2);
        }
    }
}
