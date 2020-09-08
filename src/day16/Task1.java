package day16;
/**
 * 1. Реализовать программу, которая на вход принимает txt файл с целыми числами
 * (можно использовать файл из задания 1 дня 14)
 * и в качестве ответа выводит в консоль среднее арифметическое этих чисел.
 * Ответ будет являться вещественным числом.
 * В консоль необходимо вывести полную запись вещественного числа (со всеми знаками после запятой)
 * и сокращенную запись (с 3 знаками после запятой).
 * Пример:
 * Числа в txt файле: 5 2 8 34 1 36 77
 * Ответ: 23.285714285714285 --> 23,286
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("task14-1");
        Scanner scanner = new Scanner(file);

        String fileNumbers = scanner.nextLine();
        String[] massiveNumbers = fileNumbers.split(" ");
        int[] numbers = new int[massiveNumbers.length];
        int i = 0;
        for (String s : massiveNumbers) {
            numbers[i] = Integer.parseInt(s);
            i++;
        }
        int sum = 0;
        for (int a : numbers) {
            sum = sum + a;
        }
        double d = (double) sum / numbers.length;

        System.out.printf(d + " ----> %.3f\n", d);
    }
}
