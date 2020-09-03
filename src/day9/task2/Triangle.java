package day9.task2;

public class Triangle extends Figure {
    public double perimeter;
    public double area;
    private double length1;
    private double length2;
    private double length3;
    private double s;
    private double c;

    public Triangle(String color, double length1, double length2, double length3) {
super(color);
        this.length1 = length1;
        this.length2 = length2;
        this.length3 = length3;
    }


    @Override
    public double perimeter() {
        perimeter = length1 + length2 + length3;
        return perimeter;
    }

    @Override
    public double area() {
        s = perimeter / 2;
        c = s * (s - length1) * (s - length2) * (s - length3);
        return Math.sqrt(c);
    }
}
