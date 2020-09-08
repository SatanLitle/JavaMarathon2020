package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws FileNotFoundException {
        File filecsv = new File("shoes.csv");
        File filetxt = new File("testFile");
        PrintWriter pw = new PrintWriter(filetxt);

        Scanner sc = new Scanner(filecsv);
        List<String> listcsv = new ArrayList<>();
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            listcsv.add(line);

            String[] zero = line.split(";");

            if (Integer.parseInt(zero[2]) == 0)
                pw.println(line);
        }
        pw.close();
        //System.out.println(listcsv);
    }
}
