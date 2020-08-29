package day5;

public class Car {
    private int yearOfIssue;
    private String color;
    private String model;

    public void setYear(int carYear) {
        yearOfIssue = carYear;
    }

    public int getYear() {
        return yearOfIssue;
    }

    public void setColor(String carColor) {
        color = carColor;
    }

    public String getColor() {
        return color;
    }

    public void setModel(String carModel) {
        model = carModel;
    }

    public String getModel() {
        return model;
    }
}
