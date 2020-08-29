package day6;

public class Motorbike {
    private int yearOfIssue;
    private String color;
    private String model;
    private int difference;

    public Motorbike(int yearOfIssue, String color, String model) {
        this.yearOfIssue = yearOfIssue;
        this.color = color;
        this.model = model;
    }

    public void sayName() {
        System.out.println("This is motorbike");
    }

    public void sayDifference(int years) {
        difference = years - yearOfIssue;
    }

    public void info() {
        System.out.println(yearOfIssue + color + model);
    }

}