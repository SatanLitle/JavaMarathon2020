package day4;

import java.util.Scanner;

/** 1. С клавиатуры вводится число n - размер массива.
Необходимо создать массив указанного размера и заполнить его
случайными числами от 0 до 10. Затем вывести содержимое массива в
консоль, а также вывести в консоль информацию о:
а) Длине массива
б) Количестве чисел больше 8
в) Количестве чисел равных 1
г) Количестве четных чисел
д) Количестве нечетных чисел
е) Сумме всех элементов массива
*/
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int[] array1 = new int[i];
        for (int k = 0; k < i; k++) {
            int random = (int) (Math.random() * 11);
            array1[k] = random;
        }
        for (int x = 0; x < array1.length; x++) {
            System.out.print(array1[x] + " ");
        }
        System.out.println();
        int sum = 0;
        int eight = 0;
        int one = 0;
        int even = 0;
        int odd = 0;
        for (int x : array1) {
            sum = sum + x;
            if (x > 8) {
                eight++;
            }
            if (x == 1) {
                one++;
            }
            if (x % 2 == 0) {
                even++;
            }
            if (x % 2 == 1) {
                odd++;
            }
        }
        System.out.println("Информация о массиве");
        System.out.println("Длинна массива - " + array1.length);
        System.out.println("Количество чисел больше 8 - " + eight);
        System.out.println("Количество числе равных 1 - " + one);
        System.out.println("Количество четных чисел - " + even);
        System.out.println("Количество нечетных чисел - " + odd);
        System.out.println("Сумма всех элеметов массива - " + sum);

    }
}

