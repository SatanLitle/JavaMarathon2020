package day7;

public class Plane {
    private String manufacturer;
    private int yearOfIssue;
    private int length;
    private int weight;
    private int fuelVolume = 0;

    public Plane(String manufacturer, int yearOfIssue, int length, int weight) {
        this.manufacturer = manufacturer;
        this.yearOfIssue = yearOfIssue;
        this.length = length;
        this.weight = weight;

    }

    public void info() {
        System.out.println("Изготовитель: " + manufacturer + ", год выпуска: " + yearOfIssue + ", " +
                "длина: " + length + ", вес: " + weight + ", объем топлива в баке: " + fuelVolume);
    }

    public void fillUp(int i) {
        fuelVolume = fuelVolume + i;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public static void setLength(Plane p1, Plane p2) {

        if (p1.length > p2.length) {
            System.out.println("Cамолет " + p1.manufacturer + " длиннее чем самолет " + p2.manufacturer);
        } else if (p1.length < p2.length) {
            System.out.println("Cамолет " + p2.manufacturer + " длиннее чем самолет " + p1.manufacturer);
        } else {
            System.out.println("Самолеты равной длинны");
        }
    }
}
