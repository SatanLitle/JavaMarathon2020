package day8;

public class Task1 {
    public static void main(String[] args) {

        long m = System.currentTimeMillis();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i <= 20000; i++) {
            sb.append(i + " ");
        }
        System.out.println(sb.toString());
        System.out.println((double) (System.currentTimeMillis() - m));

        long t = System.currentTimeMillis();
        String x = "";
        for (int i = 0; i <= 20000; i++) {

            x = x + i + " ";
        }
        System.out.print(x);
        System.out.println();
        System.out.println((double) (System.currentTimeMillis() - t));
    }
}
