package day9.task2;

import javax.swing.*;

public abstract class Figure {

    private String color;

    public Figure(String color) {
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;

    }

    public String getColor() {
        return color;
    }

    public abstract double area();

    public abstract double perimeter();

}
