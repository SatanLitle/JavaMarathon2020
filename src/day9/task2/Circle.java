package day9.task2;

public class Circle extends Figure {
    private double perimeter;
    private double area;
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double area() {
        area = Math.pow(Math.PI * radius, 2);
        return area;
    }

    @Override
    public double perimeter() {
        double perimeter = 2 * radius * Math.PI;
        return perimeter;
    }

}
