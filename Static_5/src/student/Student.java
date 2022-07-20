package student;

public class Student {
    private int rollno;
    private String name;
    private static String college = "BBDIT";

    //constructor
    Student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }
     //static methods to change the value of static variables
    static void change() {
        college ="CODEGYM";
    }
    //methods to display the value
    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }
}
