package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

       /**  String separator = File.separator;
        String path = separator + "C:" + separator +  "Users" + separator + "37533" + separator + "Desktop" + separator + "test.txt";
*/
        File file = new File("test11");

        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    /**    String fileString = scanner.nextLine();
        System.out.println(fileString);
        String [] numbers = fileString.split(" ");
        System.out.println(Arrays.toString(numbers));

        int[] numbersInt = new int[7];
        int i = 0;
        for (String s:numbers){
            numbersInt [i++] = Integer.parseInt(s);
        }
        System.out.println(Arrays.toString(numbersInt));
        scanner.close();
    } */
}}
