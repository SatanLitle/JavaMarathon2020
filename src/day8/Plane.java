package day8;


public class Plane {
    private String manufacturer;
    private int yearOfIssue;
    private int length;
    private int weight;
    private int fuelVolume = 0;
    StringBuilder planeInfo = new StringBuilder(); //

    public Plane(String manufacturer, int yearOfIssue, int length, int weight) {
        this.manufacturer = manufacturer;
        this.yearOfIssue = yearOfIssue;
        this.length = length;
        this.weight = weight;


    }

    public String toString() {
        return planeInfo.append(manufacturer).append(" ").append(yearOfIssue).append(" ").append(length).append(" ").append(weight).toString();


        // System.out.println( planeInfo.toString());
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
