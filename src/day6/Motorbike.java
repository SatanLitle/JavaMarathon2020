package day6;

public class Motorbike {
    private int yearOfIssue;
    private String color;
    private String model;

    public Motorbike(int yearOfIssue, String color, String model) {
        this.yearOfIssue = yearOfIssue;
        this.color = color;
        this.model = model;
    }

    public void sayName() {
        System.out.println("This is motorbike");
    }

    public void sayDifference(int years)
    {
        int difference = years - yearOfIssue;
        System.out.println(difference);
    }

    public void info() {
        System.out.println(yearOfIssue + color + model);
    }

}