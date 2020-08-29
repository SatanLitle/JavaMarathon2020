package day5;

public class Task2 {
    public static void main(String[] args) {
        Motorbike motorbike = new Motorbike(2020, "Red", "Suzuki");
    }

    static class Motorbike {
        int yearOfIssue;
        String color;
        String model;

        public Motorbike(int yearOfIssue, String color, String model) {
            this.yearOfIssue = yearOfIssue;
            this.color = color;
            this.model = model;
        }
    }
}
