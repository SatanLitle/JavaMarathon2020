package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setYear(2020);
        car.setColor("Green");
        car.setModel("Honda");
        System.out.println(car.getYear() + " " + car.getColor() + " " + car.getModel());
    }

    static class Car {
        private int yearOfIssue;
        private String color;
        private String model;

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
    }
}
