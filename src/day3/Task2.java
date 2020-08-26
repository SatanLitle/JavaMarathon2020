package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        while (true) {

            Scanner scan = new Scanner(System.in);
            double d1 = scan.nextDouble();
            double d2 = scan.nextDouble();
            if (d2 == 0) break;
            else {
                System.out.println(d1 / d2);

            }
        }
    }
}
