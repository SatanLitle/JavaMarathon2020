package day7;

public class Task1 {
    public static void main(String[] args) {
        Plane p1 = new Plane("Boeing", 2012, 50, 8000);
        Plane p2 = new Plane("Saab", 2010, 80, 9000);
        Plane.setLength(p1, p2);
    }
}
