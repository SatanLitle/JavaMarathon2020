package day6;

public class Motorbike {
    int yearOfIssue;
    String color;
    String model;
    private int difference;
    int input;

    public Motorbike(int yearOfIssue, String color, String model) {
        this.yearOfIssue = yearOfIssue;
        this.color = color;
        this.model = model;
    }
    public void sayName (){
        System.out.println("This is motorbike");
    }
    public void sayDifference (){
        difference = input-yearOfIssue;
        System.out.println(difference);
}}
