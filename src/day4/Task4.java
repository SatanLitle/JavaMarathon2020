package day4;

/*Создать новый массив размера 100 и заполнить
 его случайными числами из диапазона от 0 до 10000.
Найти максимум среди сумм трех соседних элементов.
Для найденной тройки с максимальной суммой выведите значение суммы и индекс первого элемента тройки.
*/
public class Task4 {
    public static void main(String[] args) {

        int[] array = new int[100];
        int[][] massive = new int[98][3];

        for (int k = 0; k < array.length; k++) {
            int random = (int) (Math.random() * 10001);
            array[k] = random;
            System.out.print(array[k] + " ");
        }

       /* for (int i = 0; i < massive.length; i++) {
            for (int j = 0; j < massive[i].length; j++) {
                massive[i][j] = array[0];
                System.out.print(massive[i][j] + " ");
            } */
            System.out.println();
        }
    }




