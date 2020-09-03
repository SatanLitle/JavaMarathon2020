package day9.task2;

public class Rectangle extends Figure {
    private double width;
    private double height;
    public double area;
    public double perimeter;

    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        area = width * height;
        return area;
    }

    @Override
    public double perimeter() {
        perimeter = (width + height) * 2;
        return perimeter;
    }


}
