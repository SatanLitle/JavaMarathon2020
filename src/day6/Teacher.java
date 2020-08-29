package day6;

import java.util.Random;

public class Teacher {
    public String name;
    public String lesson;
    public String evaluate1;
    Random random = new Random();

    public Teacher(String name, String lesson) {
        this.name = name;
        this.lesson = lesson;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLesson(String lesson) {
        this.lesson = lesson;
    }

    public void evaluateTheStudent(Student p) {

        int evaluate = random.nextInt(4) + 2;
        if (evaluate == 2) {
            evaluate1 = "неудовлетворительно";
        } else if (evaluate == 3) {
            evaluate1 = "удовлетворительно";
        } else if (evaluate == 4) {
            evaluate1 = "хорошо";
        } else if (evaluate == 5) {
            evaluate1 = "отлично";
        }
        System.out.println("Преподаватель " + name + " оценил студента "
                + p.studentName + " по предмету " + lesson + " на оценку " + evaluate1);

    }
}