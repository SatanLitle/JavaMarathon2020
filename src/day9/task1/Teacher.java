package day9.task1;


public class Teacher extends Human{
    private String subject;

    public Teacher(String name, String subject) {
        super(name);
        this.subject = subject;
    }
    /** public void setSubject (String subject){
        this.subject = subject;
    } */
    public  String getSubject(){

        System.out.println(subject);
        return subject;


    }
    public void printInfo (){
        super.printInfo();

        System.out.println("Этот преподаватель с именем  " + getName());
    }
}
