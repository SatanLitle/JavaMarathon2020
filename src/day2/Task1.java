package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Введите количество этажей");
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        if (x <= 0) {
            System.out.println("Неккоректный ввод");
        } else if (x >= 9) {
            System.out.println("Это многоэтажный дом");
        } else if (x > 4 && x < 9) {
            System.out.println("Это среднеэтажный дом");
        } else if (x > 0 && x < 5) {
            System.out.println("Это малоэтажный дом");
        }
    }
}
