package day4;


/**Создать новый массив размера 100 и заполнить его случайными числами из диапазона от 0 до 10000.
Затем, используя циклы for each вывести:
наибольший элемент массива
наименьший элемент массива
количество элементов массива, оканчивающихся на 0
сумму элементов массива, оканчивающихся на 0

Использовать сортировку запрещено.
*/
public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[100];
        int k;
        int maximum = 0;
        int minimum = 1000;
        int count = 0;
        int count2 = 0;
        for (k=0; k < array.length; k++) {
            int random = (int) (Math.random() * 1001);
            array[k] = random;
            if (minimum > array[k]) {
                minimum = array[k];
            }
            if (maximum < array[k]) {
                maximum = array[k];
            }
            if (array[k] % 10 == 0) {
                count++;
            }
            if (array[k] % 10 == 0) {
                count2 = count2 + array[k];
            }

        }
        System.out.println("Наибольший элемент массива - " + maximum);
        System.out.println("Наименьший элемент массива - " + minimum);
        System.out.println("Количество элементов массива, оканчивающихся на 0 - " + count);
        System.out.println("Сумма элементов массива, оканчивающихся на 0 " + count2);
        /* for (int z = 0; z < array.length; z++) {
            System.out.print(array[z] + " ");
         }*/

    }

}
