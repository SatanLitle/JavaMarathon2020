package day9.task1;

public class Task1 {
    public static void main(String[] args) {
        Student s1 = new Student("Yakut", "First Group");

        Teacher t1 = new Teacher("Harry", "JAVA");
        s1.getGroup();
        t1.getSubject();
        s1.printInfo();
        t1.printInfo();
    }
}
