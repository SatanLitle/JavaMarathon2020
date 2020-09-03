package day9.task1;


public class Student extends Human {

    private String group;

    public Student(String name, String group) {
        super(name);
        this.group = group;

    }

    /** public void setGroup(String group) {
        this.group = group;

    }
*/
    public String getGroup() {

        System.out.println(group);
        return group;

    }

    public void printInfo() {
        super.printInfo();
        System.out.println("Этот студент с именем  " + getName());
    }
}
