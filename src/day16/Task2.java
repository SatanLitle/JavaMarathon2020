package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * 2. Реализовать программу, записывающую числа разных типов в 2 файла.
 * Файл 1 содержит 1000 случайных чисел от 0 до 100.
 * Файл 2 создается на основании Файла 1, но содержит числа вещественного типа данных.
 * Метод заполнения Файла 2 следующий: для каждой группы из 20 целых чисел из Файла 1 рассчитывается их среднее арифметическое.
 * Затем, полученное значение записывается в Файл 2.
 * Таким образом в Файле 2 будет находиться 50 вещественных чисел (1000 / 20 = 50).
 * После того, как Файл 2 будет сформирован, необходимо найти сумму всех вещественных чисел из Файла 2
 * и вывести в консоль ответ, отбросив его вещественную часть.
 * <p>
 * Пример:
 * Для простоты, в Файле 1 находится 12 целых чисел,
 * а среднее арифметическое рассчитывается для группы из 4 целых чисел.
 * <p>
 * Файл 1: 3 8 7 5 28 73 4 1 5 32 89 12
 * Файл 2: 5.75 26.5 34.5
 * Ответ: 66
 * <p>
 * Комментарии к примеру:
 * Среднее арифметическое для четверки 3 8 7 5 равно 5.75
 * Таким же образом рассчитаны средние арифметические для остальных четверок из Файла 1.
 * Сумма вещественных чисел из Файла 2 равняется 66.75
 * Отбросив вещественную часть (числа после запятой) получаем ответ 66.
 */
public class Task2 {
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("task16-2");
        PrintWriter pw = new PrintWriter(file);
        File file2 = new File("task16-2-2");
        PrintWriter pw2 = new PrintWriter(file2);
        for (int i = 0; i < 1000; i++) {
            int x = (int) (Math.random() * 101);
            pw.print(x + " ");
        }
        pw.close();

        File fileNew = new File("task16-2");
        Scanner scanner = new Scanner(fileNew);
        String numbers = scanner.nextLine();
        String[] numList = numbers.split(" ");
        int[] ints = new int[numList.length];
        int i = 0;
        for (String s : numList) {
            ints[i] = Integer.parseInt(s);
            i++;
        }
        double sum = 0;
        double sum2 = 0;
        for (int a = 0; a < 1000; a = a + 20) {
            for (int s = a; s < a + 20; s++) {
                sum = sum + ints[s];
            }
            pw2.print(sum / 20 + " ");
            sum2 = sum2 + sum / 20;
        }
        System.out.println(Math.round(sum2));
        scanner.close();
        pw2.close();

    }
}
