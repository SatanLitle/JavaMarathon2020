package day6;

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
}
