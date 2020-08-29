package day6;

/**
 * Изменить год выпуска и длину с помощью сеттеров,
 * вызвать метод fillUp() два раза, передав разные значения. Вызвать метод info().
 */

public class Task2 {
    public static void main(String[] args) {
        Plane plane1 = new Plane("Boeing", 2015, 50, 6000);
        plane1.setManufacturer("Saab");
        plane1.setLength(60);
        plane1.fillUp(100);
        plane1.fillUp(100);
        plane1.info();
    }
}
