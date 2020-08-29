package day6;

public class Plane {
    public String manufacturer;
    public int yearOfIssue;
    public int length;
    public int weight;
    public int fuelVolume = 0;
    public int volume;

    public Plane(String manufacturer, int yearOfIssue, int length, int weight, int fuelVolume) {
        this.manufacturer = manufacturer;
        this.yearOfIssue = yearOfIssue;
        this.length = length;
        this.weight = weight;
        this.fuelVolume = fuelVolume;

    }

    public void info() {
        System.out.println("Изготовитель: " + manufacturer + ", год выпуска: " + yearOfIssue + ", " +
                "длина: " + length + ", вес: " + weight + ", объем топлива в баке: " + fuelVolume);
    }

    public void fillUp() {
        fuelVolume = fuelVolume + volume;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
