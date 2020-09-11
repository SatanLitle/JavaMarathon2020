package day18;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(sum7(717771237));
    }
    public static int sum7 (int i){
        if (i == 0)
            return 0;
        if(i % 10 == 7)
            return 1 + sum7(i/10);
        else
            return sum7(i/10);
    }
}
