package day6;

public class Car {
    private int yearOfIssue;
    private String color;
    private String model;
    private int difference;

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

    public void sayName() {
        System.out.println("This is car");
    }

    public void sayDifference(int years) {
        difference = years - yearOfIssue;
    }
}
