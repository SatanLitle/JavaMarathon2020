package day4;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

/*Заполнить двумерный массив (матрицу) случайными числами
от 0 до 50. Размер матрицы задать m=12, n=8
(m - размерность по строкам, n - размерность по колонкам).
В консоль вывести индекс строки, сумма чисел в которой максимальна.
Если таких строк несколько, вывести индекс последней из них.
*/
public class Task3 {
    public static void main(String[] args) {
        int[][] array = new int[12][8];
        int sum=0;
        int maxNumber = 0;
        for (int i = 0; i < 12; i++) {
            for ( int j = 0; j < 8; j++) {
             array [i][j] = (int) (Math.random() * 51);
                System.out.print(array[i][j]+" ");
                sum = sum+array[i][j];
            }
            if(maxNumber<sum){
                maxNumber = sum;

            }
           System.out.print(sum+"- ");
            System.out.println();

        }
       System.out.println(maxNumber);
    }
}

