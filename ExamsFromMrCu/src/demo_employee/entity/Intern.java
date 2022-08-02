package demo_employee.entity;

import java.time.LocalDate;
import java.util.List;

public class Intern extends Employee{
    private String majors;
    private  String semester;
    private  String universityName;

    public Intern() {

    }

    @Override
    public void showInfo() {
        System.out.println(this);
    }

    public Intern(String majors, String semester, String universityName) {
        this.majors = majors;
        this.semester = semester;
        this.universityName = universityName;
    }

    public Intern(String id, String fullName, LocalDate birthDay, String phone, String email, List<Certificate> certificates, String majors, String semester, String universityName) {
        super(id, fullName, birthDay, phone, email, certificates);
        this.majors = majors;
        this.semester = semester;
        this.universityName = universityName;
    }

    public String getMajors() {
        return majors;
    }

    public void setMajors(String majors) {
        this.majors = majors;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }
    @Override
    public String toString() {
        return "Experience: \n" +
                "  Id :   " + id + '\'' +
                "  Full Name:   " + fullName + '\n' +
                "  Birth Day:   " + birthDay + '\n' +
                "  Phone:   " + phone + '\n' +
                "  Email:   " + email + '\n' +
                "  Certificates:   " + certificates + '\n' +
                "  Majors:    " + majors + '\n' +
                "  Semester:   " + semester + '\n' +
                "  University Name:   " + universityName;
    }
}

