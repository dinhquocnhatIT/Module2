package employee;

import java.time.LocalDate;

public class Intern extends Employee{
    private String majors;
    private String semester;
    private String university_name;
    Intern()  {}
    Intern(String majors, String semester, String university_name){
        this.majors = majors;
        this.semester = semester;
        this.university_name = university_name;
    }

    public Intern(String id, String fullName, LocalDate birthDay, String phone, String email, String employee_type, int employee_count, String majors, String semester, String university_name) {
        super(id, fullName, birthDay, phone, email, employee_type, employee_count);
        this.majors = majors;
        this.semester = semester;
        this.university_name = university_name;
    }

    @Override
    public void showInfo() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Intern Employee----------- " +
                super.toString() +
                "\n  Majors  :  '" + majors + '\'' +
                "\n  Semester  :  '" + semester + '\'' +
                "\n  University_name  :  '" + university_name + '\'';
    }
}
