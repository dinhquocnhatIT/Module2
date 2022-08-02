package demo_employee.entity;

import java.time.LocalDate;
import java.util.List;


public class Fresher extends Employee {
    private LocalDate graduationDate;
    private String graduationRank;
    private String education;

    public  Fresher() {

    }

    @Override
    public void showInfo() {
        System.out.println(this);
    }

    public Fresher(LocalDate graduationDate, String graduationRank, String education) {
        this.graduationDate = graduationDate;
        this.graduationRank = graduationRank;
        this.education = education;
    }

    public Fresher(String id, String fullName, LocalDate birthDay, String phone, String email, List<Certificate> certificates, LocalDate graduationDate, String graduationRank, String education) {
        super(id, fullName, birthDay, phone, email, certificates);
        this.graduationDate = graduationDate;
        this.graduationRank = graduationRank;
        this.education = education;
    }

    public LocalDate getGraduationDate() {
        return graduationDate;
    }

    public void setGraduationDate(LocalDate graduationDate) {
        this.graduationDate = graduationDate;
    }

    public String getGraduationRank() {
        return graduationRank;
    }

    public void setGraduationRank(String graduationRank) {
        this.graduationRank = graduationRank;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
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
                "  Graduation Date:    " + graduationDate + '\n' +
                "  Graduation Rank:   " + graduationRank + '\n' +
                "  University Name:   " + education;
    }
}
