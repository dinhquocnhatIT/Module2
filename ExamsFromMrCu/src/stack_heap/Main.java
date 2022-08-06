package stack_heap;

public class Main {
    //value type || promitive type kieu nguyen thuy
    public static void updateAge(int age) {
        age++;
        System.out.println("age= " + age);
    }
    //ref type
    public static  void updateAge(Student pStudent) {
       pStudent.age +=1;
    }
    public  static  void  updateAge(Student pStudent, int newAge) {
        Student newStudent = new Student(pStudent.name, newAge);

    }
    public static void main(String[] args) {
        Student student = new Student("Nhat",10);

        updateAge(student.age);

        System.out.println(student);
        updateAge(student,20);
        System.out.println(student);
    }
}
