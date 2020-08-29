package day4;
import java.util.Random;

/**Заполнить двумерный массив (матрицу) случайными числами
от 0 до 50. Размер матрицы задать m=12, n=8
(m - размерность по строкам, n - размерность по колонкам).
В консоль вывести индекс строки, сумма чисел в которой максимальна.
Если таких строк несколько, вывести индекс последней из них.
*/
public class Task3 {
    public static void main(String[] args) {
        int[][] array = new int[12][8];
        Random random = new Random();
        int index = 0;
        int maxSum = 0;
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 8; j++) {
                array[i][j] = random.nextInt(50);
                // System.out.print(array[i][j]+" " +"\t");
            }
            // System.out.println();
        }
        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            for (int j = 0; j < array[i].length; j++) {
                sum = sum + array[i][j];
                if (sum >= maxSum) {
                    maxSum = sum;
                    index = i;
                }
            }
        }
        // System.out.println(maxSum);
        System.out.println(index);
    }
}