package day9.task2;

public class TestFigures {

    public static void main(String[] args) {
        Figure[] figures = new Figure[8];
        figures[0] = new Triangle("Red", 10, 10, 10);
        figures[1] = new Triangle("Green", 10, 20, 30);
        figures[2] = new Triangle("Red", 10, 20, 15);
        figures[3] = new Rectangle("Red", 5, 10);
        figures[4] = new Rectangle("Orange", 40, 15);
        figures[5] = new Circle("Red", 4);
        figures[6] = new Circle("Red", 10);
        figures[7] = new Circle("Blue", 5);

        System.out.println(calculateRedArea(figures));
        System.out.println(calculateRedPerimeter(figures));
    }


    public static double calculateRedPerimeter(Figure[] figures) {
        double sum = 0;
        for (Figure f : figures) {
            if (f.getColor().equals("Red"))
                sum += f.perimeter();
        }
        return sum;
    }

    public static double calculateRedArea(Figure[] figures) {
        double sum = 0;
        for (Figure f : figures) {
            if (f.getColor().equals("Red"))
                sum += f.area();
        }
        return sum;
    }
}

